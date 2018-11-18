public class SelectionSort {
    private int min;
    private int held;
    private int target;
    int[] sortedArr;

    SelectionSort(int[] arr) {
        min = arr[0];
        held = 0;
        target = 0;
        sortedArr = new int[arr.length];
    }

    public int[] sortArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            this.min = arr[i]
            held = arr[i];
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    target = j;
                }
            }
            arr[i] = min;
            arr[target] = held;
        }

        return sortedArr;
    }
}
