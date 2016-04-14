# garfield-manufacturing
The manufacturing component of the SWEN-343 project

## Building / Deploying
From the command line, you can build the project through Maven.  A
simple `mvn package` will produce a fat JAR of the project under `target/`.
From there, you can run the project by running `java -jar
target/garfield-manufactring-VERSION.jar server`, which will launch a server
running on the default port (8080 for application, 8081 for administration).
You can use this to deploy the server as well.

## Technologies Used:
* [Dropwizard][dropwizard] - a framework for developing RESTful web apps
* [Lombok][lombok] - a way to reduce writing boilerplate code for objects

[dropwizard]: http://www.dropwizard.io/
[lombok]: https://projectlombok.org/
