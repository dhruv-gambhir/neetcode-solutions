class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int count;
        int n = piles.length;
        int res = piles[n-1];

        int l = 1;
        int r = piles[n-1];

        while(l<=r) {
            int mid = l + (r-l)/2;
            count = 0;
            for(int i=0; i<n; i++){
                count += Math.ceil((double) piles[i]/mid);
            }
            if(count <= h) {
                res = mid;
                r = mid -1;
            } else {
                l = mid +1;
            }
        }
        return res;
    }
}
