class SafeArray {
	private int a [];
	public int length;
	
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}
	
	public int get(int index) {
		if(index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}
	
	public void put(int index, int value) {
		if (index >= 0 && index < length) {
			a[index] = value;
		} else
			System.out.println("잘못된 인덱스 " + index);
		}
}


public class safeArrayTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		SafeArray array = new SafeArray(3);
		
		for (int i = 0; i < (array.length + 1); i++) {
			array.put(i, i * 10);
		}
		
		for(int j = 0; j<array.length; j++) {
			System.out.println("인덱스"+j+"의 값"+array.get(j));
		}
		
	}

}
