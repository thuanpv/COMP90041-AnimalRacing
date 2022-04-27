import java.util.ArrayList;
public class Competition {
    
    private String name;
    // ArrayList to store animals in competitions
    ArrayList<Animal> animals;

    // Constructor
    public Competition (String name) {
        this.name = name;
        this.animals = new ArrayList<Animal>();
    }

    // Add competitors
    public void addCompetitor(Animal animal) {
        this.animals.add(animal);
    }

    // Introductions
    public void intro() {
        for (Animal ani : this.animals) {
            System.out.printf(
                "I am %s. \n",
                ani.getName()
            );
        }
    }
}
