FROM registry.cn-hangzhou.aliyuncs.com/yc-kubernetes/openjdk-alpine-skywalking:tini-skywalking8.0-arthas
MAINTAINER Yang xiaowei <yangxw@ikangtai.com>
ARG JAR_FILE
ADD target/${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["/sbin/tini", "--"]
CMD [ "sh", "-c", "java $JAVA_OPTS   -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]


#FROM openjdk:8-jdk-alpine
#MAINTAINER yangxw@ikangtai.com
#ARG JAR_FILE
#ADD target/${JAR_FILE} app.jar
#ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]