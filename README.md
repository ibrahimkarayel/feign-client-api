# Feign Api Demo Application

### Running the Project

1. With spring boot: 
    `mvn spring-boot:run`
  
2.  Run jar file 
    ` mvn clean package`   cd target  `java -jar feign-app.jar`

3. or run directly  `com.jowl.feign.FeignApiApplication`



#### H2 database
* Adding that parameters to application.properties


     spring.datasource.url=jdbc:h2:file:~/feign_db;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE;INIT=CREATE SCHEMA IF NOT EXISTS feign
     spring.datasource.username=sa
     spring.datasource.password=
     spring.jpa.properties.hibernate.default_schema=feign
        
and  

    connection URL: jdbc:h2:file:~/feign_db;AUTO_SERVER=TRUE
    owner: sa


#### Watch Video
[![course video](https://img.youtube.com/vi/c9eKImMdCa8/0.jpg)](https://youtu.be/c9eKImMdCa8)


[ibrahim karayel](https://www.linkedin.com/in/ibrahimkarayel/)
