#!/bin/bash

echo "Starting Spring Boot and React..."

# Start Spring Boot backend
echo "Starting Spring Boot backend..."
if [[ ! -f "mvnw" ]]; then
    echo "Error: mvnw not found! Make sure you are in the correct directory."
    exit 1
fi
gnome-terminal -- bash -c "./mvnw spring-boot:run; exec bash"

# Start React frontend
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
gnome-terminal -- bash -c "npm run start; exec bash"

cd ..

echo "Both applications are now running!"
