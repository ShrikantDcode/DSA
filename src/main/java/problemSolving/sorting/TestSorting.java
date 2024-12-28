package problemSolving.sorting;

public class TestSorting {
    public static void main(String[] args) {
        int[] arr = {1,9,-5,5,0,2};
    BaseSystem app = new EasySortOperation();
    app.setiSortable(new BubbleSort()); // provide/override instace of implementation class at runtime in client code
    int[] sorted = app.sort(arr);
    for(int i: sorted)
        System.out.print(i+" ");
    }
}

class EasySortOperation extends BaseSystem {

    public EasySortOperation() {
        iSortable = new BubbleSort();
    }

    @Override
    void display() {
            System.out.println("SortSystem::display");
    }
}
