FROM java:8

EXPOSE 8080 8443

ADD /build/libs/app.jar app.jar

ENTRYPOINT [ "java","-jar","/app.jar" ]