
package com.example.tmobilechalllenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes__ {

    @SerializedName("text_color")
    @Expose
    private String textColor;
    @SerializedName("font")
    @Expose
    private Font__ font;

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Font__ getFont() {
        return font;
    }

    public void setFont(Font__ font) {
        this.font = font;
    }

}
