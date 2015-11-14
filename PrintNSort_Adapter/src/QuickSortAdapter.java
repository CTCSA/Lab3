public class QuickSortAdapter implements SortingAlgorithm {
	Quicksort qs;
	
	public QuickSortAdapter() {
		qs = new Quicksort();
	}
	
    public void sort(int[] array) {
		System.out.println("QuickSortAdapter: sort()");
		qs.sortInteger(array);
	}
}