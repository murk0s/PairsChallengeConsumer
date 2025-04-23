package sia.pairschallenge.kafka;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import sia.pairschallenge.service.event.ProductEvent;

@Service
@KafkaListener(topics = "product-events", groupId = "product-events-listener")
@RequiredArgsConstructor
public class Consumer {

    private final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaHandler
    public void listenNewEmployee(ProductEvent productEvent) {
        LOGGER.info("Received event:{}", productEvent);
    }

}