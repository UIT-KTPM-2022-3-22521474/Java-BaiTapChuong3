package BT8;

import java.util.List;

public class Player implements Comparable<Player> {
    private final String name;
    private final int jerseyNumber;
    private final List<String> positions;

    public Player(String name, int jerseyNumber, List<String> positions) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.positions = positions;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public List<String> getPositions() {
        return positions;
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(this.jerseyNumber, other.jerseyNumber);
    }

    @Override
    public String toString() {
        return STR."Player {Name: '\{name}', Jersey number: \{jerseyNumber}, positions: \{positions}}";
    }
}