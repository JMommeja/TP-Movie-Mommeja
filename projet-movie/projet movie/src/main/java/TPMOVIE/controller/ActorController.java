package TPMOVIE.controller;

import java.util.ArrayList;
import java.util.List;

import TPMOVIE.model.Actor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {
	
    @RequestMapping("/Actor")
    public List<Actor> getActor()
    {
		List<Actor> ActorList = new ArrayList<Actor>();
		ActorList.add(new Actor(1,"nom","prenom","23/02/1992"));
		return ActorList;
    }

}
