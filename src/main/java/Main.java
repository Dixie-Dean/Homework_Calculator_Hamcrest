import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TeamBuilder teamBuilder = new TeamBuilder();

        int[][] regionalTeams = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };

        int[] nationalTeam = teamBuilder.drawUpTeam(regionalTeams);
        System.out.println(Arrays.toString(nationalTeam));
    }
}
