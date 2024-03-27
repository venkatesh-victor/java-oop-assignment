package encapsulation;

import java.util.ArrayList;
import java.util.List;

class Team {
    private String name;
    private String city;
    private String division;

    private List<Player> playerList = new ArrayList<>();
    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }

    public String getName() {
        return this.name;
    }

    public void playGame() {
        System.out.println(getName() + " team is playing a game.");
    }

    public void hireCoach() {
        System.out.println(getName() + " team is hiring coach.");
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

}

class Player {
    private String name;
    private String position;
    private int jerseyNumber;

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return this.name;
    }
    public void playGame() {
        System.out.println(getPlayerName() + " is playing.");
    }

    public void train() {
        System.out.println(getPlayerName() + " is training.");
    }

}

public class TeamPlayerDemo {
    public static void main(String[] args) {
        Team chennaiSuperKings = new Team("CSK", "Chennai", "Cricket");
        chennaiSuperKings.addPlayer(new Player("Dhoni", "Wicket Keeper", 7));
        chennaiSuperKings.addPlayer(new Player("Rachin", "Batsman", 10));
    }
}
