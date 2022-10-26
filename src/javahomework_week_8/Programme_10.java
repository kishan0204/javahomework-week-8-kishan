package javahomework_week_8;/*10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/

public class Programme_10 {


    // Function to find Nth Armstrong Number
    static int NthArmstrong(int n) {
        int count = 0;

        // upper limit from integer
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int num = i, rem, digit = 0, sum = 0;

            // Copy the value for num in num
            num = i;

            // Find total digits in num
            digit = (int) Math.log10(num) + 1;

            // Calculate sum of power of digits
            while (num > 0) {
                rem = num % 10;
                sum = sum + (int) Math.pow(rem, digit);
                num = num / 10;
            }

            // Check for Armstrong number
            if (i == sum)
                count++;
            if (count == n)
                return i;
        }
        return n;
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 10;
        System.out.println(NthArmstrong(n));
    }
}