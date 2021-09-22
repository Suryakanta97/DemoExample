## Spring Cloud Bootstrap

This module contains articles about bootstrapping Spring Cloud applications

### Relevant Articles:

- [Spring Cloud – Bootstrapping](http://www.surya.com/spring-cloud-bootstrapping)
- [Spring Cloud – Securing Services](http://www.surya.com/spring-cloud-securing-services)
- [Spring Cloud – Tracing Services with Zipkin](http://www.surya.com/tracing-services-with-zipkin)
- [Spring Cloud Series – The Gateway Pattern](http://www.surya.com/spring-cloud-gateway-pattern)
- [Spring Cloud – Adding Angular 4](http://www.surya.com/spring-cloud-angular)
- [How to Share DTO Across Microservices](https://www.surya.com/java-microservices-share-dto)

### Running the Project

- First, you need a redis server running on the default port
- To run the project:
  - copy the appliction-config folder to c:\Users\{username}\ on Windows or /home/{username}/ on *nix. Then open a git bash terminal in application-config and run:
    - git init
    - git add .
    - git commit -m "First commit"
  - start the config server
  - start the discovery server
  - start all the other servers in any order (gateway, svc-book, svc-rating, zipkin)
