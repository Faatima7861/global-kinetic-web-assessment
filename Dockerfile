#java version 
#FROM openjdk:8u191-jre-alpine3.8 
FROM maven:3.3-jdk-8-alpine


COPY ./. /

RUN ls
ENTRYPOINT mvn test > test-output/webResults.txt

