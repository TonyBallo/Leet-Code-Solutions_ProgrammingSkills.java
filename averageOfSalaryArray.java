import java.lang.*;

public class averageOfSalaryArray {
    public double average(int[] salary) {
        int total = 0;
        // initialize to smallest and largest integer respectively to avoid bounds errors
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int s:salary){
            total += s;
            max =Math.max(s,max); //finds max value usiing .max() function
            min = Math.min(s,min); //finds min value using .min() function
        }
        total = total - max - min;      //subtract max and min values since we are ignoring them in calculation
        return total * 1.0d / (salary.length - 2);       //need to make total a double before using it to find the average
    }
}
