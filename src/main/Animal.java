import java.util.Random;

public class Animal {
    private Vector2d position;
    private int maxEnergy;
    private int energy;
    private Integer[] moves = new Integer[32];
    private Integer direction;

    public Animal(Vector2d position, int maxEnergy) {
        this.position = position;
        this.energy = this.maxEnergy = maxEnergy;
        Random generator = new Random();
        direction = generator.nextInt(8);
    }
    public Animal(Vector2d position, int maxEnergy, Integer[] moves){

    }





















}