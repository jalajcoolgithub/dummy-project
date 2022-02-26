FROM openjdk:8
VOLUME /tmp
ADD /target/test.jar test.jar
ENTRYPOINT ["java","-jar","/test.jar"]
EXPOSE 8080