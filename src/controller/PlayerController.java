package controller;

import model.Player;
import view.PlayerView;

import java.util.*;

public class PlayerController {
    private List<Player> players = new ArrayList<>();
    private PlayerView view;

    public PlayerController(PlayerView view) {
        this.view = view;
    }

    public void createPlayer(Player p) {
        players.add(p);
        view.showMessage("Player added successfully!");
    }

    public void readAllPlayers() {
        view.printAllPlayers(players);
    }

    public void updatePlayer(int id, Player newData) {
        for (Player p : players) {
            if (p.getId() == id) {
                p.setName(newData.getName());
                p.setTeam(newData.getTeam());
                p.setRole(newData.getRole());
                p.setRuns(newData.getRuns());
                p.setWickets(newData.getWickets());
                view.showMessage("Player updated.");
                return;
            }
        }
        view.showMessage("Player not found.");
    }

    public void deletePlayer(int id) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                view.showMessage("Player deleted.");
                return;
            }
        }
        view.showMessage("Player not found.");
    }

    public void topScorer() {
        if (players.isEmpty()) {
            view.showMessage("No players.");
            return;
        }
        Player top = Collections.max(players, Comparator.comparingInt(Player::getRuns));
        view.showMessage("Top Scorer:");
        view.printPlayer(top);
    }

    public void topWicketTaker() {
        if (players.isEmpty()) {
            view.showMessage("No players.");
            return;
        }
        Player top = Collections.max(players, Comparator.comparingInt(Player::getWickets));
        view.showMessage("Top Wicket-Taker:");
        view.printPlayer(top);
    }
}
