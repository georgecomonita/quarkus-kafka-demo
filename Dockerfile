FROM eclipse-temurin:17-jdk-alpine
COPY target/quarkus-app /app
WORKDIR /app
CMD ["java", "-jar", "quarkus-run.jar"]