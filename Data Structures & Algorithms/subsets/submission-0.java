class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        int m = nums.length;
        int n = 1 << m;


        for(int i = 0; i <n; i++) {
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j<m; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            sol.add(subset);

        }


    return sol;

    }

}
