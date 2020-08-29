package problems;
/**
 * Write a function to find fibonacciSerie of 100
 * */
public class FibonacciSeries {

    public static void main(String[] args) {
       // fibonacciSeries(100);
        System.out.println("fibonacciSerie of 100 : " + fibonacciSeries(100));
    }

    private static long fibonacciSeries(int n) {
        long sum, febo0 = 0, febo1 = 1, febo2;
        sum=febo0+febo1;

        for (int i=2; i< n;i++){

            febo2=febo1+febo0;
            sum+=febo2;
            febo1=febo2;
        }
        return sum;

        }
    }
