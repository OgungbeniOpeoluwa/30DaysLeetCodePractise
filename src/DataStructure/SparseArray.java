package DataStructure;

public class SparseArray {

    public static int[] sparseArrayFunction(String[] arrays, String[] queries) {
        int [] result = new int[queries.length];
        int total = 0;
        for(int count = 0; count < queries.length;count++){
            for(int counts = 0; counts < arrays.length;counts++){
                if(queries[count].equals(arrays[counts])){
                    total++;
                    result[count] = total;
                }

            }
            total = 0;
        }
        return result;
    }
}
