FROM openjdk:11
ARG JAR_FILE=target/svg_converter-0.0.1.jar
COPY ${JAR_FILE} svg_converter-0.0.1.jar
ENTRYPOINT [ "java","-jar","/svg_converter-0.0.1.jar" ]