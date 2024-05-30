public class ArrayBubble {
    private static int[] array;
    private static int elems;

    public static int getComparison() {
        return comparison;
    }

    public static int getPermutation() {
        return permutation;
    }

    private static int comparison = 0;
    private static int permutation = 0;

    public  ArrayBubble(int[] array) {
        this.array = array;
        this.elems = array.length;
    }

    private static void toSwap(int first, int second){
        int dummy = array[first];
        array[first] = array[second];
        array[second] = dummy;
        permutation++;
    }

    public void printer(){
        for (int i = 0; i < elems; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

public static void bubbleSorter() {
    int lastSwap = elems - 1;
    for (int i = 1; i < elems; i++) {
        boolean changed = false;
        int currentSwap = -1;
        for (int j = 0; j < lastSwap; j++) {
            comparison++;
            if (array[j] > array[j + 1]) {
                toSwap(j, j+1);
                changed = true;
                currentSwap = j;
            }
        }
        if (!changed) {
            break;
        }
        lastSwap = currentSwap;
    }
}
}