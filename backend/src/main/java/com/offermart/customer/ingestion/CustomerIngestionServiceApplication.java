package com.offermart.customer.ingestion;
import org.springframework.boot.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduleing.annotation.EnableScheduling;

@SpringBootApplication
EableJpaRepositories
EableScheduling
EnableKafka
@ \uaac\nclass CustomerIngestionServiceApplication {
    public static void main(String[] args) {
        SpringBootApplication.run(CustomerIngestionServiceApplication.class, args);
    }
}
