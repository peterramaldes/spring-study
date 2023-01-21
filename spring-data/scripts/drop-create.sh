#/bin/bash

(cd ../ && mvn clean flyway:clean flyway:migrate)
