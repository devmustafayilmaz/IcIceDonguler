
public class IcIcedongu {

	public static void main(String[] args) {
		int i = 1;
		
		while (i<100) {
			int k = 0;
			while(k<=5) {
				
				int carpim = i * k;
				System.out.println(k+"x"+i+"="+carpim);
				k=k+1;
				
			}i=i+1;
		} 
		System.out.println("--------------------");
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		for(int y =1;y<=10;y++) {
			
			for(int z=1; z<=10; z++) {
				int carpim;
				carpim=y*z;
				System.out.println(y+"x"+z+"="+carpim);
				
			}
			
		}
	} 
	
	

}
