import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Lowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int max = 0;
        int min = n;
        for (int index = 1; index < 10; index++) {
            System.out.println("Enter a number: ");
             n = scanner.nextInt();
            if(n > max){
                max = n;
            }
            if(n<min){
                min = n;
            }

        }
        System.out.println("min: "+ min);
        System.out.println("max: "+ max);
    }
}
