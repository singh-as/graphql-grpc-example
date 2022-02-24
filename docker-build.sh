#!/bin/bash

gradle build

echo 'creating cost-service image'
docker build -t cost-service cost-service/

echo 'creating document-service image'
docker build -t document-service document-service/

echo 'creating api-graphql image'
docker build -t api-graphql api-graphql/