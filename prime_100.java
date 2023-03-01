public class prime_100 {
    public static void main(String[] args) {
	int i,count,j;
	int n=100;
	for(i=2;i<=n;i++)
	{
	    count=0;
	    for(j=1;j<=i;j++)
	    {
	        if(i%j==0)
	        {
	            count++;   
                System.out.println(count);     
	        }
	    }// second for bracket
	    if(count==2)
        {
	        System.out.print(i+"  ");     
	    }
    }//first for bracket closing
}// psvm bracket
}// closing bracket

