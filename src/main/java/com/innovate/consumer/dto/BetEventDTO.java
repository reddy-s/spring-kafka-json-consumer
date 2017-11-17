package com.innovate.consumer.dto;

import java.time.ZonedDateTime;

/**
 * Created by reddys on 10/11/2017.
 */
public class BetEventDTO {

    private String username;

    private String event;

    private Integer stake;

    private String eventTime;

    private String jurisdiction;

    private String country;

    private String brand;

    private String product;

    private String channel;

    private String currency;

    public BetEventDTO() {
        super();
    }

    public BetEventDTO(
            String username,
            String event,
            Integer stake,
            String eventTime,
            String jurisdiction,
            String country,
            String brand,
            String product,
            String channel,
            String currency) {
        this.username = username;
        this.event = event;
        this.stake = stake;
        this.eventTime = eventTime;
        this.jurisdiction = jurisdiction;
        this.country = country;
        this.brand = brand;
        this.product = product;
        this.channel = channel;
        this.currency = currency;
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

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BetEventDTO [username=" + username + ", event=" + event + ", stake=" + stake +
                ", eventTime=" + eventTime + ", jurisdiction=" + jurisdiction + ", country=" + country +
                ", brand=" + brand + ", product=" + product + ", channel=" + channel + ", currency=" + currency +"]";
    }
}
