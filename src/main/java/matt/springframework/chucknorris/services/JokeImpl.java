package matt.springframework.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeImpl {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String Joke(){
        return chuckNorrisQuotes.getRandomQuote();
    }


}
