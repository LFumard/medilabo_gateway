FROM openjdk:17
ADD target/medilabo_gateway-0.0.1-SNAPSHOT.jar medilabo_gateway.jar
ENTRYPOINT ["java","-jar","/medilabo_gateway.jar"]
EXPOSE 8888