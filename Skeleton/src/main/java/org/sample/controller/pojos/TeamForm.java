package org.sample.controller.pojos;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class TeamForm {
    
    private Long teamId;
    private Date date;
    
	//@NotEmpty(message = "Class Team Form; String Team; must have a value!")
	private String teamName;

	public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String team) {
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

    public void setDate(Date da) {
        this.date = da;
    }
}