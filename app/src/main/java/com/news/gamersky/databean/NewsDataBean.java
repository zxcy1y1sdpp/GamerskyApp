package com.news.gamersky.databean;

import java.util.ArrayList;
import java.util.List;

public class NewsDataBean {
    public  String id;
    public String title;
    public String imageUrl;
    public String src;
    public String date;
    public String sort;
    public String commentCount;


    public NewsDataBean(String imageUrl, String title, String src) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.src = src;

    }
    public NewsDataBean(String title, String src) {
        this.title = title;
        this.src = src;

    }
    public NewsDataBean(String id,String imageUrl, String title, String src, String date, String sort,String commentCount) {
        this.id=id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.src = src;
        this.date=date;
        this.sort=sort;
        this.commentCount=commentCount;
    }

    public void setCommentCount(String commentCount){
        this.commentCount=commentCount;
    }

}
