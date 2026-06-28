class Solution {
    public boolean isAnagram(String s, String t) {
      char [] arr=new char[26];
        char [] arr2=new char[26];
         for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                arr[c - 'a']++;
            }
        }
         for (char c : t.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                arr2[c - 'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=arr2[i]){
                
                return false;
            }
        }
       return true; 
    }
}
