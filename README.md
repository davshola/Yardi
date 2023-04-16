# Solution to task

This folder contains two files: Site.java and a Docker file.

To run the application, enter the following commands in terminal, javac Site.java and java Site, while inside the App folder.
To run as a Docker container, from terminal , docker build . -t javaapp and docker run -d javaapp. This should be executed while in the App folder

QUESTION 3
The solution to question 3 is contained in the folder APP-Refactored. This folder contains a Docker file, a java jar and a sub folder name spring-site. spring-site contains the source code for the Springboot application. The application accepts a Json payload and only json is suppoted. Below are sample paylod for the application. The application listens on port 8080 and the URL is http://localhost:8080/users.

{
  "siteName":"www.yahoo.com"

}

curl --location --request GET 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data '{
  "siteName":"www.yahoo.com"

}'

To run the application from terminal: java -jar java -jar spring-site-0.0.1-SNAPSHOT.jar, while inside the App-Refactored folder
To run the Docker Container:  docker build . -t javaapp and docker run -d -p 8080:8080 javaapp, while inside the App-Refactored folder


QUTESTION 4 
The solution to question 4 is contained in the folder APP-nginx,This folder contains a Docker file, nginx configuration file ,a  java jar and a bash script.  The application accepts a Json payload and only json is suppoted. Below are sample paylod for the application. . The application listens on port 80 and the URL is http://localhost/ A single docker container is used both for the java application  and nginx Server. 

To run the Docker Container  docker build . -t javaapp and docker run -d -p 80:80 javaapp, while inside the App-Refactored folder

{
  "siteName":"www.yahoo.com"

}

curl --location --request GET 'http://localhost/' \
--header 'Content-Type: application/json' \
--data '{
  "siteName":"www.yahoo.com"

}'
