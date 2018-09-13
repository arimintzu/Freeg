package com.mtz.testwarna.dao;

public class GiveawayDAO {
    private int user_id, participants;
    private String content, location, image;

    public GiveawayDAO() {
    }

    public GiveawayDAO(int user_id, int participants, String content, String location, String image) {
        this.user_id = user_id;
        this.participants = participants;
        this.content = content;
        this.location = location;
        this.image = image;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
