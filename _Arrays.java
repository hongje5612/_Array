import java.util.Comparator;
import java.util.Random;

public class _Arrays {
	
	/**********************************************************************************************************************
	 * quick sort
	 */
	private static Random random = new Random(System.currentTimeMillis());
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : int[]
	 */
	public static void quickSort(int[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(int[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex);
			quickSort(a, beginIndex, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(int[] a, int beginIndex, int endIndex) {
		int t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] < a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	/**
	 * 배열을 내림차순으로 정렬합니다.
	 * @param a : int[]
	 */
	public static void quickSort_d(int[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort_d(a, 0, a.length - 1);
	}
	
	private static void quickSort_d(int[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition_d(a, beginIndex, endIndex);
			quickSort_d(a, beginIndex, pivotIndex - 1);
			quickSort_d(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition_d(int[] a, int beginIndex, int endIndex) {
		int t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] > a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : byte[]
	 */
	public static void quickSort(byte[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(byte[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex);
			quickSort(a, beginIndex, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(byte[] a, int beginIndex, int endIndex) {
		byte t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] < a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	/**
	 * 배열을 내림차순으로 정렬합니다.
	 * @param a : byte[]
	 */
	public static void quickSort_d(byte[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort_d(a, 0, a.length - 1);
	}
	
	private static void quickSort_d(byte[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition_d(a, beginIndex, endIndex);
			quickSort_d(a, beginIndex, pivotIndex - 1);
			quickSort_d(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition_d(byte[] a, int beginIndex, int endIndex) {
		byte t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] > a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : short[]
	 */
	public static void quickSort(short[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(short[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex);
			quickSort(a, beginIndex, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(short[] a, int beginIndex, int endIndex) {
		short t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] < a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	/**
	 * 배열을 내림차순으로 정렬합니다.
	 * @param a : short[]
	 */
	public static void quickSort_d(short[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort_d(a, 0, a.length - 1);
	}
	
	private static void quickSort_d(short[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition_d(a, beginIndex, endIndex);
			quickSort_d(a, beginIndex, pivotIndex - 1);
			quickSort_d(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition_d(short[] a, int beginIndex, int endIndex) {
		short t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] > a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : long[]
	 */
	public static void quickSort(long[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(long[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex);
			quickSort(a, beginIndex, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(long[] a, int beginIndex, int endIndex) {
		long t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] < a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	/**
	 * 배열을 내림차순으로 정렬합니다.
	 * @param a : long[]
	 */
	public static void quickSort_d(long[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort_d(a, 0, a.length - 1);
	}
	
	private static void quickSort_d(long[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition_d(a, beginIndex, endIndex);
			quickSort_d(a, beginIndex, pivotIndex - 1);
			quickSort_d(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition_d(long[] a, int beginIndex, int endIndex) {
		long t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] > a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : float[]
	 */
	public static void quickSort(float[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(float[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex);
			quickSort(a, beginIndex, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(float[] a, int beginIndex, int endIndex) {
		float t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] < a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	/**
	 * 배열을 내림차순으로 정렬합니다.
	 * @param a : float[]
	 */
	public static void quickSort_d(float[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort_d(a, 0, a.length - 1);
	}
	
	private static void quickSort_d(float[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition_d(a, beginIndex, endIndex);
			quickSort_d(a, beginIndex, pivotIndex - 1);
			quickSort_d(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition_d(float[] a, int beginIndex, int endIndex) {
		float t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] > a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : double[]
	 */
	public static void quickSort(double[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(double[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex);
			quickSort(a, beginIndex, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(double[] a, int beginIndex, int endIndex) {
		double t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] < a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	/**
	 * 배열을 내림차순으로 정렬합니다.
	 * @param a : double[]
	 */
	public static void quickSort_d(double[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort_d(a, 0, a.length - 1);
	}
	
	private static void quickSort_d(double[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition_d(a, beginIndex, endIndex);
			quickSort_d(a, beginIndex, pivotIndex - 1);
			quickSort_d(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition_d(double[] a, int beginIndex, int endIndex) {
		double t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] > a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : char[]
	 */
	public static void quickSort(char[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1);
	}
	
	private static void quickSort(char[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex);
			quickSort(a, beginIndex, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(char[] a, int beginIndex, int endIndex) {
		char t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] < a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	/**
	 * 배열을 내림차순으로 정렬합니다.
	 * @param a : char[]
	 */
	public static void quickSort_d(char[] a) {
		if(a == null) throw new NullPointerException();
		
		quickSort_d(a, 0, a.length - 1);
	}
	
	private static void quickSort_d(char[] a, int beginIndex, int endIndex) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition_d(a, beginIndex, endIndex);
			quickSort_d(a, beginIndex, pivotIndex - 1);
			quickSort_d(a, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition_d(char[] a, int beginIndex, int endIndex) {
		char t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(a[j] > a[endIndex]) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	
	/**
	 * 배열을 오름차순으로 정렬합니다.
	 * @param a : T[]
	 */
	public static <T> void quickSort(T[] a, Comparator<? super T> comparator) {
		if(a == null) throw new NullPointerException();
		if(comparator == null) throw new NullPointerException();
		
		quickSort(a, 0, a.length - 1, comparator);
	}
	
	
	private static <T> void quickSort(T[] a, int beginIndex, int endIndex, Comparator<? super T> comparator) {
		if(beginIndex < endIndex) {
			int pivotIndex = partition(a, beginIndex, endIndex, comparator);
			quickSort(a, beginIndex, pivotIndex - 1, comparator);
			quickSort(a, pivotIndex + 1, endIndex, comparator);
		}
	}
	
	private static <T> int partition(T[] a, int beginIndex, int endIndex, Comparator<? super T> comparator) {
		T t;
		int pivotIndex = random.nextInt(endIndex - beginIndex + 1) + beginIndex;
		
		t = a[endIndex];
		a[endIndex] = a[pivotIndex];
		a[pivotIndex] = t;
		
		int i = beginIndex - 1;
		for(int j = beginIndex; j < endIndex; j++) {
			if(comparator.compare(a[j], a[endIndex]) == -1) {
				i++;
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		i++;
		t = a[endIndex];
		a[endIndex] = a[i];
		a[i] = t;
		return i;
	}
	
	
	
	
	
	
	
	
	/***********************************************************************************************************
	 * heap sort
	 */
	
	/**
	 * 오름차순으로 정렬합니다.
	 * @param a : int[]
	 */
	public static void heapSort(int[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			max_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			int t = a[i];
			a[i] = a[0];
			a[0] = t;
			max_heapify(a, 0, i);
		}
	}
	
	/**
	 * 내림차순으로 정렬합니다.
	 * @param a : int[]
	 */
	public static void heapSort_d(int[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			min_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			int t = a[i];
			a[i] = a[0];
			a[0] = t;
			min_heapify(a, 0, i);
		}
	}
	
	private static void max_heapify(int[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		int t;
		
		if(indexRight < size) {
			if(a[indexLeft] >= a[indexRight]) {
				if(a[indexLeft] > a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					max_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					max_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] > a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					max_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					max_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] > a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	private static void min_heapify(int[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		int t;
		
		if(indexRight < size) {
			if(a[indexLeft] <= a[indexRight]) {
				if(a[indexLeft] < a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					min_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					min_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] < a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					min_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					min_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] < a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	
	/**
	 * 오름차순으로 정렬합니다.
	 * @param a : byte[]
	 */
	public static void heapSort(byte[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			max_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			byte t = a[i];
			a[i] = a[0];
			a[0] = t;
			max_heapify(a, 0, i);
		}
	}
	
	/**
	 * 내림차순으로 정렬합니다.
	 * @param a : byte[]
	 */
	public static void heapSort_d(byte[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			min_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			byte t = a[i];
			a[i] = a[0];
			a[0] = t;
			min_heapify(a, 0, i);
		}
	}
	
	private static void max_heapify(byte[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		byte t;
		
		if(indexRight < size) {
			if(a[indexLeft] >= a[indexRight]) {
				if(a[indexLeft] > a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					max_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					max_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] > a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					max_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					max_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] > a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	private static void min_heapify(byte[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		byte t;
		
		if(indexRight < size) {
			if(a[indexLeft] <= a[indexRight]) {
				if(a[indexLeft] < a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					min_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					min_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] < a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					min_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					min_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] < a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	
	/**
	 * 오름차순으로 정렬합니다.
	 * @param a : short[]
	 */
	public static void heapSort(short[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			max_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			short t = a[i];
			a[i] = a[0];
			a[0] = t;
			max_heapify(a, 0, i);
		}
	}
	
	/**
	 * 내림차순으로 정렬합니다.
	 * @param a : short[]
	 */
	public static void heapSort_d(short[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			min_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			short t = a[i];
			a[i] = a[0];
			a[0] = t;
			min_heapify(a, 0, i);
		}
	}
	
	private static void max_heapify(short[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		short t;
		
		if(indexRight < size) {
			if(a[indexLeft] >= a[indexRight]) {
				if(a[indexLeft] > a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					max_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					max_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] > a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					max_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					max_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] > a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	private static void min_heapify(short[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		short t;
		
		if(indexRight < size) {
			if(a[indexLeft] <= a[indexRight]) {
				if(a[indexLeft] < a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					min_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					min_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] < a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					min_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					min_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] < a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	
	
	/**
	 * 오름차순으로 정렬합니다.
	 * @param a : long[]
	 */
	public static void heapSort(long[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			max_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			long t = a[i];
			a[i] = a[0];
			a[0] = t;
			max_heapify(a, 0, i);
		}
	}
	
	/**
	 * 내림차순으로 정렬합니다. 
	 * @param a : long[]
	 */
	public static void heapSort_d(long[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			min_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			long t = a[i];
			a[i] = a[0];
			a[0] = t;
			min_heapify(a, 0, i);
		}
	}
	
	private static void max_heapify(long[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		long t;
		
		if(indexRight < size) {
			if(a[indexLeft] >= a[indexRight]) {
				if(a[indexLeft] > a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					max_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					max_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] > a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					max_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					max_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] > a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	private static void min_heapify(long[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		long t;
		
		if(indexRight < size) {
			if(a[indexLeft] <= a[indexRight]) {
				if(a[indexLeft] < a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					min_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					min_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] < a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					min_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					min_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] < a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	
	/**
	 * 오름차순으로 정렬합니다.
	 * @param a : float[]
	 */
	public static void heapSort(float[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			max_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			float t = a[i];
			a[i] = a[0];
			a[0] = t;
			max_heapify(a, 0, i);
		}
	}
	
	/**
	 * 내림차순으로 정렬합니다.
	 * @param a : float[]
	 */
	public static void heapSort_d(float[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			min_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			float t = a[i];
			a[i] = a[0];
			a[0] = t;
			min_heapify(a, 0, i);
		}
	}
	
	private static void max_heapify(float[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		float t;
		
		if(indexRight < size) {
			if(a[indexLeft] >= a[indexRight]) {
				if(a[indexLeft] > a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					max_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					max_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] > a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					max_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					max_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] > a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	private static void min_heapify(float[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		float t;
		
		if(indexRight < size) {
			if(a[indexLeft] <= a[indexRight]) {
				if(a[indexLeft] < a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					min_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					min_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] < a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					min_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					min_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] < a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	
	/**
	 * 오름차순으로 정렬합니다.
	 * @param a : double[]
	 */
	public static void heapSort(double[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			max_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			double t = a[i];
			a[i] = a[0];
			a[0] = t;
			max_heapify(a, 0, i);
		}
	}
	
	/**
	 * 내림차순으로 정렬합니다.
	 * @param a : double[]
	 */
	public static void heapSort_d(double[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			min_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			double t = a[i];
			a[i] = a[0];
			a[0] = t;
			min_heapify(a, 0, i);
		}
	}
	
	private static void max_heapify(double[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		double t;
		
		if(indexRight < size) {
			if(a[indexLeft] >= a[indexRight]) {
				if(a[indexLeft] > a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					max_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					max_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] > a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					max_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					max_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] > a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	private static void min_heapify(double[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		double t;
		
		if(indexRight < size) {
			if(a[indexLeft] <= a[indexRight]) {
				if(a[indexLeft] < a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					min_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					min_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] < a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					min_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					min_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] < a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	
	
	/**
	 * 오름차순으로 정렬합니다.
	 * @param a : char[]
	 */
	public static void heapSort(char[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			max_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			char t = a[i];
			a[i] = a[0];
			a[0] = t;
			max_heapify(a, 0, i);
		}
	}
	
	/**
	 * 내림차순으로 정렬합니다.
	 * @param a : char[]
	 */
	public static void heapSort_d(char[] a) {
		if(a == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			min_heapify(a, i, a.length);
		}

		for(i = a.length - 1; i > 0; i--) {
			char t = a[i];
			a[i] = a[0];
			a[0] = t;
			min_heapify(a, 0, i);
		}
	}
	
	private static void max_heapify(char[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		char t;
		
		if(indexRight < size) {
			if(a[indexLeft] >= a[indexRight]) {
				if(a[indexLeft] > a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					max_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					max_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] > a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					max_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					max_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] > a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	private static void min_heapify(char[] a, int index, int size) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		char t;
		
		if(indexRight < size) {
			if(a[indexLeft] <= a[indexRight]) {
				if(a[indexLeft] < a[index]) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					min_heapify(a, indexLeft, size);
				} else if(a[indexLeft] == a[index]) {
					min_heapify(a, indexLeft, size);
				}
			} else {
				if(a[indexRight] < a[index]) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					min_heapify(a, indexRight, size);
				} else if(a[indexRight] == a[index]) {
					min_heapify(a, indexRight, size);
				}
			}
		} else if(indexLeft < size) {
			if(a[indexLeft] < a[index]) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	

	/**
	 * 정렬합니다.
	 * 
	 * @param <T>
	 * @param a : 배열
	 * @param c : Comparator<T>
	 */
	public static <T> void heapSort(T[] a, Comparator<? super T> c) {
		if(a == null) throw new NullPointerException();
		if(c == null) throw new NullPointerException();
		
		int startIndex = (a.length - 2) / 2;
		int i;
		
		for(i = startIndex; i >= 0; i--) {
			heapify(a, i, a.length, c);
		}

		for(i = a.length - 1; i > 0; i--) {
			T t = a[i];
			a[i] = a[0];
			a[0] = t;
			heapify(a, 0, i, c);
		}
	}
	
	private static <T> void heapify(T[] a, int index, int size, Comparator<? super T> c) {
		if(size <= 1) return;
		
		int indexLeft = 2 * index + 1; // index of left child 
		int indexRight = indexLeft + 1; // index of right child
		T t;
		
		if(indexRight < size) {
			if(c.compare(a[indexLeft], a[indexRight]) == 1 || c.compare(a[indexLeft], a[indexRight]) == 0) {
				if(c.compare(a[indexLeft], a[index]) == 1) {
					t = a[indexLeft];
					a[indexLeft] = a[index];
					a[index] = t;
					heapify(a, indexLeft, size, c);
				} else if(c.compare(a[indexLeft], a[index]) == 0) {
					heapify(a, indexLeft, size, c);
				}
			} else {
				if(c.compare(a[indexRight], a[index]) == 1) {
					t = a[indexRight];
					a[indexRight] = a[index];
					a[index] = t;
					heapify(a, indexRight, size, c);
				} else if(c.compare(a[indexRight], a[index]) == 0) {
					heapify(a, indexRight, size, c);
				}
			}
		} else if(indexLeft < size) {
			if(c.compare(a[indexLeft], a[index]) == 1) {
				t = a[indexLeft];
				a[indexLeft] = a[index];
				a[index] = t;
			}
		} else return;
	}
	
	
	
	
	
	/** 
	 * Sequential search & Binary search
	 */
	
	public static final int NOT_FOUND = -1;
	
	public static int sequentialSearch(int[] a, int fromIndex, int toIndex, int key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i] == key) return i;
		}
		return NOT_FOUND;
	}
	
	public static int sequentialSearch(byte[] a, int fromIndex, int toIndex, byte key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i] == key) return i;
		}
		return NOT_FOUND;
	}
	
	public static int sequentialSearch(short[] a, int fromIndex, int toIndex, short key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i] == key) return i;
		}
		return NOT_FOUND;
	}
	
	public static int sequentialSearch(long[] a, int fromIndex, int toIndex, long key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i] == key) return i;
		}
		return NOT_FOUND;
	}
	
	public static int sequentialSearch(float[] a, int fromIndex, int toIndex, float key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i] == key) return i;
		}
		return NOT_FOUND;
	}
	
	public static int sequentialSearch(double[] a, int fromIndex, int toIndex, double key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i] == key) return i;
		}
		return NOT_FOUND;
	}
	
	public static int sequentialSearch(char[] a, int fromIndex, int toIndex, char key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i] == key) return i;
		}
		return NOT_FOUND;
	}
	
	public static int sequentialSearch(Object[] a, int fromIndex, int toIndex, Object key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(a[i].equals(key)) return i;
		}
		return NOT_FOUND;
	}
	
	public static <T> int sequentialSearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		if(c == null) throw new NullPointerException();
		
		for(int i = fromIndex; i <= toIndex; i++) {
			if(c.compare(a[i], key) == 0) return i;
		}
		return NOT_FOUND;
	}
	
	
	
	
	public static int sequentialSearch(int[] a, int key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static int sequentialSearch(byte[] a, byte key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static int sequentialSearch(short[] a, short key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static int sequentialSearch(long[] a, long key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static int sequentialSearch(float[] a, float key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static int sequentialSearch(double[] a, double key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static int sequentialSearch(char[] a, char key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static int sequentialSearch(Object[] a, Object key) {
		return sequentialSearch(a, 0, a.length - 1, key);
	}
	
	public static <T> int sequentialSearch(T[] a, T key, Comparator<? super T> c) {
		return sequentialSearch(a, 0, a.length - 1, key, c);
	}
	
	
	
	
	
	
	public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(a[middleIndex] == key) return middleIndex;
			else if(a[middleIndex] > key) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(a[middleIndex] == key) return middleIndex;
			else if(a[middleIndex] > key) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(a[middleIndex] == key) return middleIndex;
			else if(a[middleIndex] > key) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(a[middleIndex] == key) return middleIndex;
			else if(a[middleIndex] > key) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(a[middleIndex] == key) return middleIndex;
			else if(a[middleIndex] > key) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(a[middleIndex] == key) return middleIndex;
			else if(a[middleIndex] > key) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(a[middleIndex] == key) return middleIndex;
			else if(a[middleIndex] > key) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
		if(a == null) throw new NullPointerException();
		if(fromIndex < 0 || toIndex >= a.length) throw new ArrayIndexOutOfBoundsException();
		if(c == null) throw new NullPointerException();
		
		while(fromIndex <= toIndex) {
			int middleIndex = (fromIndex + toIndex) / 2;
			if(c.compare(a[middleIndex], key) == 0) return middleIndex;
			else if(c.compare(a[middleIndex], key) == 1) toIndex = middleIndex - 1;
			else fromIndex = middleIndex + 1;
		}
		return NOT_FOUND;
	}
	
	
	
	
	public static int binarySearch(int[] a, int key) {
		return binarySearch(a, 0, a.length - 1, key);
	}
	
	public static int binarySearch(byte[] a, byte key) {
		return binarySearch(a, 0, a.length - 1, key);
	}
	
	public static int binarySearch(short[] a, short key) {
		return binarySearch(a, 0, a.length - 1, key);
	}
	
	public static int binarySearch(long[] a, long key) {
		return binarySearch(a, 0, a.length - 1, key);
	}
	
	public static int binarySearch(float[] a, float key) {
		return binarySearch(a, 0, a.length - 1, key);
	}
	
	public static int binarySearch(double[] a, double key) {
		return binarySearch(a, 0, a.length - 1, key);
	}
	
	public static int binarySearch(char[] a, char key) {
		return binarySearch(a, 0, a.length - 1, key);
	}
	
	public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
		return binarySearch(a, 0, a.length - 1, key, c);
	}
	
}
