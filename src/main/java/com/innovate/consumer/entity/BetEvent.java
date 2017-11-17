package com.innovate.consumer.entity;

import com.innovate.consumer.dto.BetEventDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by reddys on 16/11/2017.
 */
@Entity
@Table(name = "betevent")
public class BetEvent {

    private static final Logger LOGGER = LoggerFactory.getLogger(BetEvent.class);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "event")
    private String event;
    @Column(name = "stake")
    private Integer stake;
    @Column(name = "event_time")
    private Date eventTime;
    @Column(name = "jurisdiction")
    private String jurisdiction;
    @Column(name = "country")
    private String country;
    @Column(name = "brand")
    private String brand;
    @Column(name = "product")
    private String product;
    @Column(name = "channel")
    private String channel;
    @Column(name = "insert_time")
    private Date insertTime = new Date();
    @Column(name = "currency")
    private String currency;


    public BetEvent() {
    }

    public BetEvent(
            String username,
            String event,
            Integer stake,
            Date eventTime,
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

    public BetEvent(BetEventDTO betEventDTO) {
        this.username = betEventDTO.getUsername();
        this.event = betEventDTO.getEvent();
        this.stake = betEventDTO.getStake();
        this.eventTime = parseDateTimeStringToDateObject("yyyy-MM-dd HH:mm:ss.SSS", betEventDTO.getEventTime());
        this.jurisdiction = betEventDTO.getJurisdiction();
        this.country = betEventDTO.getCountry();
        this.brand = betEventDTO.getBrand();
        this.product = betEventDTO.getProduct();
        this.channel = betEventDTO.getChannel();
        this.currency = betEventDTO.getCurrency();
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

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
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

    public Date getInsertTime() {
        return insertTime;
    }

    @Override
    public String toString() {
        return "BetEventDTO [ id="+ id + ", username=" + username + ", event=" + event + ", stake=" + stake +
                ", eventTime=" + eventTime + ", jurisdiction=" + jurisdiction + ", country=" + country +
                ", brand=" + brand + ", product=" + product + ", channel=" + channel +", insertTime="+insertTime + " ]";
    }

    private Date parseDateTimeStringToDateObject(String format, String dateInString){
        Date convertedDate = null;
        try{
            convertedDate = new SimpleDateFormat(format).parse(dateInString);
        }catch(ParseException e){
            LOGGER.error(e.toString());
        }
        return convertedDate;
    }
}
