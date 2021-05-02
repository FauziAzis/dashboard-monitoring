### Belajar REST menggunakan Java Spring Boot Untuk Proyek Aplikasi Dashboard

**Requirements**
* Maven 3.0+
* IDE(IntelliJ)
* JDK 1.8+
* MYSQL database server (_bisa mengguanakan Docker_)
* Postman 

**Dependencies**
* WEB
* JPA
* Hibernate validator
* MYSQL

**application.properties**
```$xslt
#Konfigurasi Server
server.port=8080

# Konfiguraso Database
spring.datasource.url=jdbc:mysql://localhost:3306/dashboard
spring.datasource.username=springuser
spring.datasource.password=springpassword

# Konfigurasi Hibernate
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# Create Table
spring.jpa.generate-ddl=true

#spring.jpa.hibernate.ddl-auto=validate
```
###Poin-poin pada Project
* Aplikasi dapat diakses pada alamat `http://localhost:8080/services/`
* Output dalam format JSON _Pageable_
* Primary key mengguanakan `@GenericGenerator(name = "uuid", strategy = "uuid2")`
* Pengujian input dapat menggunakan Postman dengan Format JSON sebagai berikut :
    * Service
    ```
    {
    	"serviceName": "BI-SSSS Core",
    	"serviceType": "Web Service",
    	"serviceEndpoint": "hhtp",
    	"groupId": {
    		"serviceGroupId": "XXX",
    	}
    }
    ```
    * Service Group
    ```
    {
    	"serviceGroupName": "BI-RTGS",
    	"serviceGroupCategory" : "SISTEM PEMBAYARAN"
    }
    
    ```

    
