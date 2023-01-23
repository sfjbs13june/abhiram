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
curl --location --request POST 'localhost:8082/patient/save' \
--header 'Authorization: Basic cmFtOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=66BD2773DB7F66099885BCB6275860DD' \
--data-raw '{
    "id" : null,
    "name" : "pat123",
    "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request POST 'localhost:8082/patient/save' \
--header 'Authorization: Basic cmFtOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=66BD2773DB7F66099885BCB6275860DD' \
--data-raw '{
    "id" : "123",
    "name" : null,
    "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request POST 'localhost:8082/patient/save' \
--header 'Authorization: Basic cmFtOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=6823F72AD27A84EBCADA604D1F126EF8' \
--data-raw '{
    "id" : "123",
    "name" : "pat123",
    "age" : null,
    "gender" : "male",
    "disease" : "bacterial"
}'

curl --location --request POST 'localhost:8082/patient/save' \
--header 'Authorization: Basic cmFtOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=75AA3157BE694034123A152AAFDAC3BD' \
--data-raw '{
    "id" : "123",
    "name" : "pat123",
    "age" : "30",
    "gender" : null,
    "disease" : "bacterial"
}'

curl --location --request POST 'localhost:8082/patient/save' \
--header 'Authorization: Basic cmFtOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=66268A06D93D5B1651AE7E4D3BEA4CB1' \
--data-raw '{
    "id" : "123",
    "name" : "pat123",
    "age" : "30",
    "gender" : "male",
    "disease" : null
}'
```
