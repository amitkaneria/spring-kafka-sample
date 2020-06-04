# For Mac users, Kafka & Zookeeper can be installed as below
brew install kafka

# Start Kafka/Zookeeper processes as below
zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties & kafka-server-start /usr/local/etc/kafka/server.properties

# Create Kafka topic "test" with replication factor as 1, and partitions 1
kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test

# List all kafka topics for the bootstrap server given
kafka-topics --list --bootstrap-server localhost:9092

# Kafka CLI consumer that reads all the messages posted on topic
kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning

# Kafka CLI producer to post messages on Kafka topics
kafka-console-producer --bootstrap-server localhost:9092 --tic test

# Kafka API producer by calling Post API in the sample application
curl -X POST http://localhost:8080/api/message -d "yet more fun" -H "Content-Type: text/plain"

# Kafka API Consumer
This application listens to given bootstrap servers in application.yml file, and topics defined in the Receiver.java file

Please visit following URLs for more information:
https://github.com/stockgeeks/spring-kafka-app (Docker Image)
https://dev.to/thegroo/spring-kafka-producer-and-consumer-41oc 
https://codenotfound.com/spring-kafka-consumer-producer-example.html (Multi-broker system & Unit Tests)
