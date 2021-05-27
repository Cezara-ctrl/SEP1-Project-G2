import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players = new ArrayList<Player>();
    private int numberOfPlayers;

    public Team(ArrayList<Player> players, int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public int getNumberOfPlayers() {
        return players.size();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Team team = (Team) obj;
        return players == team.players && numberOfPlayers == team.numberOfPlayers;
    }

    public String toString() {
        return "Players" + players + "Number of the players" + numberOfPlayers;
    }
}
