# Spring Boot Actuator custom metrics published on Dynatrace example

This is an example on how to publish the Spring Boot Actuator custom metrics on Dynatrace.

After cloned the project, just modify the ```application.properties``` file properly and run the app with the following command:

```
mvn spring-boot:run
```

The custom metrics will be published under the **Technologies** page of your Dynatrace instance.

Useful links:

* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html).
* [Micrometer](https://micrometer.io/).
* [Micrometer/Dynatrace integration](https://micrometer.io/docs/registry/dynatrace).
