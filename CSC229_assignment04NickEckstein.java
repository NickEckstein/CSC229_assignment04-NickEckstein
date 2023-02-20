/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229_assignment04.nickeckstein;

/**
 *
 * @author nicke
 */
public class CSC229_assignment04NickEckstein {
    public static void main(String[] args) {
        
    }

    // Task 1
    
    /*
    void countDown(int num)
    {
      if (num == 0) // test
                  System.out.println("Blastoff!");
       else {
                  System.out.println("...");
                    countDown(num-1); // recursive call
             } 
        }   
    */
    /*
    The output of the code would say "Blastoff!" if num was equal to 0, and anything above 0 would countdown to 0 recursively.
    
    */
    /*
    void countDown(int num)
    {
      if (num == 0) // test
                  System.out.println("Blastoff!");
       else if (num % 2 == 0){
                  System.out.println("...");
                    countDown(num-2);
                } 
       else {
           System.out.println("Must be even numbers");
       }
    }
    */
    /*
    This code will only run if there is an even number and will subtract by 2
    */
    
    /*
    The time complexity of the original algorithm is o(n).
    */
    
    
    /*
    =======================================================================
    */
    
    // Task 2
    
    /*
    int gcd(int x, int y) {

      if (x % y == 0) //base case

             return y;

       else

             return gcd(y, x % y);

}
    */
    /*
    The code will output y if x/y creates no remainder, and will return y with the 
    remainder if there is one. If you take 5/10, it will return 5.
    */
    
    /*
    int gcd(int x, int y) {
    
        if (x == y)
            
            return x;
    
        else if (x > y)
    
            gcd(x - y, y);
    
        else
    
            gcd(y, y-x);
    
    */
    
    /*
    ==========================================================================
    */
    
    // Task 3
    
    /*
    int fib(int n)

{

       if (n <= 0) // base case

            return 0;

      else if (n == 1) // base case

             return 1;

       else

             return fib(n – 1) + fib(n – 2);

}
    */
    
    /*
    The time complexity of the algorithm is o(n)
    */
    
    // Write a function that prints "Hello World" n times recursively
    
    /*
    public static int func(int n)
    if(n>0)
        func(n-1);
        System.out.println("Hello World")
    
    */
    
    // Write a function that returns the sum of all numbers between 
    // n1 and n2 that are multiples of 7 using recursion.
    
    /*
    public static int sevensum(int n)
    if(n==0)
        return n;
    else if (n % 7 == 0)
        return n + sevensum(n-1);
    else
        return n(n-1);
        System.out.println(sevensum(100));
    */
    
    // Write a function that implements the binary search recursively
    
    /*
    class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            if (arr[mid] == x)
                return mid;
  
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
    */
}
