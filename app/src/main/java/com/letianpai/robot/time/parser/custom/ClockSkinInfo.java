package com.letianpai.robot.time.parser.custom;

public class ClockSkinInfo {

    private int id;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", url:'" + url + '\'' +
                '}';
    }
}
