#!/bin/bash

echo "Starting Spring Boot and React..."

# Start Spring Boot backend in the background and log output to backend.log
echo "Starting Spring Boot backend..."
if [[ ! -f "mvnw" ]]; then
    echo "Error: mvnw not found! Make sure you are in the correct directory."
    exit 1
fi
./mvnw spring-boot:run > backend.log 2>&1 & echo $! > backend.pid

# Start React frontend in the background and log output to frontend.log
if [[ ! -d "ui" ]]; then
    echo "Error: 'ui' directory not found!"
    exit 1
fi

cd ui

if [[ ! -f "package.json" ]]; then
    echo "Error: package.json not found! Make sure you are in the correct directory."
    exit 1
fi

echo "Starting React frontend..."
npm run start > ../frontend.log 2>&1 & echo $! > ../frontend.pid

cd ..

echo "Both applications are now running in the background!"
echo "Check backend.log and frontend.log for output."
echo "To stop them, run: ./stop_project.sh"
