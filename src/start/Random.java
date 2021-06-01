package start;

import java.util.ArrayList;
import java.util.Collections;

public class Random {
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

    public Random()
    {
        this.number_players = number_players;

        for (int i = 0; i < PlayingCard.SUITS_LIST.length; i++) {
            for (int j = 0; j < PlayingCard.RANK_LIST.length; j++) {
                deck.add(new PlayingCard(PlayingCard.SUITS_LIST[i], PlayingCard.RANK_LIST[j]));
            }
        }
        Collections.shuffle(deck);
    }
    public void Print() {
        int count = 0;
        for (int i = 0; i < number_players; i++){
            for (int j = 0; j < 6; j++) {
                System.out.println(deck.get(count));
                count++;
            }
        }
    }

}
