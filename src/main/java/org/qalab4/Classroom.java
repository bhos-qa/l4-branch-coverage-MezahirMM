package org.qalab4;
import java.io.IOException;

public class Classroom {
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a -b;
    }
    public double square(double a){
        return a*a;
    }
    public double squareRoot(double a) {
        if (a >= 0)
            return Math.sqrt(a);
        return 0;
    }
    public boolean isOdd(int a) {
        return a % 2 != 0;
    }
    public boolean isEven(int a) {
        return a % 2 == 0;
    }
    public double logarithm(double a) {
        return Math.log(a);
    }
    public double logarithmTen(double a){
        return Math.log10(a);
    }
    // vulnarable code
    public void vulnCode() throws IOException {
        Runtime.getRuntime().exec("classroom.exe");
    }
}

