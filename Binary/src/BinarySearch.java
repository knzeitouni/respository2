
//This program performs a binary search on an assorted array
//given a target and returns the index of the target
//If the target is not found within the array, -1 is returned
public class BinarySearch {
	public static int binarySearch(int[] array, int target) {
		int count = 0;
		int low =  0;
		int high = array.length - 1;
		int mid = (low + high)/2;;
		if (array[high] == target) {
			return high;
		}
		while (low <= high) {
			if (array[mid] == target) {
				return mid;
			}
			else if (Math.pow(2, count)>array.length){
				return -1;
			}
			else if (array[mid] > target) {
				high = mid;
				mid = (low + high)/2;
				count++;
			}
			else if (array[mid] < target) {
				low = mid;
				mid = (low + high)/2;
				count++;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int [] myarr = {1,2,3,4,5,6,7,8,9};
		int ans = binarySearch(myarr,9);
		System.out.println(ans);
	}
}