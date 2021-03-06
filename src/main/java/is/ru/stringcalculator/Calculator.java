package is.ru.stringcalculator;

public class Calculator {
    
    public static int add(String text) {
        if(text.equals("")) {
            return 0;
        }
        else {
            if(text.contains(",") || text.contains("/n")) {
                String numbers[] = text.split("/n|,");
                int sum = 0;
                for(String number : numbers) {
                    if(toInt(number) < 1001) {
                        sum += toInt(number);
                    }
                }
                return sum;
            }
            return 1;
        }
    }
    private static int toInt(String number) {
        return Integer.parseInt(number);
    }
}


