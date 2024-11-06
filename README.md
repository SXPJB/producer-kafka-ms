# Producer-Kafka-ms

## Description

This is a simple API that allows you to perform produce kafka messages. It was developed using Kotlin and Spring Boot,
and can be built and run with Gradle.

## Pre-requisites

- Java 17
- Gradle 8.2 or later
- Latest version of Postgres
- Docker

## Installation

1. Clone the repository: `git clone https://github.com/SXPJB/producer-kafka-ms.git`
2. Open the project in your favorite IDE (IntelliJ IDEA is recommended)
3. Run boostrap script: `./bootstrap.sh` in case of Linux or `docker-compose up` in case of Windows
4. Download the dependencies with Gradle: `./gradlew build`
5. Run the application: `./gradlew run`
6. Configure the environment variables in your ide or replace the value in application.yml file
7. Enjoy!

## Project Structure

The project follows the standard structure of a Spring Boot project with Gradle:

- `src/main/kotlin`: This is where all the Java source code files are located.
- `src/main/resources`: This is where resource files, such as application configurations, are located.
- `src/test`: This is where all the test files are located.