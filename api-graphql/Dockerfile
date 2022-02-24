# Create image from latest version of tomcat8 and jre8

FROM openjdk:11-jre-slim
VOLUME /tmp
COPY build/libs/api-graphql-*.jar api-graphql.jar

ENTRYPOINT ["java","-jar","/api-graphql.jar"]

# Expose our port so clients can communicate to your app
EXPOSE 8080