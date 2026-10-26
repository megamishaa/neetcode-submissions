class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		    Map<Integer, Integer> freq = new HashMap<>();
				for(int num : nums){
						freq.put(num, freq.getOrDefault(num, 0) + 1);
				}
				
				List<Integer>[] buckets = new List[nums.length + 1];
				for(int num : freq.keySet()){
						int count = freq.get(num);
						if(buckets[count] == null){
								buckets[count] = new ArrayList<>(); //new number added
						}
						buckets[count].add(num);
				}
    
    int[] result = new int[k];
    int index = 0;
    for(int i=buckets.length-1; i>=0; i--){ // traverse buckets in desc order
		    if(buckets[i] != null){
				    for(int num : buckets[i]){
						    result[index++] = num;
						    if(index == k){
								    return result;
						    }
				    }
		    }
		}
		return result;  
  }
}