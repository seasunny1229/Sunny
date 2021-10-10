FROM java:8
VOLUME /tmp
COPY target/Gateway-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]