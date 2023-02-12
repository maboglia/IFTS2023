package verificaSequenzaCrescente;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Main crescente = new Main();
		System.out.println(crescente.crescente(a));
	}

	boolean crescente(int[] a) {
		boolean crescente = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					continue;
				} else if (a[i] > a[j]) {
					crescente = false;
				}
			}
		}
		return crescente;
	}
}