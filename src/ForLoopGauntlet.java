
public class ForLoopGauntlet {
	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		for4();
	}

	static void for1() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}

	static void for2() {
		for (int j = 100; j > -1; j--) {
			System.out.println(j);
		}
	}
	static void for3() {
		for (int t = 2; t < 101; t = t + 2) {
			System.out.println(t);
		}
	}
	static void for4() {
		for (int h = 1; h < 100; h = h + 2) {
			System.out.println(h);
		}
	}
}
