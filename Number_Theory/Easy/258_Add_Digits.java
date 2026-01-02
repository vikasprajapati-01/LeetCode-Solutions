class Solution {
    public int addDigits(int num) {
        int temp = num;
        while(num >= 10) {
            num = 0;
            while(temp > 0) {
                num += temp % 10;
                temp /= 10;
            }
            temp = num;
        }
        return num;
    }
}