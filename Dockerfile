FROM openjdk:8
EXPOSE 8080
ADD target/m2gl-pipeline.jar m2gl-pipeline.jar
ENTRYPOINT [ "java","-jar", "/m2gl-pipeline.jar" ]