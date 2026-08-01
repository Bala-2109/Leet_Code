class Solution {
    public boolean isHappy(int n) {
       int s=n;
       int f=n;
       do
       {
        s=sq(s);
        f=sq(sq(f));
       }while((s!=f)&&(f!=1));
       return f==1;
    }
    int sq(int m)
    {
        int x=0;
        while(m>0)
        {
            int r=m%10;
            x+=r*r;
            m=m/10;
        }
        return x;
    }
}