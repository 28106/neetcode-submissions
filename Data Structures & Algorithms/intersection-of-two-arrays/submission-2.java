class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
         HashSet<Integer> result = new HashSet<>();
        int i = 0;
        while(i < nums1.length){
            hs.add(nums1[i]);
            i++;
        }
        int j = 0;
        while(j < nums2.length){
            int right = nums2[j];
            if(hs.contains(nums2[j])){
                result.add(nums2[j]);
            }
            j++;

        }
         int[] ans = new int[result.size()];
        int k = 0;

        for (int x : result) {
            ans[k] = x;
            k++;
        }

        return ans;
       
    }
}