public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {12, 45, 10, 67, 96, 34, 81, 50,76,100};
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest number: "+largest +
                " \n SecondLargest number: "+secondLargest);
    }
}
