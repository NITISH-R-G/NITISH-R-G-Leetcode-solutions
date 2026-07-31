class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim();
        String[] b = a.split("[^A-Z,a-z]");
        return b[b.length - 1].length();
    }
}