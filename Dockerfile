FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/vwalletweb-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} vwalletweb.jar
ENTRYPOINT ["java","-jar","/vwalletweb.jar"]