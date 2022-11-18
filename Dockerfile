FROM openjdk:8
EXPOSE 8081
ADD target/spring-mysql.jar spring-mysql.jar
ENTRYPOINT ["java","-jar","/spring-mysql.jar"]