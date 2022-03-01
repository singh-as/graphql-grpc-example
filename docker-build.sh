#!/bin/bash

gradle build

echo 'creating cost-service image'
docker build --label app=graphql-grpc -t cost-service cost-service/

echo 'creating document-service image'
docker build --label app=graphql-grpc -t document-service document-service/

echo 'creating api-graphql image'
docker build --label app=graphql-grpc -t api-graphql api-graphql/