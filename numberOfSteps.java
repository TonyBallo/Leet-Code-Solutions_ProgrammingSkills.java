class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) { //even
                num = num / 2; 
                steps++;
            } else {
                num--;
                steps++;
            }   
        }
        return steps;
    }
}