FROM openjdk:17
MAINTAINER DharamRawat
EXPOSE 2233
COPY target/TestApp.jar .
ENTRYPOINT ["java","-jar","/TestApp.jar"]
