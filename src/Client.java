
public class Client {

	public static void main(String args[]) {
		int[] arrs = { 2, 3, 4, 1, 2, 3, 4 };

		for (int i = 0; i < arrs.length; i++) {

			for (int j = i + 1; j < arrs.length; j++) {

				if (arrs[j] < arrs[i]) {
					// swap
					int tmp = arrs[i];
					arrs[i] = arrs[j];
					arrs[j] = tmp;

				}
			}

		}

		for (int tmp : arrs) {
			System.out.print(tmp + " ");
		}
	}

}
