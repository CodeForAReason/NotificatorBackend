Notificator Server
==================

The server of the Notificator project, built using `dropwizard <http://www.dropwizard.io>`_

Setup
=====

* Install JDK 8
* Install Maven
* Install Git
* clone this repo

and then run::

    mvn package
    java -jar target/NotificatorServer-0.0.1-SNAPSHOT.jar server configuration.yml

to test it visit one of the following urls:

* http://localhost:8080/hello-world
* http://localhost:8080/hello-world?name=Successful+Dropwizard+User
* http://localhost:8081/

  + follow the links there
