import java.util.ArrayList;

public abstract class Announcer {
    private ArrayList<Player> subscribedPlayers;

    public Announcer(){
        subscribedPlayers = new ArrayList<Player>();
    }

    public final void addNewPlayer(Player newPlayer){
        subscribedPlayers.add(newPlayer);
    }

    public final boolean announceNextNumber(int number){
        System.out.println("Announced number: " + number);
        for (int i = 0; i < subscribedPlayers.size(); i++) {
            subscribedPlayers.get(i).checkForNumber(number);
            System.out.println("Player: " + (i + 1) + " - " + subscribedPlayers.get(i).printRemaining());
            if (subscribedPlayers.get(i).checkIfWon()){
                System.out.println("Player: " + (i + 1) + " won!");
                return true;
            }
        }
        return false;

    }


    public abstract boolean chooseNextNumber();



}
