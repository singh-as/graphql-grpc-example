#!/bin/bash

docker network create --driver bridge graphql-grpc-network || true

docker run -d --rm --network graphql-grpc-network --name cost-service --label app=graphql-grpc cost-service:latest

docker run -d --rm --network graphql-grpc-network --name document-service --label app=graphql-grpc document-service:latest

docker run -d --rm --network graphql-grpc-network --name api-graphql -p 8080:8080 --label app=graphql-grpc api-graphql:latest