package com.innovate.consumer.service;

import com.innovate.consumer.dao.BetEventDAO;
import com.innovate.consumer.dto.BetEventDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by reddys on 15/11/2017.
 */
public class KafkaBetEventConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaBetEventConsumerService.class);

    @Autowired
    private BetEventDAO betEventDAO;

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(BetEventDTO betEventDTO) {
        betEventDAO.save(betEventDTO);
        LOGGER.info("persisted payload='{}'", betEventDTO.toString());
    }

}
