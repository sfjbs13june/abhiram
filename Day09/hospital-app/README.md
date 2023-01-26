### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.7.8 and java as 11
#Add Spring web dependency

#### **#Build project**
```
mvn clean install
```

#### **Dockerization**
```
mvn install dockerfile:build
```

#### **List docker images**
```  
docker images
```

#### **List docker running container**
``` 
docker ps
```

#### **Running the application in docker container**
``` 
docker run -p 8080:8080 abhiram317/hospital-app:0.0.1-SNAPSHOT
```
