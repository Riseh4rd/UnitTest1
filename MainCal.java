public class Calculator 
{
    
    public int MINUS(int a, int b)
    {
        return a-b;
    }
    
    
   public int PLUS(int a, int b)
    {
        return a+b;
    }
    
    
    public int UMNOW(int a, int b)
    {
        return a*b;
    }
    
    
    public int DELIT(int a, int b) 
    {
        if (b != 0) {
            return a / b;
        }
    
        return 0;
    }
    
}
