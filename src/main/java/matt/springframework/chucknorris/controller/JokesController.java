package matt.springframework.chucknorris.controller;

import matt.springframework.chucknorris.services.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private Joke joke;

    @Autowired
    public JokesController(Joke joke){
        this.joke = joke;
    }
    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke",joke.getJoke());

        return "chucknorris";
    }

}
