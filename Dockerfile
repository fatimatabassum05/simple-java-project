FROM ubuntu:latest as builder

RUN apt update && apt install -y git && apt-get install -y maven

RUN git clone https://github.com/fatimatabassum05/simple-java-project.git

WORKDIR /simple-java-project

RUN mvn clean install

FROM tomcat:9.0

COPY --from=builder /java-example/target/*.war /usr/local/tomcat/webapps

CMD ["catalina.sh", "run"]
