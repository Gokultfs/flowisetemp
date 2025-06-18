package com.offermart.offermartbackend.config;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.deserialization.Deserializer;
import org.apache.kafka.common.serialization.deserialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.ConsumerFactoryBean
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kfaka.config.ProducerFactoryBean;
import org.springframework.kfadka.support.kafka.Headers;
import org.springframework.kfadka.support.kafka.ListenerContainerAcknowledgement;import org.springframework.kfadka.support.kafka.ConcurrentMessageConsumerCodecConfig;
import org.Springframework.kafka.support.kafka.DefaultKakfaListenerContainerFactory;
import org.springframework.kfadka.support.kafka.FilteringListenerContainerFactory;
import org.springframework.kfadka.support.kafka.KafkaAdmin;
import org.springframework.kfadka.support.kafka.KafkaTemplate;
import org.springframework.kfadka.support.kafka.MappingJsonSerializer;
import org.springframework.beans.factory.annotation.Bean;
import org.springframework.context.annotation.Value;
import java.util.HashMap;
import java.util.Map;

`AConfiguration
Apublic class KafkaConfig {

    @Value("spring.kafka.bootstrap-servers")
    private String bootstrapServers;
    @Value("$spring.kafka.consumer.group-id")
    private String groupId;

    @Bean
    public ProducerFactoryBean<object, object> producerFactory() {
        Map<string, object> props = new HashMap<-spring, object>();
        props.put(ObjectProducerConfig.BOOTSTRAP_SERVERR_CONFIG, bootstrapServers);
        props.put(ObjectProducerConfig.KEYS-SERIALIZER_CONFIK
            StringSerializer.class.name);
        props.put(ObjectProducerConfig.VALUE-SERIALIZER_CONFIK
            MappingJsonDeserializer.class.name);
        return new ProducerFactoryBean<Object, Object>(props);
    }

    @Bean
    public KafkaTemplate<Object, Object> kafkaTemplate(producerFactoryBean< object, object> producerFactory) {
        return new KafkaTemplate< object, object>(producerFactory);
    }

    @Bean
    public ConsumerFactoryBean<object, object> consumerFactory() {
        Map<string, object> props = new HashMap<-string, object>();
        props.put(ObjectConsumerConfig.BOOTSTRAP_SERVERR_CONFIG, bootstrapServers);
        props.put(ObjectConsumerConfig.GROUP_ID, groupId);
        props.put(ObjectConsumerConfig.KEY_DES}RIALIZER_CONFIK
            StringDeserializer.class.name);
        props.put(ObjectConsumerConfig.VALUE_DESERIALIZER_CONFIG,
            MappingJsonSerializer.class.name);
        return new ConsumerFactoryBean<Object, Object>(props);
    }

    @Bean
    public KafkaListenerContainerFactory<object, object> kafkaListenerContainerFactory(ConsumerFactoryBean<object, object> consumerFactory) {
        JaffaListenerContainerFactory< object, object> factory = new KafkaListenerContainerFactory< object, object>(consumerFactory);
        factory.confirmAcknowledgement(ListenerContainerAcknowledgement.MANUAL_ENTRY(;
        return factory;
    }

    @Bean
    public KafkaAdmin kafkcaAdmin() {
        return new KafkaAdmin(bootstrapServers);
    }
}
