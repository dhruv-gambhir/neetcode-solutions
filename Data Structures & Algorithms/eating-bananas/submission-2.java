class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int count;
        int n = piles.length;

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

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
