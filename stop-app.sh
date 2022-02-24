#!/bin/bash

echo 'Stopping app'
docker stop $(docker ps --filter "label=app=graphql-grpc" -q)