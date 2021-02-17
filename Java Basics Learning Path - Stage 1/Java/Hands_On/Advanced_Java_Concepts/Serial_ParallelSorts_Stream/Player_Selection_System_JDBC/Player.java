package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Player_Selection_System_JDBC;
/*Remove the package import from the code in genc learn*/

public class Player {

    private int playerId;
    private String playerName;
    private double height;
    private double weight;

    public Player(int playerId, String playerName, double height, double weight) {
        super();
        this.playerId = playerId;
        this.playerName = playerName;
        this.height = height;
        this.weight = weight;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
