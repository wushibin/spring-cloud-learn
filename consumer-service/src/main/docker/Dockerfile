FROM java:8-jdk
ADD consumer-service-1.0-SNAPSHOT.jar /consumer-service.jar
RUN bash -c 'touch /consumer-server.jar'
EXPOSE 8888
ENTRYPOINT ["java","-jar","/consumer-service.jar"]