public abstract class Animal {

    private String name;
    private double weight;
    private int speed;

    public void sleep() {}
    public void play() {}
    
    // Setter of name
    public void setName(String name) {
        this.name = name;
    }
    // Getter of name
    public String getName() {
        return this.name;
    }
    // Setter of weight
    public void setWeight(double weight) {
        this.weight = weight;
    }
    // Getter of weight
    public double getWeight() {
        return this.weight;
    }
    // Setter of speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // Getter of speed
    public int getSpeed() {
        return this.speed;
    }
}