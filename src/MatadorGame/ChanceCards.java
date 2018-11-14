package src.MatadorGame;

public class ChanceCards {

    private String Description;
    private String name;

    public ChanceCards(String Description, String name) {

        this.Description = Description;
        this.name = name;

    }


    public String toString() {
        return this.Description + " " + this.name + "\n";
    }
}
