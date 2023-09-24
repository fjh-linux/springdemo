FROM openjdk:8-jdk
ADD ./target/springdemo2023.jar /opt/app.jar
EXPOSE 8080
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' > /etc/timezone
WORKDIR /opt
CMD ["java","-jar","app.jar"]
