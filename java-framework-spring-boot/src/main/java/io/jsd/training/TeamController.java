package io.jsd.training;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}

	@GetMapping("/team/{id}")
	public Optional<Team> getTeam(@PathVariable Long id) {
		return teamRepository.findById(id);
	}

}
