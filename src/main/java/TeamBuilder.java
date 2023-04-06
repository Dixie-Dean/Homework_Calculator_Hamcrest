public class TeamBuilder {
    static final int NATIONAL_TEAM_SIZE = 10;

    public int[] drawUpTeam(int[][] regionalTeams) {
        int[] draft = regionalTeams[0];
        for (int i = 1; i < regionalTeams.length; i++) {
            draft = merge(draft, regionalTeams[i]);
        }
        return draft;
    }

    public int[] merge(int[] arrayA, int[] arrayB) {
        int[] result = new int[NATIONAL_TEAM_SIZE];
        int indexA = 0, indexB = 0;

        for (int i = 0; i < NATIONAL_TEAM_SIZE; i++) {

            if (indexA == arrayA.length) {
                result[i] = arrayB[indexB];
                indexB++;
            } else if (indexB == arrayB.length) {
                result[i] = arrayA[indexA];
                indexA++;
            } else if (arrayA[indexA] > arrayB[indexB]) {
                result[i] = arrayA[indexA];
                indexA++;
            } else {
                result[i] = arrayB[indexB];
                indexB++;
            }
        }
        return result;
    }
}
