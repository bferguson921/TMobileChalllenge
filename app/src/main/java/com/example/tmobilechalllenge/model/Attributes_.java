
package com.example.tmobilechalllenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes_ {

    @SerializedName("text_color")
    @Expose
    private String textColor;
    @SerializedName("font")
    @Expose
    private Font_ font;

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Font_ getFont() {
        return font;
    }

    public void setFont(Font_ font) {
        this.font = font;
    }

}
