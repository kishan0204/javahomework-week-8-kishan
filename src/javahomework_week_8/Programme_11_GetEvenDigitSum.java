package javahomework_week_8;/*11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static*/

public class Programme_11_GetEvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int a =0; // total
        int b;
        if (number>0) {
            while (number != 0) {
                b = number % 10;
                if (b % 2 == 0) {
                    System.out.println(b + "Even gidit");
                    a = a + b;
                }
                number = number / 10;
            }
            return a;  // total
        }
        return -1;

                }
            }




