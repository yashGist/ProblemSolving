package com.problem.solving;

public class Armstrong {

    public static void main(String[] args) {
        int n = 371;
        int temp = n;
        int rem=0;
        int armstrong=0;
        while(n!=0){
            rem = n%10;
            armstrong += rem*rem*rem;
            n/=10;
        }
        if (temp==armstrong){
            System.out.println("Armstrong!");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}
