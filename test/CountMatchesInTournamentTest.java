import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountMatchesInTournamentTest {
    @Test
    public void sixMatchesWithTeamSeven(){
        int numb = 7;
        int result = 6;
        assertEquals(result,CountMatchesInTournament.numberOfMatches(numb));
    }

}