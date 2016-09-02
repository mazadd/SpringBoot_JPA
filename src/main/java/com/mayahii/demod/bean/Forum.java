package com.mayahii.demod.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by root on 29/08/16.
 */
@Entity
@Table(name = "forum")
public class Forum implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String entry_text;
    private int entry_pattern;
    private int user_id;
    
    @Column(name = "entry_date", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entry_date;
    private int entry_likes;
    private int entry_dislikes;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getEntry_text() {
        return entry_text;
    }
    
    public void setEntry_text(String entry_text) {
        this.entry_text = entry_text;
    }
    
    public int getEntry_patter() {
        return entry_pattern;
    }
    
    public void setEntry_patter(int entry_patter) {
        this.entry_pattern = entry_patter;
    }
    
    public int getUser_id() {
        return user_id;
    }
    
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    public Date getEntry_date() {
        return entry_date;
    }
    
    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }
    
    public int getEntry_likes() {
        return entry_likes;
    }
    
    public void setEntry_likes(int entry_likes) {
        this.entry_likes = entry_likes;
    }
    
    public int getEntry_dislikes() {
        return entry_dislikes;
    }
    
    public void setEntry_dislikes(int entry_dislikes) {
        this.entry_dislikes = entry_dislikes;
    }
    
    public Forum(String entry_text){
        this.entry_text = entry_text;
    }
    
    public Forum(long id){
        this.id = id;
    }
    
    public Forum(){
        
    }
}
