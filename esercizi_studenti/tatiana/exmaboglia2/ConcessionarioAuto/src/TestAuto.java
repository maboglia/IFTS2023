import java.util.Locale;

public class TestAuto {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Auto panda = new Auto("FIAT","PANDA",1200,45,7.5);
		
		System.out.println(panda.toString());
		System.out.println(panda.Autonomia());
		
		Auto nuovo = new Auto("FIAT", "PANDA", 1000, 45,6.5);
		System.out.println(nuovo.toString());
		System.out.println(nuovo.Autonomia());
	}

}
