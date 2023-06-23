class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int low = 0, high = len - 1;
        int sum = numbers[low] + numbers[high];
        while(sum != target){
            if(sum < target) low++;
            else high--;
            sum = numbers[low] + numbers[high];
        }
        return new int[]{low + 1, high + 1};
    }
}
