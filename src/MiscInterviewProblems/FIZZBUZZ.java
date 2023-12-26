package MiscInterviewProblems;

public class FIZZBUZZ {
    public static void main(String[]args) {

        // FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".

        //1. Coding
        //2. Input = int i = Numbers from 1 to 100
        //3. Bruteforce logic  (i%3==0 && i%5==0) Print "FIZZBUZZ" / (i%3==0) Print "FIZZ" / (i%5==0) Print "BUZZ"
        //4. Logic correction

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }

        }





