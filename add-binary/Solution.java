class Solution {
    public String addBinary(String a, String b) {
        int x=0;
        StringBuilder c = new StringBuilder();
        int n1=a.length()-1;
        int n2=b.length()-1;
        while(n1!=-1&&n2!=-1)    
        {
            if(a.charAt(n1)=='1'&&b.charAt(n2)=='1')
            {
                if(x==1)
                {
                    c.append('1');
                    x=0;
                
                }
                else
                {
                   c.append('0');
                }
                x=1;
            }
            else if(a.charAt(n1)=='0'&&b.charAt(n2)=='0')
            {
                if(x==1)
                {
                    c.append('1');
                    x=0;
                
                }
                else
                {
                    c.append('0');
                }
            }
            else
            {
                if(x==1)
                {
                    c.append('0');
                    x=1;
                }
                else
                {
                    c.append('1');
                }
            }
            n1--;
            n2--;
        }
        if(n1==-1)
        {
            for(int i=n2;i>=0;i--)
            {
                if(x==1)
            {
                if(b.charAt(i)=='1')
                {
                    c.append('0');
                }
                else
                {
                    c.append('1');
                    x=0;
                }
            }
            else
            {
                c.append(b.charAt(i));
            }
            }
        }
        else if(n2==-1)
        {
            for(int i=n1;i>=0;i--)
            {
                if(x==1)
            {
                if(a.charAt(i)=='1')
                {
                   c.append('0');
                }
                else
                {
                    c.append('1');
                    x=0;
                }
            }
            else
            {
                c.append(a.charAt(i));
            }
            }
        }
        if(x==1)
        {
            c.append('1');
        }
       return c.reverse().toString();
        
    }
}