class WithVarags{  
   
 public int add(int ... n)
 {
	int sum=0;
	for(int i:n)
	{
		sum=sum+i;
	}
	return sum;
 }
  
 public static void main(String args[]){  
  
  WithVarags obj=new WithVarags();
  System.out.println(obj.add(4,1,5));
 
 }   
}  