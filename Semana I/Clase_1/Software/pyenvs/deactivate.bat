@echo off
REM Activates the labenv virtual environment
SET ENV_PATH=%USERPROFILE%\pyenvs\.labenv

IF EXIST "%ENV_PATH%\Scripts\deactivate.bat" (
    CALL "%ENV_PATH%\Scripts\deactivate.bat"
    
) ELSE (
    echo labenv not found at %ENV_PATH%
   
)