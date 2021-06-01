package start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = in.nextInt();

        Random card = new Random();
        card.setNumber_players(n);
        card.Print();
    }
}
