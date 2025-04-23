package sia.pairschallenge.kafka;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import sia.pairschallenge.event.ProductEvent2;

@Service
@KafkaListener(topics = "product-events", groupId = "product-events-listener"
//,topicPartitions = @TopicPartition(topic = "topic-2",
//        partitionOffsets = {
//                @PartitionOffset(partition = "0", initialOffset = "0"),
//                @PartitionOffset(partition = "3", initialOffset = "0")}
)
@RequiredArgsConstructor
public class Consumer {

    private final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaHandler
    public void listenNewEmployee(ProductEvent2 productEvent2) {
        LOGGER.info("Received event:{}", productEvent2);
    }

}