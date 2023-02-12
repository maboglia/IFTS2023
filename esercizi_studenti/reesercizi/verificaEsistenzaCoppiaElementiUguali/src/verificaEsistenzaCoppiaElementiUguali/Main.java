package verificaEsistenzaCoppiaElementiUguali;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Main esempio = new Main();
		System.out.println(esempio.coppiaUguali(a));
	}

	boolean coppiaUguali(int[] a) {
		boolean coppiaUguali = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					coppiaUguali = true;
				}
			}
		}
		return coppiaUguali;
	}
}