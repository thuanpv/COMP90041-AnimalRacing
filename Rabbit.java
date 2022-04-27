public class Rabbit extends Animal {
    
    public Rabbit(String name, double weight, int speed) {
        super();
        this.setName(name);
        this.setWeight(weight);
        this.setSpeed(speed);
    }

    public void interact() {
        System.out.println("HOP!!!");
    }
}
