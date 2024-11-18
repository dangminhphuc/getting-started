#!/bin/bash

# Step 1: Build the Spring Boot application
echo "Building the Spring Boot application..."
./mvnw clean package -DskipTests

# Check if the build was successful
if [ $? -ne 0 ]; then
    echo "Build failed. Exiting."
    exit 1
fi

# Step 2: Build the Docker image
echo "Building the Docker image..."
docker build -t spring-boot-app .

# Check if the Docker build was successful
if [ $? -ne 0 ]; then
    echo "Docker image build failed. Exiting."
    exit 1
fi

# Step 3: Run the Docker container
echo "Running the Docker container..."
docker run -p 8080:8080 spring-boot-app

echo "Application is running on http://localhost:8080"
