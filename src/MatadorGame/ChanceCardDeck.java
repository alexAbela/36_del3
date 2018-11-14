package src.MatadorGame;

import java.util.Random;

public class ChanceCardDeck {
    private ChanceCards[] Deck;

    private final int maxValue = 20;


    public ChanceCardDeck() {

        Deck = new ChanceCards[20];
        Deck[0] = new ChanceCards("Give this card to the CAR and draw one more chancecard. CAR: On your next turn you have to move to any free square, and buy it. If none of the squares are free you have to buy one from another player", "CHANCE");
        Deck[1] = new ChanceCards("Move to START and recive 2$", "CHANCE");
        Deck[2] = new ChanceCards("Move up to 5 fields forward", "CHANCE");
        Deck[3] = new ChanceCards("Move to an orange square, if the field is not owned you get it for free, otherwise you have to pay the owner rent", "CHANCE");
        Deck[4] = new ChanceCards("Move 1 square forward or take another card", "CHANCE");
        Deck[5] = new ChanceCards("Give this card to the ship, and take another one. SHIP: on your next turn you have to sail to any unowned square and buy it. If all of the squares are owned you have to buy one from antoher player", "HANCE" );
        Deck[6] = new ChanceCards("You ate too much candy, pay 2$ to the bank", "CHANCE");
        Deck[7] = new ChanceCards("Move to an orange or green square. If no one owns it you get it for free, else you have to play rent to the owner", "CHANCE");
        Deck[8] = new ChanceCards("Move to an lightblue square, if no one owns it you get it for free! otherwise you have to pay rent to the owner", "CHANCE");
        Deck[9] = new ChanceCards("You are released without any cost, keep this card until you need it.", "CHANCE");
        Deck[10] = new ChanceCards("Move to Strandpromenaden", "CHANCE");
        Deck[11] = new ChanceCards("Give this card to the CAT and draw another one. CAT: On your next turn sneak onto any square and buy it. If all squares are owned you have to buy one from another player", "CHANCE");
        Deck[12] = new ChanceCards("Give this card to the DOG and draw another one. DOG: On your next turn jump onto any square and buy it. If all squares are owned you have to buy one from another player", "CHANCE)");
        Deck[13] = new ChanceCards("It's your birthday! Everyone gives you 1$", "CHANCE");
        Deck[14] = new ChanceCards("Move to a pink or darkblue square, if no one owns the square you get it for free! Otherwise you have to pay the owner rent","CHANCE");
        Deck[15] = new ChanceCards("You have made all of your homework, recive 2$ from the bank", "CHANCE");
        Deck[16] = new ChanceCards("Move to a red square, if no one owns it you get it for free! Otherwise you have to pay the owner rent.", "CHANCE");
        Deck[17] = new ChanceCards("Move to the skate park to do the perfect grind! If no one owns it you get it for free, otherwise pay the owner rent", "CHANCE");
        Deck[18] = new ChanceCards("Move to a lightblue or red square, if no one owns it you get it for free, otherwise pay the owner rent.", "CHANCE");
        Deck[19] = new ChanceCards("Move to a brown or yellow square, if no one owns it you get it for free, otherwise pay the owner rent.", "CHANCE");

        Shufflecards();



    }

    public void Shufflecards(){
        ChanceCards Cardtemp[] = new ChanceCards[20];
        //


        Random random = new Random();
        int shifts = 0;
        int pos;
        while (shifts<20) {
            pos = random.nextInt(maxValue);

            if (Cardtemp[pos] == null) {
                Cardtemp[pos] = this.Deck[shifts];
                shifts ++;
            }
        }
        this.Deck = Cardtemp;
    }
    public String DrawCard(){
        ChanceCards[] korttemp = this.Deck;
        String firstCard = String.valueOf(this.Deck[0]);
        ChanceCards firstCardKort= this.Deck[0];
        for (int i = 0; i < Deck.length; i++) {
            this.Deck [i] = korttemp[(i+1)%20];
        }
        Deck[19] = firstCardKort;
        return firstCard;
    }
    }

