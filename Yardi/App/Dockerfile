FROM rockylinux:9.1.20230215
ENTRYPOINT ["tail", "-f", "/dev/null"] 
RUN yum update -y
RUN yum install -y java-1.8.0-openjdk-devel
RUN echo "export JAVA_HOME=$(dirname $(dirname $(readlink -f $(type -P java))))" > /etc/profile.d/javahome.sh
RUN export JAVA_HOME
ADD Site.java /
WORKDIR /
RUN javac Site.java && java Site >> result.txt



