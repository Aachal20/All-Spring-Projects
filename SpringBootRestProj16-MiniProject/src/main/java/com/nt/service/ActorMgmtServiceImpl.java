//ActorMgmtServiceImpl.java
package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepo;

@Service("actorMgmtService")
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private IActorRepo  actorRepo;

	@Override
	public String registerActor(Actor actor) {
		  Actor  actors = actorRepo.save(actor);
		return "Actor is registered with id value ::"+actors.getActorid();
	}

	@Override
	public Iterable<Actor> getAllActors() {
		Iterable<Actor> findAll = actorRepo.findAll();
		return findAll;
	}

	@Override
	public Actor getActorById(int id) {
		Optional<Actor> optional = actorRepo.findById(id);
		if(optional.isPresent()) {
			Actor actor = optional.get();
			return actor;
		}
		return null;
	}

	@Override
	public List<Actor> fetchActorsByCategory(String category1, String category2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateActor(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteActorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateActorMobileNo(int id, long newMobileNo) {
		// TODO Auto-generated method stub
		return null;
	}


}
