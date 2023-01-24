#### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.7.8 and java as 11
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
curl --location --request GET 'localhost:8080/get/students' \
--header 'Cookie: JSESSIONID=66268A06D93D5B1651AE7E4D3BEA4CB1'

curl --location --request GET 'localhost:8080/map/students' \
--header 'Cookie: JSESSIONID=66268A06D93D5B1651AE7E4D3BEA4CB1'

```