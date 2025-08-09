package view;

import model.Player;
import java.util.List;

public class PlayerView {

    public void printPlayer(Player player) {
        System.out.println("ID: " + player.getId());
        System.out.println("Name: " + player.getName());
        System.out.println("Team: " + player.getTeam());
        System.out.println("Role: " + player.getRole());
        System.out.println("Runs: " + player.getRuns());
        System.out.println("Wickets: " + player.getWickets());
        System.out.println("----------------------");
    }

    public void printAllPlayers(List<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players found.");
            return;
        }
        for (Player p : players) {
            printPlayer(p);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
