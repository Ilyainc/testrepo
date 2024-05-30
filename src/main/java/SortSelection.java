public class SortSelection {
    public static int getComparison() {
        return comparison;
    }

    public static int getPermutation() {
        return permutation;
    }

    private static int comparison = 0;
    private static int permutation = 0;
    private static int[] array;

    public SortSelection(int[] array) {
        this.array = array;
    }

    private static void toSwap(int first, int second){
        int dummy = array[first];
        array[first] = array[second];
        array[second] = dummy;
        permutation++;
    }

    public static void selectionSort() {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                comparison++;
            }
            toSwap(i,min);
        }
    }
}
