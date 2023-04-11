package telran.recursion.controller;

public class RecursionAppl {

    public static void main(String[] args) {
        int gcdNumber = gcd(66, 69);
        System.out.println(gcdNumber);

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int rem = a % b;
        a = b;
        b = rem;
        return gcd(a, b);
    }

    public static double sqrt(double x, double precision) {
        //TODO
        //ask to Hero from Alexandria
        // it's too hard for me, it's too much mathematica for me here
        return 0;
    }

    public static void print100() {
        //TODO *
        //print all numbers from 1 to 10
        //don't use any loops, streams, if-else and other choice operations
        // I don't know how to do that, because as u explained, in function must be a condition to exit from the Recursion, how to do it without if or any other choice operators, i don't know.
    }

}
