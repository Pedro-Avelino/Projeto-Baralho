package code;

public enum Suit{

   CLUBS ("C"), DIAMONDS("D"), HEARTS("H"), SPADES("S");

    private final String name;

    private Suit(String name) {

        this.name = name;

    }

    public String getName() {

        return this.name;

    }

}
