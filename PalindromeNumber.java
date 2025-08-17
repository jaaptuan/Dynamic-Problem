class PalindromeNumber {
    public boolean isPalindrome(int x) {
       
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber sol = new PalindromeNumber();
        System.out.println(sol.isPalindrome(12121));   
        System.out.println(sol.isPalindrome(-1216));  
        System.out.println(sol.isPalindrome(10));    
        System.out.println(sol.isPalindrome(1221)); 
    }
}
