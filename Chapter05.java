public class Chapter05 {
	public static void main(String[] args) {		
		long long1 = 123456789L;
		double double1 = 1234.56d;
		boolean boolean1 = true;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);
		
		Float float1 = 0.123f;
		Integer integer1 = 123456;
		Character character1 = 'あ';
		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);
		
		//int」型の配列を初期化して、インデックス番号が3の値を出力
		int[] array = new int[] { 10, 20, 30, 40, 50 };
		int int1 = array[3];
		System.out.println(int1);
		//これでもおなじになる
		System.out.println(array[3]);
	}
}


