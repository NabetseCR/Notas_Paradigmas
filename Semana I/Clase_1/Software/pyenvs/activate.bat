@echo off
REM Activates the labenv virtual environment
SET ENV_PATH=%USERPROFILE%\pyenvs\.labenv

IF EXIST "%ENV_PATH%\Scripts\activate.bat" (
    CALL "%ENV_PATH%\Scripts\activate.bat"
    echo.
    echo labenv activated successfully!
) ELSE (
    echo labenv not found at %ENV_PATH%
    echo Please make sure the environment exists.
)
