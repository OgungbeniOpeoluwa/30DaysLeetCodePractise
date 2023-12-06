public class CalculateMoneyInLeetCodeBank {

    public static int calculatorFunction(int numberOfDays) {
        int monitorNumberOfDays = 0;
        int money = 1;
        int tempBank = 1;
        int result = 0;
        for(int count = 1; count <= numberOfDays;count++){
            monitorNumberOfDays ++;
            result += money;
            if(monitorNumberOfDays == 7){
                monitorNumberOfDays = 0;
                money = 0;
                money += tempBank+=1;
                continue;
            }
            money++;

        }
        return result;
    }
}
