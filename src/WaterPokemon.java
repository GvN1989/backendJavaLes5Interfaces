import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";

    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "Hydrocanon", "Raindance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, hp, level, food, sound, type);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " performed surf attack on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp ");
                enemy.setHp(enemy.getHp()-20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp ");
                enemy.setHp(enemy.getHp()-10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp ");
                enemy.setHp(enemy.getHp()-40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp ");
                enemy.setHp(enemy.getHp()-30);
            }
        }
        System.out.println(enemy.getName()+ " has " + enemy.getHp() + " hp left ");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " performed hydro-pump on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp ");
                enemy.setHp(enemy.getHp()-20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp ");
                enemy.setHp(enemy.getHp()-10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp ");
                enemy.setHp(enemy.getHp()-45);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp ");
                enemy.setHp(enemy.getHp()-30);
            }
        }
        System.out.println(enemy.getName()+ " has " + enemy.getHp() + " hp left ");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " performed hydro-canon on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp ");
                enemy.setHp(enemy.getHp()-20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp ");
                enemy.setHp(enemy.getHp()-15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 50 hp ");
                enemy.setHp(enemy.getHp()-50);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp ");
                enemy.setHp(enemy.getHp()-30);
            }
        }
        System.out.println(enemy.getName()+ " has " + enemy.getHp() + " hp left ");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " performed rain-dance for " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " gaines 10 hp ");
                enemy.setHp(enemy.getHp()+10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " gains 20 hp ");
                enemy.setHp(enemy.getHp()+20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 5 hp ");
                enemy.setHp(enemy.getHp()-5);
            }
            case "electric" -> {
                System.out.println("has no effect on "+ enemy.getName() );
            }
        }
        System.out.println(enemy.getName()+ " has " + enemy.getHp() + " hp left ");
    }

    public List<String> getAttacks(){
        return attacks;
    }

}
