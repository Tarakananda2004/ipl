package model;

public class Player {
    private int id;
    private String name;
    private String team;
    private String role;
    private int runs;
    private int wickets;

    public Player(int id, String name, String team, String role, int runs, int wickets) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getTeam() { return team; }
    public String getRole() { return role; }
    public int getRuns() { return runs; }
    public int getWickets() { return wickets; }

    public void setName(String name) { this.name = name; }
    public void setTeam(String team) { this.team = team; }
    public void setRole(String role) { this.role = role; }
    public void setRuns(int runs) { this.runs = runs; }
    public void setWickets(int wickets) { this.wickets = wickets; }
}
