package com.innovate.consumer.dto;

/**
 * Created by reddys on 10/11/2017.
 */
public class BetEventDTO {

    private String username;

    private String event;

    private Integer stake;

    public BetEventDTO() {
        super();
    }

    public BetEventDTO(String username, String event, Integer stake) {
        super();
        this.username = username;
        this.event = event;
        this.stake = stake;
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
        return "BetEventDTO [username=" + username + ", event=" + event + ", stake=" + stake + "]";
    }
}
