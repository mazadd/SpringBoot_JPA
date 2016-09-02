package com.mayahii.demod.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 29/08/16.
 */
@Entity
@Table(name="role")
public class Role implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Role(){
        
    }
}
