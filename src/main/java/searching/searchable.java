package searching;

public interface searchable {
    public int search(int[] arr, int target);
    public int searchAsc(int[] arr, int start, int end, int target);
    public int searchDesc(int[] arr, int start, int end, int target);
}
