import java.util.Scanner;

public class Main {

    public static String reversString(String inputString){
        String right;
        String left;

        int length = inputString.length();
        if(length <= 1){
            return inputString;
        }

        left = inputString.substring(0, length / 2);
        right = inputString.substring(length / 2, 0);
        return reversString(right) + reversString(left);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner("input.txt");
        String str = in.nextLine();
        String resultString = "";
        long end1000 = 0;
        long end10_000 = 0;
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++){
//            resultString = new StringBuilder(str).reverse().toString();
            resultString = reversString(str);
            if (i == 999){
                end1000 = System.currentTimeMillis();
            }
            if(i == 9_999){
                end10_000 = System.currentTimeMillis();
            }
        }
        long end100_000 = System.currentTimeMillis();

        System.out.println(resultString);
        System.out.println("1000: " + end1000);
        System.out.println("10 000: " + end10_000);
        System.out.println("100 000: " + end100_000);


    }
}
