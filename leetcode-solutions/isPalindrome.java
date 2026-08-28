class isPalindrome {
    public boolean ispalindrome(int x) {
      if(x<0)
      {
        return false;
      }
      int temp=x;
      int reversed=0;
      int digit=0;
    while(x!=0)
    {
         digit=x%10;
        reversed=reversed*10+digit;
        x=x/10;
    }
    if(reversed==temp)
    {
        return true;
    }
    return false;

    }
}