class VarArgs{
static void fun(int ...a)
    {
      
   System.out.println("No of arguments:" + a.length);
        
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }
  
    
    public static void main(String args[])
    {
        
        fun(59);         
        fun(7, 9, 3, 5);  
        fun();            
    }
}