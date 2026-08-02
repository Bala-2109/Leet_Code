class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0)
    {
    double og = x;
    double rv = 0;
    int rm;
    while (x != 0) {
        rm = x % 10;
        rv = rv * 10 + rm;
        x /= 10;
    }
    if (og == rv) {
        return true;
    } else {
        return false;
    }
    }
    else
    {
        return false;
    }
    }
}