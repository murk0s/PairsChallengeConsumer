//package sia.pairschallenge.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
////import sia.pairschallenge.mapper.ProductEventDeserializer;
//
//
//@Configuration
//@EnableKafka
//public class Config {
//    @Bean
//    public ObjectMapper objectMapper() {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
//        return mapper;
//    }
//
////    @Bean
////    public ConsumerFactory<String, ProductEvent> consumerFactory() {
////        Map<String, Object> config = new HashMap<>();
////        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9094");
//////        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
////        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ErrorHandlingDeserializer.class);
//////        config.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, ProductEventDeserializer.class);
////        config.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class);
//////        config.put(JsonDeserializer.TRUSTED_PACKAGES, "*");
////        config.put(JsonDeserializer.VALUE_DEFAULT_TYPE, ProductEvent.class.getName());
////        return new DefaultKafkaConsumerFactory<>(
////                config,
////                new StringDeserializer(),
////                new JsonDeserializer(ProductEvent.class));
////        //return new DefaultKafkaConsumerFactory<>(config);
////    }
////
////    @Bean
////    public ConcurrentKafkaListenerContainerFactory<String, ProductEvent> kafkaListenerContainerFactory() {
////        ConcurrentKafkaListenerContainerFactory<String, ProductEvent> factory =
////                new ConcurrentKafkaListenerContainerFactory<>();
////        factory.setConsumerFactory(consumerFactory());
////        return factory;
////    }
//}