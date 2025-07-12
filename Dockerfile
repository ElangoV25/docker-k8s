FROM openjdk:21
COPY target/*.jar demo.jar
EXPOSE 8080
VOLUME /tmp
ENTRYPOINT ["java","-jar","demo.jar"]