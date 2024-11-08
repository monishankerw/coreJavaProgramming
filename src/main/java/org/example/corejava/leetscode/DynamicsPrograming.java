package org.example.corejava.leetscode;

public class DynamicsPrograming {
    public static class ClimbingStairs {
        public static void main(String[] args) {
            int n = 3;
            int output = climbingStairs(n);
            System.out.println("output:" + output);
        }

        private static int climbingStairs(int n) {
            if (n <= 1)
                return 1;
            int f = 1, s = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = f + s;
                f = s;
                s = c;
            }
            return c;
        }
    }

    public static class HouseRobber {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1};
            int output = houseRobber(nums);
            System.out.println("Output:" + output);
        }

        private static int houseRobber(int[] nums) {
            if (nums.length == 0)
                return 0;
            if (nums.length == 1)
                return nums[0];
            int p1 = 0, p2 = 0;
            for (int num : nums) {
                int temp = p1;
                p1 = Math.max(p1, p2 + num);
                p2 = temp;
            }
            return p1;
        }
    }

    public static class MinCostClimbingStairs {
        public static void main(String[] args) {
            int[] costs = {10, 15, 20};
            int output = minCostClimbingStairs(costs);
            System.out.println("Output:" + output);
        }

        private static int minCostClimbingStairs(int[] costs) {
            int n = costs.length;
            if (n == 2) {
                return Math.min(costs[0], costs[1]);
            }
            int first = costs[0];
            int second = costs[1];
            for (int i = 2; i < n; i++) {

                int current = costs[i] + Math.min(first, second);
                first = second;
                second = current;
            }
            return Math.min(first, second);
        }
    }

    public static class HouseRobberII {
        public static void main(String[] args) {
            int[] arr = {2, 3, 2};
            int output = houseRobberII(arr);
            System.out.println("Output:" + output);
        }

        private static int houseRobberII(int[] arr) {
            int n = arr.length;
            if (n == 1) {
                return arr[0];

            }
            int maxProfit1 = robLinear(arr, 0, n - 2);
            int maxProfit2 = robLinear(arr, 1, n - 1);

            return Math.max(maxProfit1,maxProfit2);
        }


        private static int robLinear(int[] arr, int start, int end) {
            int prevTwo = 0;
            int prevOne = 0;
            for (int i = start; i <= end; i++) {
                int current = Math.max(prevOne, prevTwo + arr[i]);
                prevTwo = prevOne;
                prevOne = current;
            }
            return prevOne;
        }
    }

    public static class CoinChangesII{
        public static void main(String[] args) {
            int amount=5;
            int []coins={1,2,5};
           int output= coinChangesII(amount,coins);
            System.out.println("Output:"+output);
        }

        private static int coinChangesII(int amount, int[] coins) {
            int[] dp=new int[amount+1];
            dp[0]=1;

            for(int coin:coins){
                for (int j=coin;j<=amount;j++){
                    dp[j]+=dp[j-coin];
                }
            }
            return dp[amount];
        }
    }
    public static class MaximumLengthOfRepatedSubarray{
        public static void main(String[] args) {
            int []nums1={1,2,3,2,1};
            int []nums2={3,2,1,4,7};
          int output=  maximumLengthOfRepatedSubarray(nums1,nums2);
            System.out.println("output:"+output);
        }

        private static int maximumLengthOfRepatedSubarray(int[] nums1, int[] nums2) {
            int m=nums1.length;
            int n=nums2.length;
            int [][]dp=new int[m+1][n+1];
            int maxLength=0;
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(nums1[i-1]==nums2[j-1]){
                        dp[i][j]=dp[i-1][j-1]+1;
                        maxLength=Math.max(maxLength,dp[i][j]);
                    }
                }
            }
            return maxLength;

        }
    }
}

