package DataStructure;

public class CompareTheTriplet {

    public static int[] compareTripletFFunction(int[] alice, int[] bob) {
        int [] result = new int [2];
        if(alice.length == bob.length) {
            for (int count = 0; count < alice.length; count++) {
                int bobScore = bob[count];
                int aliceScore = alice[count];
                if (aliceScore > bobScore) {
                    result[0] += 1;
                } else if (aliceScore < bobScore) {
                    result[1] += 1;
                }

            }
        }
            return result;

    }
}
