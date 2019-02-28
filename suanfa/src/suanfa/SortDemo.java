package suanfa;

public class SortDemo {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 10, 14, 18 };
		int arr2[] = { 123, 120, 56, 9, 6, 5 };
		int arr3[] = { 123, 12, 32, 65, 17, 29239, 456, 89, 12, 78, 120, 56, 9, 6, 5 };
		int arr4[] = { 6, 3, 8, 2, 9, 1 };
		// 二分查找
//		bbsort(arr4);
		half(100);
		System.out.println("总共高度"+hCount);
		System.out.println("总共次数"+halfCount);
		
	}

	public static boolean querySMax(int[] arr, int what) {
		int bigmax = arr[0];
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				if (max > bigmax) {
					int tempmax = bigmax;
					bigmax = max;
					max = tempmax;

				}
			}

		}
		System.out.println("Data[bigmax] = " + bigmax + ",secondMax:" + max);

		return false;// 查找第二大

	}

	public static boolean halfQuery2(int[] data, int k) {
		int left = 0;// 左边界变量
		int right = data.length - 1;// 右边界变量
		int middle;// 中位数变量
		int count = 0;
		while (left <= right) {
			middle = (left + right) / 2;
			int datam = data[middle];
			if (k < datam) {
				right = middle - 1;// 查找前半段
			} else if (k > datam) {
				left = middle + 1;// 查找后半段
			} else if (k == datam) {
				System.out.println("Data[" + middle + "] = " + data[middle] + ",count:" + count);
				return true;
			}
			count++;
		}
		return false;
	}

	public static boolean bbsort(int[] data) {// 我这个最优
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {// 从小到大
				// int arr4[] = { 3,6, 8, 2, 9, 1 };
				//
				if (data[i] > data[j]) {
					count++;
					// swap position
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;

				}
				for (int k = 0; k < data.length; k++) {
					System.out.print(data[k] + ",");

				}
				System.out.println("j=" + j);
			}
		}
		// for (int i = 0; i < data.length; i++) {
		// System.out.print(data[i] + ",");
		//
		// }
		// System.out.println("count" + count);

		return false;

	}

	public static boolean bbsort3(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {// 外层循环控制排序趟数
			for (int j = 0; j < arr.length - 1 - i; j++) {// 内层循环控制每一趟排序多少次
				if (arr[j] > arr[j + 1]) {
					count++;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");

		}
		System.out.println("count" + count);

		return false;

	}

	static int halfCount = 0;
	static int hCount = 0;

	public static void half(float h) {
		if (h != 0) {
			halfCount++;
			float down = h / 2;
			System.out.println("回弹第"+halfCount+"次" + down+"米");
			hCount += down;
			half(down);
		}

	}
}
