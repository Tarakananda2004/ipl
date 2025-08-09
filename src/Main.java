import controller.PlayerController;
import model.Player;
import view.PlayerView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(view);

        int choice;
        do {
            System.out.println("\nIPL Player Management System");
            System.out.println("1. Add Player");
            System.out.println("2. View All Players");
            System.out.println("3. Update Player");
            System.out.println("4. Delete Player");
            System.out.println("5. Show Top Scorer");
            System.out.println("6. Show Top Wicket-Taker");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Team: ");
                    String team = sc.nextLine();
                    System.out.print("Role: ");
                    String role = sc.nextLine();
                    System.out.print("Runs: ");
                    int runs = sc.nextInt();
                    System.out.print("Wickets: ");
                    int wickets = sc.nextInt();
                    controller.createPlayer(new Player(id, name, team, role, runs, wickets));
                    break;
                case 2:
                    controller.readAllPlayers();
                    break;
                case 3:
                    System.out.print("Enter Player ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Team: ");
                    String newTeam = sc.nextLine();
                    System.out.print("New Role: ");
                    String newRole = sc.nextLine();
                    System.out.print("New Runs: ");
                    int newRuns = sc.nextInt();
                    System.out.print("New Wickets: ");
                    int newWickets = sc.nextInt();
                    controller.updatePlayer(uid, new Player(uid, newName, newTeam, newRole, newRuns, newWickets));
                    break;
                case 4:
                    System.out.print("Enter Player ID to delete: ");
                    int did = sc.nextInt();
                    controller.deletePlayer(did);
                    break;
                case 5:
                    controller.topScorer();
                    break;
                case 6:
                    controller.topWicketTaker();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (choice != 0);

        sc.close();
    }
}
