#### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.6.4 and java as 11

#Add Spring web,mongo,junit dependencies

## Build the app
``` 
mvn clean install
```

## Run the app
``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down
```

## Post
``` 
curl --location --request POST 'localhost:8083/customer/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"ravi",
    "custId":"rv123",
    "address":"Vizag"
}'

curl --location --request POST 'localhost:8083/student/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"vamsi",
    "std":"9th",
    "roll":"23"
}'
```

## Get
``` 
curl --location --request GET 'localhost:8083/customer/read'

curl --location --request GET 'localhost:8083/student/read'
```

## Put
``` 
curl --location --request PUT 'http://localhost:8083/customer/update?custId=rv124&name=ravi' 
```

## Delete
```
curl --location --request DELETE 'http://localhost:8083/customer/delete?name=ravi' 
```


## Show data
```
docker exec -it spring-mongo-app-mongo-1 bash

mongo

show dbs

show tables

db.customer.find()

```

## Dockerization

### Maven 
Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login

$ docker push <repository-name>/<app-name>

```

