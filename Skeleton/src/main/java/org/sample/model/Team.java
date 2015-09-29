package org.sample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long teamId;
    
    private String teamName;
    private Date date;
    
    public String getTeam() {
        return teamName;
    }

    public void setTeam(String team) {
        this.teamName = team;
    }
    
    public Long getId() {
        return teamId;
    }

    public void setId(Long id) {
        this.teamId = id;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }
}