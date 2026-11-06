class Solution {
    public double myPow(double x, int n) {
        double pow = 1;
        while (n>0){
            if (n%2 == 1){
                pow = pow*x;
            }
            x = x*x;
            n = n/2;
        }
        while (n<0){
            if (n%2 == -1){
                pow = pow/x;
            }
            x = x*x;
            n = n/2;
        }
        return pow;
    }
}