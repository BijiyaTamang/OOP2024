package week5;

public class Card {
    private String suit;
    private String faceValue;

    // Constructor
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Getter methods
    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    // toString method for better representation
    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}
