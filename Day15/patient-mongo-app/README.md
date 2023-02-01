#### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.6.4 and java as 11

#Add Spring web,mongo,junit dependencies

#### **#Build project**
```
mvn clean install
```

# Run
```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down

```
# training
## POST
```
curl --location --request POST 'localhost:8084/patient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"xyz",
    "patId":"pt123",
    "age":26,
    "gender":"male",
    "disease":"malaria"
}'```

## Get
```
curl --location --request GET 'localhost:8084/patient/read'
```

## Delete
```
curl --location --request DELETE 'localhost:8084/patient/delete?name=xyz'
```

## Getting inside container

docker exec -it <container-id> /bin/bash
mysql -u user -p
show databases;
use db;
show tables;
select * from user;
