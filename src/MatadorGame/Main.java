package src.MatadorGame;
import gui_fields.GUI_Board;
import gui_main.GUI;
import gui_main.*;


public class Main {

    private static Object GUI_Board;

    public Main() {
        new GUI();
    }
    public static void main(String[] args){
        ChanceCardDeck game = new ChanceCardDeck();

        GUI.setNull_fields_allowed(true);



    }
}


