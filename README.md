# zuul

How to execute:

1. Run following command to build zuul gateway and microservices at /zuul
        mvn clean install

2. Run following command to execute zuul gateway and microscervices, run from base folder of each project 
        mvn spring-boot:run

3. To test if micro services are working, hit http://localhost:8090/spring and http://localhost:8091/bike API's

4. To test zuul API gateway is working, and check if routing successfully to relative microservice hit following API's,
        http://localhost:8080/books/spring
        http://localhost:8080/vehicles/bike
