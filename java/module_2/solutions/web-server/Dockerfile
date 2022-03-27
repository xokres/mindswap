FROM openjdk:17-alpine
COPY ./src/ /app
WORKDIR /app
RUN javac ./academy/mindswap/WebServer.java
#COPY /out/production/web-server/ /app
ENV PORT=8080
COPY ./www/ /app/www
#WORKDIR /app
ENTRYPOINT ["java","academy.mindswap.WebServer"]