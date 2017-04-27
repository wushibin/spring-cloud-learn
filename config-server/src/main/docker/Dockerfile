FROM java:8-jdk
ADD config-server-1.0-SNAPSHOT.jar /config-server.jar
RUN bash -c 'touch /config-server.jar'
EXPOSE 8888
ENTRYPOINT ["java","-jar","/config-server.jar"]