#### **#Create Springboot project**

https://start.spring.io/

## Build
```
mvn clean install
```

## Run
```
docker-compose -f docker-compose-rabbitmq.yml up -d

rabbitmq-app-producer> mvn spring-boot:run
```

## Test
```
curl --request POST 'localhost:8080/rabbitmq/hospital' \--header 'Content-Type: application/json' \--data-raw '{"name":"raghu","hosId":"24","address":"Hyderabad"}

curl --request POST 'localhost:8080/rabbitmq/patient' \--header 'Content-Type: application/json' \--data-raw '{"patientName":"subash","patId":"atg34","gender":"male","age":"25"}'

rabbitmq-app-consumer> mvn spring-boot:run
```

## Show data on browser::
```
http://localhost:15672/

user-name:guest

password:guest
```

## Stop Container
```
docker-compose -f docker-compose-rabbitmq.yml down
```