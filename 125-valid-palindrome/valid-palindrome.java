class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String revClean = new StringBuilder(clean).reverse().toString();
        if(clean.equals(revClean)){
            return true;
        }
        return false;
    }
}