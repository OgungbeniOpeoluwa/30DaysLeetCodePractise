import java.util.*;
import java.util.stream.Collectors;

public class WinnerOfArrayGame {

    public static int returnWinnerInArrayGame(int [] values, int rounds) {
       List<Integer> value = Arrays.stream(values).boxed().collect(Collectors.toList());
        System.out.println(value.stream());
        if(rounds > value.size()){
           return value.stream().max(Comparator.naturalOrder()).get();
        }
        HashMap<Integer,Integer> counter = new HashMap<>();
        int first = 0;
        int second= 0;
        int max = 0;

        while(max  != rounds) {
            first = value.getFirst();
            second= value.get(1);
            if( first > second) {
                value = remove(value,second);
                value.add(second);
                counter = countValue(counter,first);
                max = counter.get(first);

            }else {
                value = remove(value, first);
                value.add(first);
                counter = countValue(counter, second);
                max = counter.get(second);
            }


        }
        return counter.entrySet().stream()
                .filter(x->x.getValue() == rounds).map(Map.Entry::getKey).findAny().orElseThrow();
    }

    private  static  List<Integer> remove (List<Integer>value,int number){
        List<Integer> result = new ArrayList<>();
        for (int val: value) {
            if (val == number){
                continue;
            }
            result.add(val);

        }
        return result;
    }
    private static HashMap<Integer,Integer> countValue(HashMap<Integer,Integer> value,int key){
        if(value.containsKey(key)){
            value.put(key, value.get(key)+1);
        }
        else value.put(key,1);
        return value;
    }




}
