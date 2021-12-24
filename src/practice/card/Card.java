package practice.card;

public class Card {

    private static int serialNumber = 10000;
    private int cardNumber;

    Card() {
        serialNumber++;
        cardNumber = serialNumber;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

}
