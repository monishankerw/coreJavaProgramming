package org.example.corejava.leetscode;

public class DynamicsPrograming {
    public static class ClimbingStairs{
        public static void main(String[] args) {
            int n=3;
            int output=climbingStairs(n);
            System.out.println("output:"+output);
        }

        private static int climbingStairs(int n) {
            if(n<=1)
                return 1;
            int f=1,s=1,c=0;
            for (int i=2;i<=n;i++){
                c=f+s;
                f=s;
                s=c;
            }
            return c;
        }
    }
    public static class HouseRobber{
        public static void main(String[] args) {
            int[] nums={1,2,3,1};
            int output=houseRobber(nums);
            System.out.println("Output:"+output);
        }

        private static int houseRobber(int[] nums) {
            if(nums.length==0)
                return 0;
            if(nums.length==1)
                return nums[0];
            int p1=0,p2=0;
            for (int num:nums){
                int temp=p1;
                p1=Math.max(p1,p2+num);
                p2=temp;
            }
            return p1;
        }
    }
    public static class MinCostClimbingStairs{
        public static void main(String[] args) {
            int []costs={10,15,20};
            int output=minCostClimbingStairs(costs);
            System.out.println("Output:"+output);
        }

        private static int minCostClimbingStairs(int[] costs) {
            int n=costs.length;
            if(n==2){
                return Math.min(costs[0],costs[1]);
            }
            int first=costs[0];
            int second=costs[1];
            for (int i=2;i<n;i++){

                int current=costs[i]+Math.min(first,second);
                first=second;
                second=current;
            }
            return Math.min(first,second);
        }
    }
}
