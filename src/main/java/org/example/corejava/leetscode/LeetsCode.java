package org.example.corejava.leetscode;

import java.util.*;

public class LeetsCode {
//1: swapping,move zero elements end

 public static class Swapping{
     public static void main(String[] args) {
         int a=10,b=20;
         System.out.println("Before Swapping:"+a+":"+b);
//         int temp=a;
//         a=b;
//         b=temp;
         a=a+b;
        b=a-b;
        a=a-b;
         System.out.println(a+"After Swapping:"+a+":"+b);
     }
 }

    public static class MoveZero {
        public static void main(String[] args) {
            MoveZero moveZero = new MoveZero();
            int nums[] = {1, 4, 2, 0, 97, 6, 0, 7, 0};
            int[] output = moveZero.moveZeroEnd(nums);
            System.out.println(Arrays.toString(output));
        }

        private int[] moveZeroEnd(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    swapp(nums, i, j);
                    j++;
                }
            }
            return nums;
        }

        private void swapp(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }





    //2. Input: nums = [1,2,2,1,1,0]
//   Output: [1,4,2,0,0,0]
    public static class ApplyOperationArray {
        public static void main(String[] args) {
            ApplyOperationArray applyOperationArray = new ApplyOperationArray();

            int num[] = {1, 2, 2, 1, 1, 0};
            System.out.println("Original Array::" + Arrays.toString(num));
            int[] output = applyOperationArray.arrayOperation(num);
            System.out.println("Array after Operation::" + Arrays.toString(output));
        }

        private int[] arrayOperation(int[] num) {
            System.out.println("Step 1: Doubling adjacent equal elements and setting next to 0");

            // First loop: Double adjacent equal elements and set the next element to 0
            for (int i = 0; i < num.length - 1; i++) {
                System.out.println("Checking elements: num[" + i + "] = " + num[i] + " and num[" + (i + 1) + "] = " + num[i + 1]);
                if (num[i] == num[i + 1]) {
                    num[i] *= 2;
                    num[i + 1] = 0;
                    System.out.println("Modified Array after doubling: " + Arrays.toString(num));
                }
            }

            System.out.println("Step 2: Moving non-zero elements to the front");

            // Second loop: Move non-zero elements to the front
            int j = 0;
            for (int i = 0; i < num.length; i++) {
                System.out.println("Checking element at num[" + i + "] = " + num[i]);
                if (num[i] != 0) {
                    System.out.println("Swapping num[" + i + "] = " + num[i] + " with num[" + j + "] = " + num[j]);
                    swap(num, i, j);
                    System.out.println("Array after swapping: " + Arrays.toString(num));
                    j++;
                }
            }

            return num;
        }

        private void swap(int[] num, int i, int j) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            System.out.println("Swapped: num[" + i + "] = " + num[i] + ", num[" + j + "] = " + num[j]);
        }
    }


    //3.Input: nums = [0,1,2,2,3,0,4,2], val = 2
    //Output: 5, nums = [0,1,4,0,3,,,_]
    public static class RemoveArray {
        public static void main(String[] args) {
            RemoveArray removeArray = new RemoveArray();
            int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
            int val = 2;
            System.out.println("Original Array: " + Arrays.toString(nums));
            int output = removeArray.removeArray(nums, val);
            System.out.println("Array after removing value " + val + ": " + Arrays.toString(Arrays.copyOf(nums, output)));
            System.out.println("Number of elements left after removal: " + output);
        }

        private int removeArray(int[] nums, int val) {
            int j = 0; // Index for elements that are not equal to `val`
            System.out.println("Starting removal of value: " + val);

            for (int i = 0; i < nums.length; i++) {
                System.out.println("Checking element at index " + i + ": " + nums[i]);
                if (nums[i] != val) {
                    System.out.println("Element " + nums[i] + " is not equal to " + val + ", swapping with element at index " + j);
                    swap(nums, i, j);
                    System.out.println("Array after swap: " + Arrays.toString(nums));
                    j++;
                }
            }
            return j;
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            System.out.println("Swapped: nums[" + i + "] = " + nums[i] + ", nums[" + j + "] = " + nums[j]);
        }
    }
    public static class PascalTriangle{
        public static void main(String[] args) {
            int numRow=5;
            System.out.println("Number of row ::"+numRow);
            PascalTriangle x=new PascalTriangle();
            List<List<Integer>> outPut =x.pascalTriangle(numRow);
            System.out.println("OUTPUT:"+outPut);
        }

        private List<List<Integer>> pascalTriangle(int numRow) {
            List<List<Integer>> result = new ArrayList<>();
            System.out.println("Results::"+result);

            for (int i = 0; i < numRow; i++) {
                System.out.println("I::"+i);
                List<Integer> row = new ArrayList<>();
                System.out.println("Row:"+row);

                row.add(1);
                System.out.println("Ro");
                for (int j = 1; j < i; j++) {
                    System.out.println("IU:"+i);
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                    System.out.println("Rows:"+row);
                }

                if (i > 0) {
                    row.add(1);
                    System.out.println("Row:::"+row);

                }

                result.add(row);
                System.out.println("Result::"+result);
            }

            return result;
        }
    }
 /*   5.Valid Anagram
      6. Group Anagram
      7. Palindrome Permutation
      8. Find Resultant Array After Removing Anagrams
      9. Count Anagrams
      10. Group Shifted String
      11. Find Resultant Array After Removing Anagrams
  */
    //5.Valid Anagram

    public static class ValidAnagram{
        public static void main(String[] args) {
            String str1 = "islten";
            String str2 = "silent";
            ValidAnagram validAnagram = new ValidAnagram();
            boolean output = validAnagram.isValidAnagram(str1, str2);
            System.out.println("Anagram is valid: " + output);
        }

        private boolean isValidAnagram(String str1, String str2) {
            // Print input strings
            System.out.println("Input string 1: " + str1);
            System.out.println("Input string 2: " + str2);

            if (str1.length() != str2.length()) {
                System.out.println("Lengths are different, not an anagram");
                return false;
            }

            // Convert to char arrays
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            // Print char arrays before sorting
            System.out.println("Char array 1 before sorting: " + Arrays.toString(s1));
            System.out.println("Char array 2 before sorting: " + Arrays.toString(s2));

            // Sort char arrays
            Arrays.sort(s1);
            Arrays.sort(s2);

            // Print char arrays after sorting
            System.out.println("Char array 1 after sorting: " + Arrays.toString(s1));
            System.out.println("Char array 2 after sorting: " + Arrays.toString(s2));

            // Check if they are equal
            boolean result = Arrays.equals(s1, s2);
            System.out.println("Are both arrays equal: " + result);

            return result;
        }
    }

    //6. strs =
    //["eat","tea","tan","ate","nat","bat"]
    //Group Anagram


    public static class GroupAnagram {
        public static void main(String[] args) {
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

            System.out.println("Input Strings: " + Arrays.toString(strs));  // Print the input array

            GroupAnagram groupAnagram = new GroupAnagram();
            List<List<String>> result = groupAnagram.groupAnagrams(strs);

            System.out.println("Grouped Anagrams: " + result);  // Print the final grouped anagrams
        }

        private List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> stringListMap = new HashMap<>();

            for (String s : strs) {
                // Convert the string to a char array and sort it
                char[] chars = s.toCharArray();

                // Print the original string and its char array before sorting
                System.out.println("Original String: " + s);
                System.out.println("Char Array before sorting: " + Arrays.toString(chars));

                Arrays.sort(chars);

                // Print the char array after sorting
                System.out.println("Char Array after sorting: " + Arrays.toString(chars));

                // Convert the sorted char array back to a string
                String sortedStr = new String(chars);
                System.out.println("Sorted String: " + sortedStr);  // Print the sorted version of the string

                // Group the anagrams in the map
                stringListMap.putIfAbsent(sortedStr, new ArrayList<>());
                stringListMap.get(sortedStr).add(s);

                // Print the current state of the map
                System.out.println("Map State: " + stringListMap);
            }

            // Return a list of all the grouped anagrams
            return new ArrayList<>(stringListMap.values());
        }
    }


    /*
     Sliding Window Logic
This part handles the sliding window,
 where we move the right pointer through the string and adjust the window accordingly.
         // Right pointer of the sliding window moves from 0 to s.length()
        for (int right = 0; right < s.length(); right++) {
            // Increment the count of the current character
            charCount[s.charAt(right) - 'A']++;

            // Find the maximum frequency of any character in the current window
            maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);

            // Check if the current window is valid
            if ((right - left + 1) - maxCount > k) {
                // If the window is invalid, shrink it from the left
                charCount[s.charAt(left) - 'A']--;
                left++;
            }

            // Update the result with the maximum valid window size
            result = Math.max(result, right - left + 1);
        }

     */
    public static class CharacterReplacement {
        public int characterReplacement(String s, int k) {
            int[] charCount = new int[26]; // Array to store the frequency of each character
            int left = 0;
            int maxCount = 0;
            int result = 0;

            System.out.println("Initial State: ");
            System.out.println("String: " + s);
            System.out.println("Allowed replacements (k): " + k);
            System.out.println();

            // Sliding window approach
            for (int right = 0; right < s.length(); right++) {
                // Increment the count of the current character
                charCount[s.charAt(right) - 'A']++;
                System.out.println("Right pointer at index " + right + " (character: " + s.charAt(right) + ")");
                System.out.println("charCount array: " + java.util.Arrays.toString(charCount));

                // Update the maximum frequency of a character in the current window
                maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);
                System.out.println("Max frequency of any character in the window: " + maxCount);

                // If the window is invalid, shrink it from the left
                if ((right - left + 1) - maxCount > k) {
                    System.out.println("Window size exceeds allowed replacements. Shrinking window from the left.");
                    charCount[s.charAt(left) - 'A']--;
                    System.out.println("Decrement count of character '" + s.charAt(left) + "' at left pointer index " + left);
                    left++;
                    System.out.println("Left pointer moved to index " + left);
                }

                // Update the result with the maximum valid window size
                result = Math.max(result, right - left + 1);
                System.out.println("Current window size (right - left + 1): " + (right - left + 1));
                System.out.println("Current result (longest valid substring length so far): " + result);
                System.out.println("--------------------------------------");
            }

            return result; // Return the length of the longest valid substring
        }

        // Main method to test the characterReplacement method
        public static void main(String[] args) {
            CharacterReplacement solution = new CharacterReplacement();

            // Test case 1
            String s1 = "ABAB";
            int k1 = 2;
            System.out.println("Test Case 1:");
            System.out.println("Input: s = " + s1 + ", k = " + k1);
            System.out.println("Result: " + solution.characterReplacement(s1, k1));
            System.out.println("======================================\n");

            // Test case 2
            String s2 = "AABABBA";
            int k2 = 1;
            System.out.println("Test Case 2:");
            System.out.println("Input: s = " + s2 + ", k = " + k2);
            System.out.println("Result: " + solution.characterReplacement(s2, k2));
        }
    }

/*
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */

   public static class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            // Step 1: Sort the array
            Arrays.sort(nums);
            System.out.println("Sorted array: " + Arrays.toString(nums));

            // Step 2: Iterate through the array
            for (int i = 0; i < nums.length - 2; i++) {

                // Skip duplicate numbers for the first number
                if (i > 0 && nums[i] == nums[i - 1]) {
                    System.out.println("Skipping duplicate for nums[i]: " + nums[i]);
                    continue;
                }

                // Step 3: Use two-pointer technique to find the other two numbers
                int left = i + 1;
                int right = nums.length - 1;
                System.out.println("Checking for triplets with nums[i] = " + nums[i]);

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    System.out.println("Current triplet: [" + nums[i] + ", " + nums[left] + ", " + nums[right] + "], sum = " + sum);

                    if (sum == 0) {
                        // Found a triplet
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        System.out.println("Found triplet: [" + nums[i] + ", " + nums[left] + ", " + nums[right] + "]");

                        // Skip duplicates for the second number
                        while (left < right && nums[left] == nums[left + 1]) {
                            System.out.println("Skipping duplicate for nums[left]: " + nums[left]);
                            left++;
                        }
                        // Skip duplicates for the third number
                        while (left < right && nums[right] == nums[right - 1]) {
                            System.out.println("Skipping duplicate for nums[right]: " + nums[right]);
                            right--;
                        }

                        // Move both pointers inward after adding a valid triplet
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++; // We need a larger sum, move left pointer to the right
                        System.out.println("Sum < 0, moving left pointer to: " + nums[left]);
                    } else {
                        right--; // We need a smaller sum, move right pointer to the left
                        System.out.println("Sum > 0, moving right pointer to: " + nums[right]);
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            ThreeSum solution = new ThreeSum();

            // Test case 1
            int[] nums1 = {-1, 0, 1, 2, -1, -4};
            System.out.println("\nTest case 1:");
            List<List<Integer>> result1 = solution.threeSum(nums1);
            System.out.println("Input: " + Arrays.toString(nums1));
            System.out.println("Output: " + result1);

            // Test case 2
            int[] nums2 = {0, 1, 1};
            System.out.println("\nTest case 2:");
            List<List<Integer>> result2 = solution.threeSum(nums2);
            System.out.println("Input: " + Arrays.toString(nums2));
            System.out.println("Output: " + result2);

            // Test case 3
            int[] nums3 = {0, 0, 0};
            System.out.println("\nTest case 3:");
            List<List<Integer>> result3 = solution.threeSum(nums3);
            System.out.println("Input: " + Arrays.toString(nums3));
            System.out.println("Output: " + result3);
        }
    }




    public static class NumIdenticalPairs {
        public int numIdenticalPairs(int[] nums) {
            // Create a hashmap to store the frequency of each number
            HashMap<Integer, Integer> map = new HashMap<>();
            int goodPairs = 0; // Variable to count the number of good pairs

            System.out.println("Initial nums array: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Iterate through the array
            for (int num : nums) {
                // Check if the number already exists in the map
                if (map.containsKey(num)) {
                    // Print when we find a pair
                    System.out.println("Found duplicate of: " + num);
                    // Add the current count of this number to goodPairs (i.e., the count of previous occurrences)
                    goodPairs += map.get(num);
                    System.out.println("Number of good pairs so far: " + goodPairs);
                }

                // Update the count of this number in the map
                map.put(num, map.getOrDefault(num, 0) + 1);
                System.out.println("Updated frequency map: " + map);
            }

            System.out.println("Final number of good pairs: " + goodPairs);
            return goodPairs;
        }

        // Main method to run the solution
        public static void main(String[] args) {
            NumIdenticalPairs solution = new NumIdenticalPairs();

            // Test case 1
            int[] nums1 = {1, 2, 3, 1, 1, 3};
            System.out.println("Test Case 1:");
            int result1 = solution.numIdenticalPairs(nums1);
            System.out.println("Output: " + result1);

            // Test case 2
            int[] nums2 = {1, 1, 1, 1};
            System.out.println("Test Case 2:");
            int result2 = solution.numIdenticalPairs(nums2);
            System.out.println("Output: " + result2);

            // Test case 3
            int[] nums3 = {1, 2, 3};
            System.out.println("Test Case 3:");
            int result3 = solution.numIdenticalPairs(nums3);
            System.out.println("Output: " + result3);
        }
    }



   public static class InterchangeableRectangles {
        public long interchangeableRectangles(int[][] rectangles) {
            // HashMap to store the frequency of each ratio (width/height in reduced form)
            HashMap<String, Long> ratioMap = new HashMap<>();
            long count = 0; // To keep track of the number of interchangeable pairs

            System.out.println("Starting to process rectangles...");

            // Iterate over all rectangles
            for (int[] rectangle : rectangles) {
                int width = rectangle[0];
                int height = rectangle[1];
                System.out.println("Processing rectangle with width: " + width + " and height: " + height);

                // Calculate the greatest common divisor (GCD) of width and height
                int gcd = gcd(width, height);
                System.out.println("GCD of width and height: " + gcd);

                // Reduce the width and height by their GCD to get the simplified ratio
                int reducedWidth = width / gcd;
                int reducedHeight = height / gcd;
                System.out.println("Reduced width: " + reducedWidth + ", Reduced height: " + reducedHeight);

                // Store the ratio as a string "width:height"
                String ratio = reducedWidth + ":" + reducedHeight;
                System.out.println("Simplified ratio: " + ratio);

                // If this ratio is already in the map, add its frequency to the count of pairs
                if (ratioMap.containsKey(ratio)) {
                    count += ratioMap.get(ratio);
                    System.out.println("Found interchangeable pair with ratio " + ratio + ", increasing count to " + count);
                }

                // Update the frequency of the current ratio in the map
                ratioMap.put(ratio, ratioMap.getOrDefault(ratio, 0L) + 1);
                System.out.println("Updated ratio map: " + ratioMap);
            }

            System.out.println("Final number of interchangeable pairs: " + count);
            return count;
        }

        // Helper method to calculate the greatest common divisor (GCD)
        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        // Main method to test the solution
        public static void main(String[] args) {
            InterchangeableRectangles solution = new InterchangeableRectangles();

            // Test case 1
            int[][] rectangles1 = {{4, 8}, {3, 6}, {10, 20}, {15, 30}};
            System.out.println("Test Case 1 Output: " + solution.interchangeableRectangles(rectangles1));

            // Test case 2
            int[][] rectangles2 = {{4, 5}, {7, 8}};
            System.out.println("Test Case 2 Output: " + solution.interchangeableRectangles(rectangles2));
        }
    }

    //Best Time to Buy and Sell Stock
    //Easy
    //Maximum Product Subarray
    //Medium
    //Degree of an Array
    //Easy
    //Longest Turbulent Subarray
    //Medium
    //Maximum Score Of Spliced Array
    //Hard
    //Maximum Absolute Sum of Any Subarray
    //Medium
    //Maximum Subarray Sum After One Operation
    //Medium
    //Substring With Largest Variance
    //Hard
    //Count Subarrays With Score Less Than K
    //Hard
    //Maximum Value of a String in an Array
    //Easy
    //Find the Substring With Maximum Cost
    //Medium
    //K Items With the Maximum Sum
    //Easy
    //Maximum Good Subarray Sum
    //Medium

}

