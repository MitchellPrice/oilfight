import java.util.Scanner;

public class OilFight {

//    main method
    public static void main(String[]args) {

//           Create four instances of players, initializing them with basic details
        Player player1 = new Player(001,3, "Lloyd", 1, "Russian", 10, 10);
        Player player2 = new Player(002,4, "Greg", 2, "American", 20, 20);
        Player player3 = new Player(003,4, "Julie", 3, "Welsh", 30, 30);
        Player player4 = new Player(004,4, "Diana", 4, "Irish", 40, 40);

        System.out.println("You are " + player1.name + " with " + player1.numberOfTurnsAvailable + " turns remaining, on the " + player1.team + " team, at rank " + player1.rank + ".");
        System.out.println("Enter the number of the player you would like to attack, by their rank.");
        System.out.println(player2.name + ", rank " + player2.rank);
        System.out.println(player3.name + ", rank " + player3.rank);
        System.out.println(player4.name + ", rank " + player4.rank);

        String success = "true";
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

//        Current iteration goal: compare current user's offensive power to defending user's defensive power to determine success.
//        If atk > def, success, then determine oil stolen, population decrease and decrement number of turns available

//        this section isn't super helpful anymore, because I want to compare a real player to a defending player
        if (userInput == 2 && success == "true") {
            System.out.println("Success! You stole 20 barrels of oil. Player 2 also lost 2 population in the attack");
            System.out.println("You now have 2 turns remaining.");
        } else if (userInput == 3 && success == "true") {
            System.out.println("Success! You stole 20 barrels of oil. Player 3 also lost 2 population in the attack");
            System.out.println("You now have 2 turns remaining.");
        } else if (userInput == 4 && success == "true") {
            System.out.println("Success! You stole 20 barrels of oil. Player 4 also lost 2 population in the attack");
            System.out.println("You now have 2 turns remaining.");
        } else {
            System.out.println("A failed attempt!");
        }

//        This is one of the later "tough" problems I was trying to solve.
//        Goal: have the current player enter the ID/name of a player they want to attack, and determine outcome.
//        System.out.println("Enter the name of the player you would like to attack.");
//        Player attackThisPlayer = sc.next();
//        player1.attackPlayer(attackThisPlayer);

        // Change the first player's name
//        I'm keeping this around as an example of how I could use a void method to update a value for my instanced players
//        System.out.println("Player 1's current name: " + player1.name);
//        player1.changeName("Lloyd 2.0");
//        System.out.println("Player 1's name after change: " + player1.name);

    }
}

// next steps
// attack another user
// show all users. Later iteration: show users per rank per page (10 per page? 100?)
// if successful, steal oil, blow up a small portion of oil, and kill a small percentage of population
// compare offensive to defensive power to determine success
// offensive power is determined by value of all offensive items owned by the attacker, as well as a bonus from spy training
// defensive power is determined by value of all defensive items owned by the defender, as well as a bonus from their infrastructure
// how much information can users normally tell about other users? Just their rank?
// am I going to have spy actions and attack actions separately, or should they come from the same pool?
// what kind of algorithm should I use to determine success, and the results of that success?
