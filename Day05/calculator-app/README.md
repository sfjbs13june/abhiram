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
#Add junit dependency in pom.xml file

#### **#Test application**
```
curl --location --request GET 'localhost:8080/add?x=30&y=15'

curl --location --request POST 'localhost:8080/sub?x=30&y=15'

curl --location --request PUT 'localhost:8080/mul?x=30&y=15'

curl --location --request DELETE 'localhost:8080/div?x=30&y=15'
```

#### **#Coverage**

#Run All tests with coverage(right click on project)

#Output of code coverage is:
```
#for Class  -  100%

#for Method -  80%

#for Line   -  85%
```