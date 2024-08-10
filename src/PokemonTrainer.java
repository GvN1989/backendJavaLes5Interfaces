import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class PokemonTrainer {

    private final String name;
    private List<Pokemon> pokemons;

    public PokemonTrainer(String name, List<Pokemon>pokemons) {
        this.name = name;
        this.pokemons= pokemons;
    }

    public String getName(){
        return name;
    }

    public List <Pokemon> getPokemons(){
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons=pokemons;
    }



}
