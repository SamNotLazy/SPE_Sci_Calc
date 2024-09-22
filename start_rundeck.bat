set CURDIR=%~dp0
call %CURDIR%etc\profile.bat
java %RDECK_CLI_OPTS% %RDECK_SSL_OPTS% -jar rundeck-5.6.0-20240912.war --skipinstall -d  >> %CURDIR%\var\logs\service.log  2>&1
