/*Check whether a number is Perfect Number or not
Problem Statement: Perfect Number. Write a program to find whether a number is a perfect number or not.

A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself).*/

import java.util.Scanner;

public class PerfectNumer {
    public static boolean isperfect(int n){
        int divisor_som=0;
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
            divisor_som = divisor_som+i;
            }
        }
        if(divisor_som==n){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(isperfect(n)){
            System.out.println(n+"Is a perfect Number");
        }
        else{
            System.out.println(n+"Is not a perfect Number");
        }
    }
}
