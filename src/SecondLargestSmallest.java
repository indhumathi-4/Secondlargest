
public class SecondLargestSmallest {

    public static int[] findSecondLargestAndSmallest(int[] a) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int value : a) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }

            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest && value != smallest) {
                secondSmallest = value;
            }
        }

        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,7,8};
        int[] result = findSecondLargestAndSmallest(a);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
