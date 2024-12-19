# kafka-springboot-integration
This repository demonstrates the integration of Apache Kafka with Spring Boot to build event-driven, real-time applications. It includes Kafka Producer and Consumer implementations for publishing and consuming messages, along with configurations for Kafka Topics and Brokers. The project showcases efficient message streaming.

![image](https://github.com/user-attachments/assets/9c23eb5a-5604-439c-9329-6ba638066e53)


![image](https://github.com/user-attachments/assets/198d9675-8bd4-4d7d-8dfc-98cb87b22667)


# Apache Kafka

Apache Kafka is a distributed streaming platform used as a message broker. It processes real-time data feeds with high throughput and low latency. Typical use cases include flights data, sensors data, stocks data, news data, and social media data.

## Key Features
- **Publisher-Subscriber Model**: Kafka works on this model to handle messaging between producers and consumers.

## Kafka Terminology
- **Zookeeper**: Coordinates and manages Kafka brokers.
- **Kafka Server**: The broker responsible for receiving and storing messages.
- **Kafka Topic**: Logical channel to which messages are sent by producers and received by consumers.
- **Message**: The data sent to Kafka Topics.
- **Publisher**: The producer that sends messages to Kafka Topics.
- **Subscriber**: The consumer that reads messages from Kafka Topics.

## Kafka APIs
- **Connector API**: To connect Kafka with external systems.
- **Publisher API**: For sending messages to Kafka Topics.
- **Subscriber API**: For consuming messages from Kafka Topics.
- **Streams API**: To process data in real-time.

## Spring Boot + Apache Kafka Application

### Step-by-Step Guide

#### Step 1: Download Zookeeper
- URL: [Zookeeper Download](http://mirrors.estointernet.in/apache/zookeeper/stable/)

#### Step 2: Download Apache Kafka
- URL: [Apache Kafka Download](http://mirrors.estointernet.in/apache/kafka/)

#### Step 3: Set Path to ZOOKEEPER
- Add the path to the `bin` folder of Zookeeper in the environment variables.

**Note**: Copy `zookeeper.properties` and `server.properties` files from the `kafka/config` folder to the `kafka/bin/windows` folder.

#### Step 4: Start Zookeeper Server
Run the following command from the `kafka/bin/windows` folder:
```bash
zookeeper-server-start.bat zookeeper.properties
```

#### Step 5: Start Kafka Server
Run the following command from the Kafka folder:
```bash
kafka-server-start.bat server.properties
```

#### Step 6: Create Kafka Topic
Run the following command from the `kafka/bin/windows` folder to create a topic named `amazon_orders_topic`:
```bash
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic amazon_orders_topic
```

#### Step 7: View Created Topics
Run the following command to list all topics:
```bash
kafka-topics.bat --list --bootstrap-server localhost:9092
```

---
### Repository Details
This README provides a foundational setup guide for integrating Apache Kafka with Spring Boot applications.

### Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   ```

2. Follow the setup steps in this guide to configure and start Apache Kafka.

3. Integrate with your Spring Boot application to send and receive messages using Kafka.

### Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

### License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


