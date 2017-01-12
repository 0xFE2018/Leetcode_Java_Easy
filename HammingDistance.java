package Easy;

public class HammingDistance {

	public static void main(String... args) {
		HammingDistance obj= new HammingDistance();
		System.out.println(obj.hammingDistance(3, 16));
	}

	public int hammingDistance(int x, int y) {
		int[] binaryNum1 = convertToBinary(x);
		int[] binaryNum2 = convertToBinary(y);
		int hamming = 0;
		for (int i = 0; i < 32; i++) {
			if (binaryNum1[i] != binaryNum2[i]) {
				hamming++;
			}
		}

		return hamming;

	}

	public int[] convertToBinary(int decimalValue) {

		int[] binary = new int[32];
		for (int i = 31; i >= 0; i--) {
			binary[i] = decimalValue % 2;
			decimalValue = decimalValue / 2;
			if (decimalValue == 0) {
				break;
			}

		}

		return binary;

	}

}
