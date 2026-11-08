class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num<2){
            return false ;
        }
        int i = 2;
        int sum = 1;
        while (i<=num/2){
            if (num%i==0){
                sum = sum + i;
            }
            i = i+1;
        }
        if (sum == num){
            return true;
        }
        return false;
    }
}