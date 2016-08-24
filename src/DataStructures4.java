
public class DataStructures4 {// SEARCHING IN AN ORDERED ARRAY
	
	public static int orderedSearch(int toFind, int[] arr) {
		int counter = 0;
		int found = (int) Math.floor((arr.length)/2);// this is the java way of turning a double into an int
		while (toFind != arr[found] && counter < arr.length) {// each time this runs, it detects whether the number you're looking for is above or below the middle index, then resets the middle index to within the subarray and looks there
			if (arr[found] < toFind) {
				found = found + (int) Math.floor((arr.length - found)/2);
			} else if (arr[found] > toFind) {
				found = (int) Math.floor((found)/2);
			} else {
				break;
			}
			counter++;
		}
		if (toFind != arr[found]) {
			return -1;
		}
		return found;
	}
	
	// the time complexity of this array will be better than standard search, as it will discard many operations, making it especially useful for large arrays- we are reducing the array by half on each step
	
	public static void main(String[] args) {
		System.out.println("DEMONSTRATING ORDERED ARRAY SEARCH:");
		int[] a = { 1, 3, 5, 7, 9, 41 };
		int[] b = { 9, 56, 250 };
		int[] c = { 100, 200, 205, 210, 999, 1000 };
		int[] d = { 2 };
		int[] e = { 0, 668 };
		int[] f = { 104, 105, 105, 105, 567, 568, 569, 570, 571 };
		int[] g = { 10, 20, 30, 67, 89, 1000, 5400, 10000 };
		int[] h = { 150, 200, 200 };
		int[] i = { 30, 200, 209, 210, 999 };
		int[] j = { -5, -4, -4, -2, -1 };
		System.out.println(orderedSearch(41,a));
		System.out.println(orderedSearch(9,b));
		System.out.println(orderedSearch(210,c));
		System.out.println(orderedSearch(2,d));
		System.out.println(orderedSearch(99,e));
		System.out.println(orderedSearch(105,f));
		System.out.println(orderedSearch(10,g));
		System.out.println(orderedSearch(200,h));
		System.out.println(orderedSearch(209,i));
		System.out.println(orderedSearch(-4,j));
		System.out.println(orderedSearch(99,j));
	}

}
