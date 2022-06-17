FROM eclipse-temurin:18.0.1_10-jre-alpine
VOLUME /tmp
COPY target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
