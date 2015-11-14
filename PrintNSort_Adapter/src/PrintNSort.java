public class PrintNSort {
    public void perform() {
        int data[] = {10, 23, 44, 60, 12, -90, 110, -555}; // sample data
        int i;
        
	SortingAlgorithm sa = new QuickSortAdapter();

        sa.sort(data); 
        
        System.out.println("The sorted elements are: "); 
        
        for(i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }


} 
