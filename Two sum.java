Public class Solution {
    public int [] twoSum(int[] nums,int target ) {
    int [] result = new int[2];
    HashMap<Integer,Integer>  map = new HashMap<new HashMap<Integer,Integer>();
    for (int i=0;i<nums.length;i++){
       int difference =target - nums[i];
       if (map.containsKey(difference)){
         result[0] = i;
         result[i] = map.get(difference);
         result result ;
         }
         map.put(nums[i],i);
         }
         return result ;
         }
         }
