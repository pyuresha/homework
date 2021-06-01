package start;

import java.util.ArrayList;

public class Main {
    private ArrayList<PlayingCard> deck = new ArrayList<>();
    private int number_players = 0;

    public int getNumber_players() {
        return number_players;
    }

    public void setNumber_players(int number_players) {
        if (number_players < 10 ) {
            this.number_players = number_players;
        }
        else
            System.out.println("Не хватит карт, введите от 1 до 10 игроков");
    }


}
