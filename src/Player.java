public class Player {
//    Do I need to make any of these private?
    int ID; // later iteration: make this scalable, maybe into a string for a GUID, probably private?
    int numberOfTurnsAvailable;
    String name;
    int rank; // But rank is a calculation, not just an integer attribute for the player objects
    String team; // what if this needs to be its own object? How would I reference it here?
    int attack; // calculate this later once I've built out the item class
    int defense; // calculate this later once I've built out the item class
//    Seriously considering adding oil as an attribute. Getters and setters for it make sense because I'm allowing users
//    to purchase weapons with oil.

//    Do I need additional attributes?
//    A player may have oil
//    A player may have offensive power items
//    A player may have defensive power items
//    A player may have infrastructure upgrades (the level of oil they can contain
//    A player may have spies
//    A player may have spy upgrades/training (for offense and defense) to increase their overall efficiency

//    Constructor for Player class
    public Player(int ID,int inputNumberOfTurnsAvailable, String inputName, int inputRank, String inputTeam, int attack, int defense){
        this.ID = ID;
        this.numberOfTurnsAvailable = inputNumberOfTurnsAvailable;
        this.name = inputName;
        this.rank = inputRank;
        this.team = inputTeam;
        this.attack = attack;
        this.defense = defense;
    }

//    Attack another player
//    Should this be a String or void type? I want to return a message of success or failure, so a String?
    public void attackPlayer(Player defendingPlayer){
//        Decrease the number of turns available by 1 from this action
        this.numberOfTurnsAvailable-=1;

        if(this.attack>defendingPlayer.defense){
            System.out.println("Success!");
        } else{
            System.out.println("Failure :(");
        }
//        If success=true, return message indicating this, the number of barrels stolen, and the number of the other
//        player's population decreased
//        If success=false, return message indicating this, the number of the player's population decreased in the
//        attack
//        I need to compare the attacking user's offensive power, the attacking user's success in decreasing defenses
//        through spying, the defensive user's defensive power, and the defensive user's resilience
    }

//    Infiltrate another player's facilities in an attempt to gather information
//    Should this be a String or void type?
    public String spyOnPlayer(Player name){
        return("Yet another successful infiltration.");
    }

    //    Infiltrate another player's facilities in an attempt to destroy oil barrels
    public void infiltratePlayerFacilities(Player name){

    }

//    I need a method to allow the player to purchase offensive items
//    I'm going with something generic right now, because I don't know if I want a different method for offensive and defensive weapons
    public void purchaseItem(int itemID, int numberOfItems){
//        increase number of items owned by the purchasing user by the specified amount
//        put in exception handling that only allows user to purchase this number of items if they have enough oil
//        decrease amount of oil according to the number of items and the type of item purchased
//        in the main class, show how much oil the user now has, and how many items they have and of which types
    }

//    I need a method to allow the player to purchase defensive items
//    I need a method to allow the player to purchase infrastructure upgrades
//    I need a method to allow the player to purchase spy training

//    Do I actually need getters and setters for all of these attributes right now? Or ever?
    //    Getter and setter for name attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    Getter and setter for rank attribute
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    //    Getter and setter for numberOfTurnsAvailable attribute
    public int getNumberOfTurnsAvailable() {
        return numberOfTurnsAvailable;
    }

    public void setNumberOfTurnsAvailable(int numberOfTurnsAvailable) {
        this.numberOfTurnsAvailable = numberOfTurnsAvailable;
    }

//    Getter and setter for team attribute
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
