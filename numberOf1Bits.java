// this solution is a slightly more memory eefficient solving method compared to Integer.bitCount()
// It uses implements Brian Kernighan's Algoorithm by jumping on the right most swithced bit (rsb)
// the algorithim then subtracts that bit from our input and proceeds to the next one while in the loop


public class numberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) { 
        int count = 0;
        
        while (n != 0) {
            n = n & (n-1);      //n = n with its right most on bit, switched off (clears the bit)
            count++;        //a bit must exist in order for it to be switched off
            
        }
        return count; 
    }
}


// for mare info on Kernighan's Algorithm visit https://www.techiedelight.com/brian-kernighans-algorithm-count-set-bits-integer/
