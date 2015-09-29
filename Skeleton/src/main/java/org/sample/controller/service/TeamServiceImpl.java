package org.sample.controller.service;

import java.util.Date;

import org.sample.controller.exceptions.InvalidTeamException;

import org.sample.controller.pojos.TeamForm;
import org.sample.model.Team;
import org.sample.model.dao.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeamServiceImpl implements TeamService{
	
	@Autowired    TeamDao teamDao;
	
	@Transactional
	public TeamForm createTeam(TeamForm createTeam)throws InvalidTeamException {
		
		Team team = new Team();
		team.setTeam(createTeam.getTeamName());
		team.setDate(new Date());
		team = teamDao.save(team);
		createTeam.setId(team.getId());
		
		return createTeam;
	}
	
	public Iterable<Team> getTeams() {
		return teamDao.findAll();
	}
}