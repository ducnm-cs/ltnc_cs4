public class Solution {
    static long fibonnacci(long n){
        if(n < 0)return -1;
        if(n <= 1)return n;
        else{
            if(fibonnacci(n - 1) >= Long.MAX_VALUE - fibonnacci(n - 2))return Long.MAX_VALUE;
            else return fibonnacci(n - 1) + fibonnacci(n - 2);
        }
    }

    static int gcd(int a, int b){
        if(b == 0)return a;
        else return gcd(b, a % b);
    }

    static boolean isPrime(int n){
        if(n == 2)return true;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)return false;
        }
        return n > 2;
    }

    static int reverse(int n){
        int nw = 0;
        while(n != 0){
            nw *= 10;
            nw += n % 10;
            n /= 10;
        }
        return nw;
    }

    static boolean isPalindrome(int n){
        int rev = reverse(n);
        return n == rev;
    }

    static int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int secondLargest(int[] arr){
        int mx = Integer.MIN_VALUE;
        int mx2 = Integer.MIN_VALUE;
        boolean check = false;
        for(int i = 0; i < arr.length; i++){
            if(mx < arr[i])mx = arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == mx)continue;
            if(mx2 < arr[i]){
                mx2 = arr[i];
                check = true;
            }
        }
        if(check)return mx2;
        else return -1;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.fibonnacci(10));
        System.out.println(s.gcd(18, 36));
        System.out.println(s.isPrime(36));
        System.out.println(s.reverse(36));
        System.out.println(s.isPalindrome(3663));
        System.out.println(s.sumOfDigits(36));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(s.secondLargest(arr));
    }
}
