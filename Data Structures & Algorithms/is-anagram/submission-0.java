class Solution{
		public boolean isAnagram(String s, String t){
				if(s.length() != t.length()){
						return false;
				}
				Map<Character, Integer> freq = new HashMap<>();
				for(int i=0; i<s.length(); i++){
						char ch = s.charAt(i);
						freq.put(ch, freq.getOrDefault(ch, 0) + 1);
				}
				for(int i=0; i<t.length(); i++){
						char ch = t.charAt(i);
						freq.put(ch, freq.getOrDefault(ch, 0) - 1);
				}
				for(int count : freq.values()){
						if(count != 0){
								return false;
						}
				}
				return true;
		}
}