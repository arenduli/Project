## How to start Backend (BE) on the localhost:

PostgreSQL database (DB) should be installed first, or started in the Docker container.

You can start in Docker database and pgAdmin4 with docker-compose, with the following command execution in the terminal under the Project root
:

`docker -compose up`

pgAdmin4 for DB visualisation will be started on the location: http://localhost:5050

To stop local services in Docker run with docker-compose, execute the following command:

`docker-compose down`

Build BE with the following command execution in the project root:

`mvn clean install`

Run the application:  

`com.example.BackendApplication`

If all it finished successfully, REST API for Products you can check on this location:
http://localhost:8080/api/v1/products/
