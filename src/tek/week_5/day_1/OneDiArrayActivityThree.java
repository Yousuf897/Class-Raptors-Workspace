package tek.week_5.day_1;

public class OneDiArrayActivityThree {
        /*
    *   Sports Ranking:

    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.
    Steps:

        Declare a 1D array to hold the names of 5 teams.
        Populate the array with names based on their ranking.
        To find the top-ranked team, access the element at index 0.
        Print the name of the top-ranked team.
    * */

    public static void main(String[] args) {
        String[] namesOfTeam = {"Team A", "Team B", "Team C", "Team D", "Team E" };
        System.out.println("Top-ranked team name is: " + namesOfTeam[0]);
    }
}
