This is a demo for using Kafka with the Spring framework in Java. The kafka-consumer directory is a full spring project that will listen for a specific topic that you can change in the source code. The kafka-producer directory is a full spring project that can publish to a certain topic from a url (localhost:8081). The kafka_2.11-2.0.0 directory has the files needed to start a kafka server.

**How to run:**

First, get the kafka server up and running. To do this, cd into kafka_2.11-2.0.0 and start a zookeeper server instance: `bin/zookeeper-server-start.sh config/zookeeper.properties`

Next, get the kafka server running: `bin/kafka-server-start.sh config/server.properties`

Now that we have a kafka server running, you can make a topic and post to it: `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic <NAME-OF-TOPIC-HERE>`

Now, open kafka-consumer and kafka-producer in your favorite IDE (Intellij or eclipse) and run them. Once you have them both running, the consumer will listen and consume messages posted to the topic you make. The producer will allow you to publish messages to your topic at localhost:8080/kafka/publish/<YOUR-MESSAGE-HERE>

*NOTE*

You have to change the topics in the consumer and producer projects.

In consumer, it is located at src/main/java/com.kafka.kafkaconsumer.listener/KafkaConsumer.java on line 9. Change `topics = "baeldung"` to whatever topic you named yours. 

In producer, it is located at src/main/java/com.kafka.kafkaproducer.resource/UserResource.java on line 17. Change `TOPIC = "baeldung";` to whatever topic you named yours.