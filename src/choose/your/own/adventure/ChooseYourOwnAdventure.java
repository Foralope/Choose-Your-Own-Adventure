/*
 * Will Zwart
 * 19/10/18
 * A choose your own adventure game.
 */

package choose.your.own.adventure;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner keyedInput = new Scanner(System.in);
        int userInput,userInput2,userInput3;
        int thingForALoop = 1;
        //The adventure begins!
        System.out.println("Welcome to the choose your own adventure game! Here you are a hockey player. ");
        System.out.println("Overtime starts, and the coach is picking players to send out to play. Do you ask to play (1) or do you wish to stay on the bench (2)?");
        userInput = keyedInput.nextInt();
        if (userInput == 1){
            System.out.println("Do you go after the puck (1), or retreat to defense (2)?");
            userInput2 = keyedInput.nextInt();
            if (userInput2 == 1){
                System.out.println("YOU STEAL THE PUCK!?!?! Wow, nice job. Too bad immediately afterwards you get absolutely crushed by a defensemen on their team, who manages to pass the puck to your guy, who scores. Your team hates you. You lose.");
                while (thingForALoop > 0){
                    System.out.println("YOU LOSE!");
                    thingForALoop = thingForALoop + 1;
                }
            } else {
                System.out.println("You fail miserably at defense and get bamboozled before you get scored on. Your team absolutely despises you, you absolute failure...");
                while (thingForALoop > 0){
                    System.out.println("YOU LOSE!");
                    thingForALoop = thingForALoop + 1;
                }
            }
        } else {
            System.out.println("Okay, that's really sad... But you get forced to play anyway. Do you do nothing (1), or try to actually play (2)?");
            userInput3 = keyedInput.nextInt();
            if (userInput3 == 1){
                System.out.println("While you do nothing, you somehow trip a guy and get a penalty... How even...? While you're in the penalty box, your team gets scored on, and they all blame you. You get kicked off the team, you miserable excuse for a player... You lose.");
                while (thingForALoop > 0){
                    System.out.println("YOU LOSE!");
                    thingForALoop = thingForALoop + 1;
                }
            } else {
                System.out.println("You get the puck before taking off on a spectacular breakaway and embarass the goalie before you score. Your team is elated. You win!");
                System.out.print("CONGRATS!!!");
            }
        }
    }
    
}
