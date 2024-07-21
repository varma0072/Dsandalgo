package org.example.sums.normalpracticeproblems;

public class Palandrome {
    public static void executeThisMethodAsMain(){
        Palandrome palandrome = new Palandrome();
        int number = 201 ;
        boolean result = palandrome.isNumberPalindrome( number);
        System.out.println(result);
    }

    private boolean isNumberPalindrome(int number){
        int num = number;
        int rev = 0;
        if(number < 1)
            System.out.println("please give above zero");
        boolean check = true;
        while(check){
            int val = num % 10 ;
           rev =  (rev * 10) + val;
           num = num / 10 ;
           if(num < 1){
               check = false;
           }
        }
        return rev == number;
    }
}
