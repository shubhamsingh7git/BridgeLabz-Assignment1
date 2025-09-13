package Strings.Level3;
import java.util.*;

public class Q10 {
    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    public static String[] initDeck() {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int k=0;
        for (String suit: suits)
            for (String rank: ranks)
                deck[k++] = rank + " of " + suit;
        return deck;
    }
    public static void shuffle(String[] deck) {
        for (int i=0;i<deck.length;i++) {
            int r = i + (int)(Math.random()*(deck.length-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }
    public static String[][] distribute(String[] deck,int n,int players) {
        if (n%players!=0) return new String[0][0];
        String[][] result = new String[players][n/players];
        int k=0;
        for (int i=0;i<players;i++)
            for (int j=0;j<n/players;j++)
                result[i][j] = deck[k++];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int p = sc.nextInt();
        String[] deck = initDeck();
        shuffle(deck);
        String[][] players = distribute(deck,n,p);
        if (players.length==0) System.out.println("Cannot distribute equally");
        else {
            for (int i=0;i<p;i++) {
                System.out.println("Player "+(i+1)+": "+Arrays.toString(players[i]));
            }
        }
        sc.close();
    }
}
