
package com.example.tmobilechalllenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("card_type")
    @Expose
    private String cardType;
    @SerializedName("card")
    @Expose
    private Card_ card;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Card_ getCard() {
        return card;
    }

    public void setCard(Card_ card) {
        this.card = card;
    }

}
