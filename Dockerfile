FROM openjdk:21
ARG JAR_FILE=target/sprjenkin.jar
ADD ${JAR_FILE} sprjenkin.jar
ENTRYPOINT [ "java", "-jar", "sprjenkin.jar" ]
EXPOSE 8081