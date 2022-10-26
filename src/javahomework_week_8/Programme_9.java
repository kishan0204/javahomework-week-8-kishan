package javahomework_week_8;
/*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

public class Programme_9 {
    public static void main(String[] args) {

        int a,b,c,i,n;
        n=10;
        a=b=1;
        System.out.print(a+ "" +b);
        for ( i =1; i<= n-2; i++) {
            c = a + b;
            System.out.println(" ");
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    }

