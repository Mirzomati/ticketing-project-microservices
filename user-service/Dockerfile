FROM eclipse-temurin:11-jre-alpine
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]