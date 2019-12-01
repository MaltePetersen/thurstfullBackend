# Thurstful Backend

This is the backend of the [thurstful project](https://gitlab.com/mobile-anwendung/ma-applikation/tree/master/wicolo).
A version of this backend is already deployed using the cloud service heroku it can be found [here](https://springwicolo.herokuapp.com/).
### Prerequisites

You will need to install [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and
[Maven](https://maven.apache.org/install.html) to run this application.

### Installing

A step by step series of examples that tell you how to get a development env running

To start the application run this command in this folder 
```
mvn spring-boot:run
```

The application should now run on:
```
localhost:8080
```
It has the following endpoints:

| HTTP request methods | Endpoint URL |
| ------ | ------ |
| GET | /version |
| POST | /sentence | 
| GET | /sentences |
| GET | /sentence/{id} | 

