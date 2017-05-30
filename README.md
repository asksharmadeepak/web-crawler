# WebCrawler

Repository for WebCrawler Project

It is spring boot based restful micro service.
Uses gradle for dependency management.
Used spring 4 annotation and configuration.

# How to build and run your solution

Run : ./gradlew build 

Copy the jar file from build/libs/webcrawlerwipro-0.0.1-SNAPSHOT.jar

# Run this command

$ java -jar build/libs/webcrawlerwipro-0.0.1-SNAPSHOT.jar

App will be available on localhost:8080 port , make sure there is no other process running on same port.
hit url  -  localhost:8080/sitemap 
Response will be the sitmap with url, last modified and change frequency paramater.

# What more we can do

we can create customize solution that works for every url, we passed by making url as path parameter
We can create downloadable xml so that we can directly upload this to google for crawling.
