
public class ellooping {
	public static void main(String[] args){
		int loopmaksimal = 5;
		int a = 1, b, c, d;
		
		while(a <= loopmaksimal)
		{
			b = 1;
			while(b <= a)
			{
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
			a++;
		}
		
		c = loopmaksimal-1;
			while(c >= 1)
		{
			d = 1;
			while(d <= c)
			{
				System.out.print(d+" ");
				d++;
			}
			System.out.println();
			c--;
		}
	}
	


    
}
