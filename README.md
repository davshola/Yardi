# Solution

The solution to question 1 and 2 is contained in the folder App. This folder contains two files: Site.java and a Docker file.

To run the application, enter the following commands in terminal, while inside the App folder:
javac Site.java 
java Site

To run as a Docker container, enter the following commands in terminal, while inside the App folder:
docker build . -t javaapp 
docker run -d javaapp. 

QUESTION 3
The solution to question 3 is contained in the folder APP-Refactored. This folder contains a Docker file, a java jar and a sub folder name spring-site. Spring-site contains the source code for the Springboot application. The application accepts a Json payload and only json is supported. Below is a sample payload and curl request for the application. The application listens on port 8080 and the URL is 'http://localhost:8080/users'.

{
  "siteName":"www.yahoo.com"

}

curl --location --request GET 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data '{
  "siteName":"www.yahoo.com"

}'

To run the application from terminal, while inside the App-Refactored folder
java -jar java -jar spring-site-0.0.1-SNAPSHOT.jar, 

To run the Docker Container from terminal, while inside the App-Refactored folder:
docker build . -t javaapp
docker run -d -p 8080:8080 javaapp, 


QUTESTION 4 
The solution to question 4 is contained in the folder APP-nginx, this folder contains a Docker file, nginx configuration file, a java jar and a bash script.  The application accepts a Json payload and only json is supported. Below are sample paylod for the application. The application listens on port 80 and the URL is 'http://localhost/'. A single docker container is used for the java application and nginx Server. 

To run the Docker Container from terminal, while inside the APP-nginx folder
docker build . -t javaapp
docker run -d -p 80:80 javaapp

{
  "siteName":"www.yahoo.com"

}

curl --location --request GET 'http://localhost/' \
--header 'Content-Type: application/json' \
--data '{
  "siteName":"www.yahoo.com"

}'
