class Solution{
		public boolean isPalindrome(String s){
				StringBuilder cleaned = new StringBuilder();
				for(int i=0; i<s.length(); i++){
						char ch = s.charAt(i);
						if(Character.isLetterOrDigit(ch)){
								cleaned.append(Character.toLowerCase(ch));
						}
				}
				String original = cleaned.toString();
				String reversed = cleaned.reverse().toString();
				return original.equals(reversed);
		}
}