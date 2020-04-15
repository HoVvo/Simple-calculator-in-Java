/*
 Hovhannes Margaryan
 CS/IS 112 - 1251
 12.07.2019
*/
import java.util.Scanner;

public class Lab11 {

    private double firstNumber;
    private double secondNumber;
    private String method;
    private Scanner keyboard = new Scanner(System.in);

    public String getMethod()
    {
        System.out.print("Please enter the operation. addition|subtraction|multiplication|division: ");
        return keyboard.nextLine();
    }
    public double getFirstNumber()
    {
        System.out.print("Please enter first number: ");
        return keyboard.nextDouble();
    }
    public double getSecondNumber()
    {
        System.out.print("Please enter second number: ");
        return keyboard.nextDouble();
    }

    public void calculateNumbers(String method, double n1, double n2)
    {
        switch (method)
        {
            case "addition":
                System.out.print(n1+" + "+n2+" = "+(n1+n2));
                break;
            case "subtraction":
                System.out.print(n1+" - "+n2+" = "+(n1-n2));
                break;
            case "multiplication":
                System.out.print(n1+" * "+n2+" = "+(n1*n2));
                break;
            case "division":
                System.out.print(n1+" / "+n2+" = "+(n1/n2));
                break;
            default:
                System.out.print("Invalid method ! ! ");
                break;
        }
    }

    public static void main(String[] args)
    {
        Lab11 calculator = new Lab11();
        calculator.method = calculator.getMethod();
        calculator.firstNumber = calculator.getFirstNumber();
        calculator.secondNumber = calculator.getSecondNumber();
        calculator.calculateNumbers(calculator.method,calculator.firstNumber,calculator.secondNumber);
    }
}
