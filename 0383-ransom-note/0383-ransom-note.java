class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] frequencyMap = new int[26];

        for(int i = 0 ; i < magazine.length() ; i++){
            char charB = magazine.charAt(i);
            frequencyMap[charB - 'a']++;
        }

        for(int i = 0 ; i < ransomNote.length() ; i++){
            char charA = ransomNote.charAt(i);

            frequencyMap[charA - 'a']--;

            if (frequencyMap[charA - 'a'] < 0 ){
                return false;
            }
        }
        return true;
        
    }
}