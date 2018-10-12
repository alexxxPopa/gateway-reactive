package com.provablyFair.gateway.gatewayapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Url {

    @JsonProperty("deposit_url")
    private String depositUrl;
    @JsonProperty("return_url")
    private String returnUrl;

    public String getDepositUrl() {
        return depositUrl;
    }

    public void setDepositUrl(String depositUrl) {
        this.depositUrl = depositUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
}
