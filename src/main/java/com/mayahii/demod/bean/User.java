package com.mayahii.demod.bean;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by root on 29/08/16.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Size(max=50,min=6)
    private String username;
    @Size(max=50,min=6)
    private String password;
    private boolean enabled;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    public User(){
        
    }
}
