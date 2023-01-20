#### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.7.7 and java as 11
#Add Spring web dependency

#### **#Build project**
```
mvn clean install
```

#### **#Run the application**
```
mvn spring-boot:run
```
#### **#Test application**
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C01FFC763B5AA153ED6962309420FA76' \
--data-raw '{
    "id" : "123",
    "name" : "pat123",
    "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request PUT 'localhost:8080/patient/update?disease=fever' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C01FFC763B5AA153ED6962309420FA76' \
--data-raw '{
    "id" : "123",
    "name" : "pat123",
    "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'
```
#Add spring security dependency
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cmFtOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C01FFC763B5AA153ED6962309420FA76' \
--data-raw '{
    "id" : "123",
    "name" : "pat123",
    "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request PUT 'localhost:8080/patient/update?disease=fever' \
--header 'Authorization: Basic YWJoaTpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C01FFC763B5AA153ED6962309420FA76' \
--data-raw '{
    "id" : "123",
    "name" : "pat123",
    "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'
```
