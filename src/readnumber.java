import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class readnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = sc.nextInt();
        redNumber(number);

    }

    static void redNumber(int number) {
        if (number >= 0 && number < 10) {
            System.out.print(onetonice(number));
        } else if (number < 20) {
            if (number < 16) {
                System.out.print(tentofifteen(number));
            } else {
                System.out.print(onetonice(number % 10) + "teen");
            }
        } else if (number < 100) {
            if (number%10==0){
                System.out.println(twentytonicetynine(number/1090));
            }
            else {
                System.out.println(twentytonicetynine(number/10)+"-"+onetonice(number%10));
            }
        }
    }

    @Contract(pure = true)
    static String onetonice(int number) {
        String str = "";
        switch (number) {
            case 1: {
                str = "one";
                break;
            }
            case 2: {
                str = "two";
                break;
            }
            case 3: {
                str = "three";
                break;
            }
            case 4: {
                str = "four";
                break;
            }
            case 5: {
                str = "five";
                break;
            }
            case 6: {
                str = "six";
                break;
            }
            case 7: {
                str = "seven";
                break;
            }
            case 8: {
                str = "eight";
                break;
            }
            case 9: {
                str = "nine";
                break;
            }

        }
        return str;
    }

    @Contract(pure = true)
    static String tentofifteen(int number) {
        String str = "";
        switch (number) {
            case 10: {
                str = "Ten";
                break;
            }
            case 11: {
                str = "Eleven";
                break;
            }
            case 12: {
                str = "Tewlve";
                break;
            }
            case 13: {
                str = "Thirteen";
                break;
            }
            case 14: {
                str = "fourteen";
                break;
            }
            case 15: {
                str = "Fifteen";
                break;
            }
        }
        return str;
    }

    @Contract(pure = true)
    static String twentytonicetynine(int number) {
        String str = "";
        switch (number) {
            case 2: {
                str = "Twenty";
                break;
            }
            case 3: {
                str = "Thirty";
                break;
            }
            case 4: {
                str = "Forty";
                break;
            }
            case 5: {
                str = "Fifty";
                break;
            }
            case 6: {
                str = "Sixty";
                break;
            }
            case 7: {
                str = "Seventy";
                break;
            }
            case 8: {
                str = "Eighty";
                break;
            }
            case 9: {
                str = "Ninety";
                break;
            }
        }
        return str;
    }
}
