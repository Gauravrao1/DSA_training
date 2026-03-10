//Q-12 Find second smallest and second largest element in array
//Logic: Sort logically - track two smallest and two largest values
public class SecondLargestSmallest {
        public static void main(String[] args) {
                int[] arr = { 1, 2, 4, 7, 7, 5 };

                int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
                int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

                for (int num : arr) {
                        // Track smallest two
                        if (num < smallest) {
                                secondSmallest = smallest;
                                smallest = num;
                        } else if (num < secondSmallest && num != smallest) {
                                secondSmallest = num;
                        }
                        // Track largest two
                        if (num > largest) {
                                secondLargest = largest;
                                largest = num;
                        } else if (num > secondLargest && num != largest) {
                                secondLargest = num;
                        }
                }

                System.out.println("Second Smallest : " + (secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest));
                System.out.println("Second Largest : " + (secondLargest == Integer.MIN_VALUE ? -1 : secondLargest));
        }
}
