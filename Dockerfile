FROM amazoncorretto:17-alpine-jdk
MAINTAINER  ANGEL
COPY target/vwalletweb-0.0.1-SNAPSHOT.jar vwalletBackend.jar
ENTRYPOINT ["java","-jar","/vwalletBackend.jar"]