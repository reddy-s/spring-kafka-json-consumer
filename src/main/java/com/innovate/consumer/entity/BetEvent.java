package com.innovate.consumer.entity;

import com.innovate.consumer.dto.BetEventDTO;

import javax.persistence.*;

/**
 * Created by reddys on 16/11/2017.
 */
@Entity
@Table(name = "betevent")
public class BetEvent {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "event")
    private String event;
    @Column(name = "stake")
    private Integer stake;


    public BetEvent() {
    }

    public BetEvent(String username, String event, Integer stake) {
        this.username = username;
        this.event = event;
        this.stake = stake;
    }

    public BetEvent(BetEventDTO betEventDTO) {
        this.username = betEventDTO.getUsername();
        this.event = betEventDTO.getEvent();
        this.stake = betEventDTO.getStake();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Integer getStake() {
        return stake;
    }

    public void setStake(Integer stake) {
        this.stake = stake;
    }

    @Override
    public String toString() {
        return "BetEventDTO [id="+ id +" username=" + username + ", event=" + event + ", stake=" + stake + "]";
    }

}
