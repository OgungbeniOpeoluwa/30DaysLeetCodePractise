public class CountMatchesInTournament {

    public static int numberOfMatches(int numb) {
        int matches;
        int result = 0;
            if (numb % 2 != 0) {
                matches = (numb - 1) / 2;
                numb = ((numb - 1) / 2) + 1;
            } else {
                matches = numb / 2;
                numb = numb / 2;

            }
            result += matches;
        if(numb != 1)result +=numberOfMatches(numb);
        return result;
    }
}
