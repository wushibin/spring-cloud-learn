FROM java:8-jdk
ADD eureka-server-1.0-SNAPSHOT.jar /eureka-server.jar
RUN bash -c 'touch /eureka-server.jar'
EXPOSE 8761
ENTRYPOINT ["java","-jar","/eureka-server.jar"]