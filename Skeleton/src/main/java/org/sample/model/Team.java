package org.sample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    private Date date;
    
    public String getTeam() {
        return name;
    }

    public void setTeam(String teamName) {
        this.name = teamName;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }
}