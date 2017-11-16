package com.innovate.consumer.resource;

import com.innovate.consumer.dao.BetEventDAO;
import com.innovate.consumer.dto.BetEventDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by reddys on 15/11/2017.
 */
@RestController
@RequestMapping(value = "/message/")
public class BetEventResource {

    private Logger log = LoggerFactory.getLogger(BetEventResource.class);

    @Autowired
    private BetEventDAO betEventDAO;

    @GetMapping(value = "/status")
    public String produceMessage(){
        return "BetEvent end points up & running";
    }

    @PostMapping(value = "/test/betevent/insert")
    public ResponseEntity<BetEventDTO> getMessage(@RequestBody BetEventDTO betEventDTO){
        betEventDAO.save(betEventDTO);
        return new ResponseEntity<BetEventDTO>(betEventDTO, HttpStatus.OK);
    }
}
