class subtractProdAndSum {
    public int subtractProductAndSum(int n) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int digit = 0;
        
        while (n > 0) {
            digit = n % 10; 
            sumOfDigits += digit; 
            productOfDigits *= digit; 
            n /= 10; 
        }
    
        return productOfDigits - sumOfDigits; 
    }
}