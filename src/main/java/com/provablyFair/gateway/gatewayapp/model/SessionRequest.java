package com.provablyFair.gateway.gatewayapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionRequest {

    @JsonProperty("casino_id")
    private String casinoId;
    private String game;
    private String locale;
    private String ip;
    private Url urls;
    private User user;

    public String getCasinoId() {
        return casinoId;
    }

    public void setCasinoId(String casinoId) {
        this.casinoId = casinoId;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Url getUrls() {
        return urls;
    }

    public void setUrls(Url urls) {
        this.urls = urls;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
