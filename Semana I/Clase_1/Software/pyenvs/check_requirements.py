import pkg_resources
import sys
from pathlib import Path

def check_requirements(req_file_path):
    req_path = Path(req_file_path)

    if not req_path.exists():
        print(f"[✘] File not found: {req_file_path}")
        return

    with req_path.open("r", encoding="utf-8") as f:
        lines = f.readlines()

    requirements = []
    for line in lines:
        line = line.strip()
        if not line or line.startswith("#"):
            continue
        requirements.append(line)

    print(f"\nChecking {len(requirements)} packages listed in: {req_file_path}\n")

    for req in requirements:
        try:
            pkg_resources.require(req)
            print(f"[✔] {req}")
        except pkg_resources.DistributionNotFound:
            print(f"[✘] Not installed: {req}")
        except pkg_resources.VersionConflict as e:
            print(f"[⚠] Version mismatch: {req}")
            print(f"    Installed: {e.dist}, Required: {e.req}")

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Missing argument: Trying using default file requirements.txt")
        check_requirements('requirements.txt')
    else:
        check_requirements(sys.argv[1])
