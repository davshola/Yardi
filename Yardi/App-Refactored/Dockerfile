FROM rockylinux:9.1.20230215
RUN yum update -y
RUN yum install -y java-1.8.0-openjdk-devel
ADD spring-site-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-site-0.0.1-SNAPSHOT.jar"]

