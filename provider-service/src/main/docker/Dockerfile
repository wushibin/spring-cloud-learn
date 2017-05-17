FROM java:8-jdk
ADD provider-service-1.0-SNAPSHOT.jar /provider-service.jar
RUN bash -c 'touch /provider-server.jar'
EXPOSE 8888
ENTRYPOINT ["java","-jar","/provider-service.jar"]