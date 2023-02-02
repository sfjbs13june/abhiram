#### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.7.0 and java as 11

## Build
```
mvn clean install
```

## Run
```
docker-compose -f docker-compose-artemis.yml up -d

artemis-demo-producer> mvn spring-boot:run
```

## Send some message though producer
```
curl --location --request GET 'http://localhost:1230/send?msg=hello'
```

## Start consumer
```
artemis-demo-consumer> mvn spring-boot:run
```

## Stop Container
```
docker-compose -f docker-compose-artemis.yml down
```

## Show data::

http://localhost:8161/


