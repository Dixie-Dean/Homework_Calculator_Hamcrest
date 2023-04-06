import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TeamBuilderTests {
    TeamBuilder teamBuilder = new TeamBuilder();

    @Test
    public void mergeCorrectResult() {
        int[] firstTeam = { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 };
        int[] secondTeam = { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 };
        int[] expected = {45, 31, 31, 24, 22, 20, 18, 17, 15, 14};

        int[] result = teamBuilder.merge(firstTeam, secondTeam);

        assertThat(expected, is(equalTo(result)));
    }

    @Test
    public void mergeResultNotNull() {
        int[] firstTeam = { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 };
        int[] secondTeam = { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 };

        int[] result = teamBuilder.merge(firstTeam, secondTeam);

        assertThat(result, is(notNullValue()));
    }
}
