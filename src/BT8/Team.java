package BT8;

import java.util.Collection;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Team {
    private final SortedSet<Player> sortedSetPlayers;
    private final HashSet<Player> hashSetPlayers;
    private final TreeSet<Player> treeSetPlayers;

    public Team() {
        this.sortedSetPlayers = new TreeSet<>();
        this.hashSetPlayers = new HashSet<>();
        this.treeSetPlayers = new TreeSet<>();
    }

    public void addPlayer(Player player) {
        this.sortedSetPlayers.add(player);
        this.hashSetPlayers.add(player);
        this.treeSetPlayers.add(player);
    }

    public void printPlayers() {
        System.out.println("SortedSet Players:");
        printPlayers(this.sortedSetPlayers);

        System.out.println("HashSet Players:");
        printPlayers(this.hashSetPlayers);

        System.out.println("TreeSet Players:");
        printPlayers(this.treeSetPlayers);
    }

    private void printPlayers(Collection<Player> players) {
        int i = 1;
        for (Player player : players) {
            System.out.println(STR."\{i}. \{player}");
            i++;
        }
    }
}