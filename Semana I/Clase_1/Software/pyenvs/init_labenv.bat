@echo off
REM Script para crear/activar el ambiente y luego instalar paquetes desde requirements.txt
REM Uso: init_labenv.bat C:\ruta\a\requirements.txt

if "%~1"=="" (
    echo ERROR: Debe pasar la ruta completa al archivo requirements.txt como parametro.
    echo Ejemplo:
    echo    init_labenv.bat C:\Users\Desktop\requirements.txt
    goto :EOF
)

set REQ_FILE=%~1
set ENV_PATH=%USERPROFILE%\pyenvs\.labenv

REM Crear ambiente si no existe
if not exist "%ENV_PATH%" (
    echo Creando ambiente virtual en %ENV_PATH% ...
    python -m venv "%ENV_PATH%"
) else (
    echo Ambiente virtual ya existe en %ENV_PATH%
)

REM Activar ambiente
call "%ENV_PATH%\Scripts\activate.bat" 

REM Instalar paquetes
echo Instalando paquetes desde %REQ_FILE% ...
REM pip install --upgrade pip
echo .
echo 1. (Re)instalando pip
python.exe -m pip install --upgrade pip

echo .
echo 2. Instalando resto de paquetes
pip install -r "%REQ_FILE%"

echo.
echo Ambiente listo y paquetes instalados.
python -m ipykernel install --user --name .labenv --display-name "Python (.labenv)"
pause
