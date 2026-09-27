class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n != 1){
            if(map.containsKey(n)){
                return false;
            }
            map.put(n, 1);
            int sum = 0;
            while(n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n/10;
            }
            n = sum;
        }
        return true;
    }
}
