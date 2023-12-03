package org.example._99_to_125_DSA;

public class _125_Calculate_execution_time {
    public static void main(String[] args) throws InterruptedException{
        //--------------- IMPORTANT NOTES -----------------
//        1. This can be a helpful way to find the execution time if the Big O notation is somewhere between a best case and worst case.
//
//        2. I would not recommend using System.currentTimeMillis(), it's tied to your OS.
//        For example: A user can adjust the clock during execution, even to a past data, and this would give you negative time.
        //--------------------------------

        long start = System.nanoTime();

        // -------- program --------


        Thread.sleep(3000);

        // -------------------------------

        long duration = (System.nanoTime() - start)/1000000;
        System.out.println(duration + "ms");
    }
}
