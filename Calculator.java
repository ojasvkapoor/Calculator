import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number ");
        int input1 = sc.nextInt();

        System.out.println("Enter Second Number ");
        int input2 = sc.nextInt();

        Calculator calc = new Calculator();

        String []arr = new String[5];
        arr[0] = " Addition of Number ";
        arr[1] = " Subtraction of Number ";
        arr[2] = " Multiplication of Number ";
        arr[3] = " Division of Number ";
        arr[4] = " Remainder of Number ";

        int add1 = calc.add(input1 , input2);
        int  sub1 = calc.subtract(input1 , input2);
        int multi1 = calc.multiply(input1 , input2);
        int div1 = calc.divide(input1 , input2);
        int rem1 = calc.modulo(input1 , input2);

        int []arr1 = new int[5];
        arr1[0] = add1 ;
        arr1[1] = sub1 ;
        arr1[2] = multi1 ;
        arr1[3] = div1 ;
        arr1[4] = rem1 ;

        for(int i=0 ; i< arr.length ; i++){
            System.out.println(arr[i]+ input1 + " and " + input2 + " is " + arr1[i]);
        }
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int i, int j) {
        if (i > j) {
            return i - j;
        } else if (i < j) {
            return j - i;
        }
            return i - j;
    }

    public int divide(int x, int y) {
        if (x > y) {
            return x / y;
        } else if (x < y) {
            return y / x;
        }
            return x / y;

    }

    public int modulo(int o, int n) {
        if (n > o) {
            return n % o;
        }
        else if (n < o){
            return o % n;
        }
            return n % o;
    }

    public int multiply(int m, int t) {
        return m * t;
    }
}