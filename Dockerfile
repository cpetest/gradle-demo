FROM 100.79.1.215:20202/op_svc_servicestage/openjdk:8-slim-int

WORKDIR /home/apps/

COPY build/libs/*.jar app.jar

RUN sh -c 'touch app.jar'

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar -Xmx256m app.jar" ]