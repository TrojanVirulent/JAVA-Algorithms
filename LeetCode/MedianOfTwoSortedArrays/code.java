class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int x = 0, y = 0, k=0;
        int mer_arr[] = new int[m+n];
        while(x<m && y<n)
        {
            if(nums1[x] < nums2[y])
            {
                mer_arr[k] = nums1[x];
                x++;
            }
            else 
            {
                mer_arr[k] = nums2[y];
                y++;
            }
            k++;
        }
        while(x < m)
        {
            mer_arr[k] = nums1[x];
            x++;
            k++;            
        }
        
        while(y < n)
        {
            mer_arr[k] = nums2[y];
            y++;
            k++;            
        }
        
        if((m+n) % 2 == 0)
        {
            int i = (m+n)/2;
            double a = mer_arr[i];
            double b = mer_arr[i-1];
            return ((a+b)/2);
        }
        else
           return (mer_arr[(m+n)/2]);
        
    }
}