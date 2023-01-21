#!/bin/bash

curl -X POST http://localhost:8080/customer \
  -H "Content-Type: application/json" \
  -d '{"name": "Peter Admilson Ramaldes", "age": 27}'

