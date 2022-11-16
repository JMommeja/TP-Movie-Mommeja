package TPMOVIE.controller;

import TPMOVIE.model.Film;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmController {
	
    @RequestMapping("/Film")
    public List<Film> getFilm()
    {
		List<Film> FilmList = new ArrayList<Film>();
		FilmList.add(new Film("titre","real","acteurprin","datesorti"));
		return FilmList;
    }

}
