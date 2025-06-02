package Sorting;

public class InsertionSorting {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 3, 9, 8, 7};
        int size = arr.length;

        System.out.println("Before Sorting");
        for(int num : arr){
            System.out.print(num +" ");
        }

        for(int i = 1;i< size; i++){

            int key = arr[i];
            int j = i -1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            System.out.println();
            for(int num: arr){
                System.out.print(num +" ");
            }
        }

        System.out.println("\nAfter Sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }

}
