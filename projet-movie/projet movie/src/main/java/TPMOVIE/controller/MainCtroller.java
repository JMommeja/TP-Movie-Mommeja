package TPMOVIE.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import TPMOVIE.model.Actor;
import TPMOVIE.model.Film;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "MainController")
@RestController
public class MainCtroller
{

    List<Actor> Actors = new ArrayList<Actor>();
    {
        Actors.add(new Actor(1, "aaaaa", "aaaaa","xx/xx/xx"));
        Actors.add(new Actor(2,"aaaaa", "aaaaa", "xx/xx/xx"));
        Actors.add(new Actor(3,"aaaaa", "aaaaa", "xx/xx/xx"));
        Actors.add(new Actor(4,"aaaaa", "aaaaa", "xx/xx/xx"));
    }
    List<Film> Films = new ArrayList<Film>();
    {
        Films.add(new Film("aaaaa", "aaaaa", "aaaaa","xx/xx/xx"));
        Films.add(new Film("aaaaa","aaaaa", "aaaaa", "xx/xx/xx"));
        Films.add(new Film("aaaaa","aaaaa", "aaaaa", "xx/xx/xx"));
        Films.add(new Film("aaaaa","aaaaa", "aaaaa", "xx/xx/xx"));
    }
    @ApiOperation(value = "Get list of Actors in the System ", response = Iterable.class, tags = "getActors")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })

    @RequestMapping(value = "/getActors")
    public List<Actor> getActors() {
        return Actors;
    }
    //////////////////////////////////////////////////////////////
    @ApiOperation(value = "Get list of Films in the System ", response = Iterable.class, tags = "getStudents")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })
    @RequestMapping(value = "/getStudents")
    public List<Film> getFilms() {
        return Films;
    }
    //////////////////////////////////////////////////////////////
    @ApiOperation(value = "Get specific Actor in the System with the first Name ", response = Actor.class, tags = "getActor")
    @RequestMapping(value = "/getActor/{name}")
    public Actor getActor(@PathVariable(value = "Firstname") String name) {
        return Actors.stream().filter(x -> x.getFirstName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }
    /////////////////////////////////////////////////////////////
    @ApiOperation(value = "Get specific Film in the System with the Film title ", response = Film.class, tags = "getFilm")
    @RequestMapping(value = "/getFilm/{title}")
    public Film gettitre(@PathVariable(value = "title") String name) {
        return Films.stream().filter(x -> x.gettitre().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);

    }
}


