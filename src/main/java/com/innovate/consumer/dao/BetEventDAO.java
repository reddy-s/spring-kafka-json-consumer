package com.innovate.consumer.dao;

import com.innovate.consumer.dto.BetEventDTO;
import com.innovate.consumer.entity.BetEvent;
import com.innovate.consumer.repository.BetEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by reddys on 16/11/2017.
 */
@Component
public class BetEventDAO {

    @Autowired
    private BetEventRepository betEventRepository;


    public BetEvent save(BetEventDTO betEventDTO){
        return this.betEventRepository.save(new BetEvent(betEventDTO));
    }
}
