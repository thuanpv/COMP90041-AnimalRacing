public class Engine {
    public static void main(String[] args) {
        
        // Initialise first competition
        Competition comp = new Competition("First");

        // Create rabbit and turtle
        comp.addCompetitor(new Turtle("Turbo", 100, 1));
        comp.addCompetitor(new Rabbit("Bumper", 50, 3));

        // Introductions
        comp.intro();
    }
}
