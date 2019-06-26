package com.ms.feedback.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Device {
    @Id
    @GeneratedValue
    private int id;
    private int deviceId;
    private String feedbackdata;
    private Date feedbackDate;
    private LocalDateTime feedbackTime;
    private int sentiment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getFeedbackdata() {
        return feedbackdata;
    }

    public void setFeedbackdata(String feedbackdata) {
        this.feedbackdata = feedbackdata;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public LocalDateTime getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(LocalDateTime feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public int getSentiment() {
        return sentiment;
    }

    public void setSentiment(int sentiment) {
        this.sentiment = sentiment;
    }
}
