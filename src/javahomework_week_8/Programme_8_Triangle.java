package javahomework_week_8;
/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/

public class Programme_8_Triangle {
    //    int rows = 10;
//       for (int i = 1; i <= rows; i++) {
//        for (int j = 1; j <= i; j++) {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("@");


        }

    }  }