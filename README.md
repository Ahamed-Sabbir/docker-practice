# Docker Commands Guide

This repository contains frequently used Docker commands for managing containers and images efficiently.

## List All Containers (Running and Stopped)
```sh
docker ps -a
```

## List All Images
```sh
docker images
```

## Delete a Container
```sh
docker rm <container_id_or_name>
```

## Delete an Image
```sh
docker rmi <image_id_or_name>
```

## Create a Docker Image with a Specific Name
```sh
docker build -t <image_name>:<tag> <path_to_dockerfile>
```

## Run a Container with a Specific Name
```sh
docker run --name <container_name> <options> <image_name>:<tag>
```

## Stop a Running Container
```sh
docker stop <container_name>
```

## Restart a Stopped Container
```sh
docker restart <container_name>
```

## Remove a Container After Stopping
```sh
docker run --rm <options> <image_name>:<tag>
```

## Explore the Internal File Structure of a Running Container
```sh
docker exec -it <container_name_or_id> /bin/bash
```

## Add Bind Mount Volume While Running a Container
```sh
docker run -v /host/path:/container/path --name <container_name> <options> <image_name>:<tag>
sudo docker run -v ./logs:/app/logs --name docker-practice -p 8081:8081 docker-practice:v1
```

### Notes:
- Replace placeholders (`<container_name>`, `<image_name>`, `<tag>`, etc.) with actual values.
- Use `docker ps` to see only running containers.
- Be cautious when deleting images and containers as this action is irreversible.

Happy Dockerizing! 🚀

