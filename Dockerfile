FROM openjdk:17
WORKDIR /src
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew build
ENTRYPOINT ["java", "-jar", "/myapp/main.jar"]
