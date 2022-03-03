package com.sinngjpeg.fitnesstracker;

public class MainItem {

    private int id;
    private int drawableId;
    private int textStringId;
    private int color;

    public MainItem(int id, int drawbleId, int textStringId, int color) {
        this.id = id;
        this.drawableId = drawbleId;
        this.textStringId = textStringId;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTextStringId() {
        return textStringId;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }
}
