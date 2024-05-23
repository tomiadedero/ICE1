/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        Scanner input = new Scanner(System.in);

        System.out.println("Pick a card, any card");
        System.out.print("Enter a card value (1-13): ");
        int userValue = input.nextInt();

        System.out.println("Pick the card suit (1 = Hearts, 2 = Diamonds, 3 = Spades, 4 = Clubs): ");
        int userSuit = input.nextInt();
        
        boolean found = false;
        for (Card magicCard : magicHand) {
            if (magicCard.getValue() == userValue && magicCard.getSuit().equalsIgnoreCase(Card.SUITS[userSuit - 1])) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        magicHand[6] = luckyCard;


    }
    
}
