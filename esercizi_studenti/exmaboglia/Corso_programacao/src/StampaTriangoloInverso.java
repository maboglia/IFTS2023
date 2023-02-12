
public class StampaTriangoloInverso {

	public static void main(String[] args) {
		
		
		int n = 6;
		
		for(int i = 1;i<=n;i++) {
			System.out.print("#");
			for(int j= 1;j<=n-i;j++) {
				System.out.print("#");
			}System.out.println();
		}
		
	}
	
}
