import java.util.Arrays;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a random number : ");
        number = scanner.nextInt();
        String result = "";

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }
        if (number >= 10 && number < 20) {
            result += getTeens(number) + " ";
        } else if (number > 0) {
            result += getOnes(number);
        }

        if (number >= 20 && number < 100) {
            int tens = number / 10;
            result += getTens(tens) + " ";
            int newNum = number % 10;
            result += getOnes(newNum);
        }

        if (number >= 100) {
            int hundreds = number / 100;
            result += getOnes(hundreds) + " hundred";
            number %= 100;
            if (number >= 10 && number < 20) {
                result += " and " + getTeens(number);
            } else if (number > 0 && number < 20) {
                result += " and " + getOnes(number);
            }

            if (number >= 20) {
                int tens = number / 10;
                result += " and " + getTens(tens) + " ";
                int newNum = number % 10;
                result += getOnes(newNum);
            }
        }

        System.out.println(result.trim());
    }

    public static String getOnes(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String getTeens(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String getTens(int number) {
        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";


        }

    }
}
