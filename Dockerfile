# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim
LABEL authors="carlaalvarez"

# Set the working directory
WORKDIR /app

# Copy the build artifact (assuming a JAR file)
COPY target/auth-service-0.0.1-SNAPSHOT.jar /app/auth-service-0.0.1-SNAPSHOT.jar

# Expose the port (replace 8080 with your app's port)
#EXPOSE 8080

# Define environment variables (optional, depends on your app's setup)
ENV DATABASE_URL=postgres://admin:DWyoDfHAtHmwypdcyh30DBgDpnKkM6Si@dpg-cs6kn1jqf0us73ef3270-a:5432/auth


# Run the application
ENTRYPOINT ["java", "-jar", "/app/your-app.jar"]
