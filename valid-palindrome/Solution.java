class Solution {
    public boolean isPalindrome(String s) {
        String text = s.replaceAll("[^a-zA-Z0-9]", "");
        text=text.toLowerCase();
        int n=text.length();
        String rev="";
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+text.charAt(i);
        }
        if(text.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}