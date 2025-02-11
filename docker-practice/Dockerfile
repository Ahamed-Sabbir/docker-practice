# Specify environment
FROM openjdk:17.0.1-jdk-slim

# Create an application directory
WORKDIR /app

# Copy Everything to the application directory
COPY build/libs/docker-practice-0.0.1-SNAPSHOT.jar /app/docker-practice.jar

# Expose port
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "docker-practice.jar"]