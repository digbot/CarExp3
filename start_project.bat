@echo off
title Starting Spring Boot and React...

:: Start Spring Boot backend
echo Starting Spring Boot backend...
start "Spring Boot" cmd /k "call mvnw spring-boot:run"

:: Start React frontend
echo Starting React frontend...
cd ui
start "React App" cmd /k " call npm run start"
cd ..

echo Both applications are now running!
exit
