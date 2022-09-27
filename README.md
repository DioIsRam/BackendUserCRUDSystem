# Prueba técnica Usuarios

- Proyecto de Microservicio basado en java **spring boot** para el proyecto Usuario

## Tabla de contenido
1. [Herramientas usadas](#Herramientas usadas)
2. [Guia de uso](#guia-de-uso)
    - [Pre-requisitos](#pre-requisitos)
    - [Principales comandos](#principales-comandos)
    - [Despliegue local](#despliegue-local)
    - [Documentación código y API](#documentación-código-y-api)
    - [Endpoints CRUDS](#endpoints-cruds)
3. [Principales configuraciones](#principales-configuraciones)
    - [Variables de entorno](#variables-de-entorno)
    - [Persistencia](#persistencia)
    - [Javadoc ](#javadoc)
 

***
***
## Herramientas usadas

- **Arquitectura:** _Arquitectura en capas MVC_
- **Framework:**	_Spring boot_
- **Gestor de dependencias:** _Maven_
- **Persistencia:** _Spring data_
- **Base de datos:** _H2_
- **Documentación de código y APIs:** _Javadoc_

***
## Guía de uso

 _A continuación se presentan las instrucciones para poder ejecutar el código de forma local_

***
### Pre-requisitos

Se requiere tener configuradas las siguientes herramientas de manera local

- Java 8+ ( configurar variables de entorno)
    - https://www.java.com/es/download/help/java8_es.html
    - https://www.java.com/es/download/help/path_es.html

- Maven 3+ ( configurar variables de entorno)
    - https://maven.apache.org
- IDE o editor de código 

***
### Principales comandos

_El microservicio utiliza  maven y  perfiles para su ejecución , compilación y demás configuraciones._

_Compilación_
```
mvn clean compile
```
_Generación de artefacto con  ejecucion de pruebas_
```
mvn clean install
```

### Despliegue local

_Para desplegar de manera local con springboot_ `8080`
```
mvn spring-boot:run

````

***
### Documentación código y API

_La documentación con JAVADOC se genera al generar el artefacto (JAR)_

```
mvn clean install
```
- **Javadoc generado:** /target/apidocs/index.html

***
### Endpoints CRUDS
_El microservicio está basado en CRUDs y cuenta con los siguientes endpoints_

- Puerto springboot: **8080**

```
Create: (POST)  localhost:8080/user/add
```
```
Read: (GET)  http://localhost:8080/user/{id}
```
```
Update: (PUT)  http://localhost:8080/user/update/{id}
```
```
Delete: (DELETE) http://localhost:8080/user/delete/{id}
```
```
List: (GET)  localhost:8080/user/list
```

***
***
## Principales configuraciones
_Se describen las principales configuracion que se pueden realizar en el proyecto._

***
### Variables de entorno

_Las principales propiedades se configuran en el archivo_
```
/src/main/resources/application.properties
```
***
### Persistencia
_Para configurar la base de datos se ajustan, de manera general, las principales propiedades:_
```
/src/main/resources/application.properties

spring.datasource.url=jdbc:h2:./users2db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.h2.console.enabled = true

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

```
`Se deberá agregar el driver correspondiente en el pom.xml, asi como cualquier configuración adicional y específica`

***

### Javadoc
_Uso de javadoc_
```
Ej.

    /**
     * Solicita una entidad User por id.
     *
     * @param id int id del User
     * @return User
     */
```


