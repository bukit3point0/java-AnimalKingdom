package animalKingdomApp;

public abstract class Animals {
    private static int maxId;
    private int id;

    protected String name;
    protected int year;

    protected String move;
    protected String breathe;
    protected String reproduce;

    public Animals(
        String name,
        int year,
        String move,
        String breathe,
        String reproduce
    ) {
        id = maxId;
        maxId++;
        this.name = name;
        this.year = year;
        this.move = move;
        this.breathe = breathe;
        this.reproduce = reproduce;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getMove() {
        return move;
    }
    public String getBreathe() {
        return breathe;
    }
    public String getReproduce() {
        return reproduce;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMove(String move) {
        this.move = move;
    }
    public void setBreathe(String breathe) {
        this.breathe = breathe;
    }
    public void setReproduce(String reproduce) {
        this.reproduce = reproduce;
    }

    public void eat() {
        System.out.println("Om nom nom");
    }

    @Override
    public String toString() {
        return name + " inhale with " + breathe + " and reproduce by " + reproduce + " and were discovered in " + year + "." + "\n";
    }
}
