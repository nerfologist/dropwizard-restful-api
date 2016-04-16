# Dropwizard restful API

A shot at building a very simple RESTful, Ruby On Rails-like pure JSON API with DropWizard and JDBI.

## Requirements
- maven
- Java 8

## Building the project
`mvn clean package [-DskipTests]`

## Starting the server
`java -jar target/dropwizard-restful-api-1.0-SNAPSHOT.jar server config.yml`

## Example calls
```
GET localhost:8080/contacts
GET localhost:8080/contacts/1
DELETE localhost:8080/contacts/1
POST localhost:8080/contacts
PUT localhost:8080/contacts/1
```