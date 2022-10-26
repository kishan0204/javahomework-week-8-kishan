package javahomework_week_8;
/*Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
names firstNumber and secondNumber both of type double.*/

public class Programme_18_SumCalculator {
    public static void main(String[] args) {
        Programme_18_SumCalculator programme_18_sumCalculator = new Programme_18_SumCalculator();
        programme_18_sumCalculator.setFirstNumber(5.00);
        programme_18_sumCalculator.setSecondNumber(4);
        System.out.println("add= " + programme_18_sumCalculator.getAdditionResult());
        System.out.println("subtract= " + programme_18_sumCalculator.getSubtractionResult());
        programme_18_sumCalculator.setFirstNumber(5.25);
        programme_18_sumCalculator.setSecondNumber(0);
        System.out.println("multiply= " + programme_18_sumCalculator.getMultiplicationResult());
        System.out.println("divide= " + programme_18_sumCalculator.getDivisionResult());
    }
    private double firstNumber;
    private double secondNumber;   // instance variable
    //method no parameter

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    //now make it method with parameter
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;// adding
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber; //subtraction
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        } else {
            return (this.firstNumber / this.secondNumber);
        }
    }
}
