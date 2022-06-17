# OteMqttClient
Poll Ochsner OTE (based on RC7000 developed by TEM) and publish the values via MQTT

A readily usable docker image can be found at https://hub.docker.com/repository/docker/mathismoder/ote-mqtt-client

The configuration values can be overriden using springboot mechanics
* starting the jar with added config location e.g. "--spring.conf.location=./application.yaml" any values can be overriden in that file
* starting the jar with actual values e.g. "--ote.host=192.168.1.2 --mqtt.uri=tcp://192.168.1.3:1883"
* when compiling you can easy modify the existing application.yaml

Base configuration see src/main/resources/application.yaml

```
ote:
  host: 127.0.0.1
  port: 8080
  user: USER
  password: 123
  delay: 10000 # frequency to poll the next oid from OTE
  oids:
    - /1/2/5/119/0
    - /1/2/5/119/1
    - /1/2/5/119/4
    - /1/2/5/119/5
    - /1/2/7/121/0
    - /1/2/7/121/1
    - /1/2/1/125/0
    - /1/2/1/125/1
    - /1/2/1/125/2
    - /1/2/1/125/3
    - /1/2/1/125/4
    - /1/2/1/125/5
    - /1/2/1/125/6
    - /1/2/1/125/7
    - /1/2/1/125/8
    - /1/2/1/125/9
mqtt:
  uri: tcp://192.168.1.2:1883
  user:
  password:
  basetopic: sensors/heatpump/ote # this gets prepended with the oid
disabled-logging:
  level:
    root: TRACE
    org.springframework.web: DEBUG
    org.springframework.ws.client.MessageTracing.sent: DEBUG
    org.springframework.ws.server.MessageTracing.sent: DEBUG
    org.springframework.ws.client.MessageTracing.received: TRACE
    org.springframework.ws.server.MessageTracing.received: TRACE
```
