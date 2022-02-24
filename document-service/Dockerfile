# Create image from latest version of tomcat8 and jre8

FROM openjdk:11-jre-slim
VOLUME /tmp
COPY build/libs/document-service-*.jar document-service.jar

ENTRYPOINT ["java","-jar","/document-service.jar"]

# Expose our port so clients can communicate to your app
EXPOSE 9091