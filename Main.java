package com.company;
public  class Main {
    public static void main(String[] args) {
        //  System.out.println(isPrime( 2) );
        // prime();
        //  firstPrimes();
        //System.out.println(PerfectNumbers(8128));
        //Perfects();
    }

    //targil1

    int num;

    public static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //targil2

    public static int prime() {
        int i;
        for (i = 2; i < 1000000; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
        return i;
    }


    //targil3

    public static void firstPrimes() {
        int i, cnt = 0;
        for (i = 2; i < 1000000; i++) {
            if (isPrime(i)) {
                cnt++;
                System.out.println(i);
            }
            if (cnt == 100) {
                break;
            }
        }
    }


        //targil 4
        public static boolean PerfectNumbers(int n) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                            return true;
                          }
            else {
                  return false;
                 }

    }

    //targil 5


    public static void Perfects(){
      int i;
      for(i=0;i<1000000;i++){
          if (PerfectNumbers(i) == true){
              System.out.println(i);
          }
          }
      }
}








