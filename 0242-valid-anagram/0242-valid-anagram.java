class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] frequencyMap = new int[26];
        
        for(int i = 0 ; i < s.length() ; i++){
            char charS = Character.toLowerCase(s.charAt(i));
            char charT = Character.toLowerCase(t.charAt(i));

            frequencyMap[charS - 'a']++;
            frequencyMap[charT - 'a']--;

        }

        for(int count : frequencyMap){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}