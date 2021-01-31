package com.company;

public  class Main {


    //targil1

    int num;

    public boolean isPrime() {
        boolean isPrime = true;
        if (num == 0 || num == 1) return false;
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (isPrime) {
                if (num % i == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }
            }
        }
        return isPrime;
    }


    //targil2

    public void prime(int num) {

        int i, j;
        int count = 0;
        for (i = 2; i <= 1000000; i++) {
            boolean IsPrime = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime) {
                if (IsPrime = true) {
                    count++;
                }
                if (count >= num) {
                    break;
                }
                System.out.println(i + ",");
            }
        }
    }

    //targil3

    public static void first100PrimeNumbers (String[] args) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }


    //targil 4

    public static boolean PerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }


    //targil 5


    public static void main(String[] args) {

        int i, number = 1000000, sum = 0, factor;
        for (i = 1; i < number; i++) {
            for (factor = 1; factor < number; factor++) {
                if (i % factor == 0) {
                    sum = sum + factor;
                }
                if (sum == i) {
                    System.out.println(sum);
                }
                sum = 0;
            }

        }
    }
}




