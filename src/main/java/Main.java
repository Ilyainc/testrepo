import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrBubble;
        int[] arrSort;

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int number = console.nextInt();

        arrBubble = new int[number];   //заполняем массивы
        arrSort = new int[number];
        for (int i = 0; i < number; i++) {
            arrBubble[i] = (int) ((Math.random() - 0.5) * 2 * number) + 1;
            arrSort[i] = arrBubble[i];
        }

        OurArray ourArray = new OurArray();
        System.out.print("Исходный массив:      ");
        ourArray.printArr(arrBubble);
        //ourArray.printArr(arrSort);

        ArrayBubble arrayBubble = new ArrayBubble(arrBubble); //сортируем пузырьком
        arrayBubble.bubbleSorter();

        SortSelection sortSelection = new SortSelection(arrSort); //сортируем выбором
        sortSelection.selectionSort();

        System.out.print("Сортировка пузырьком: ");
        ourArray.printArr(arrBubble);
        System.out.print("Сортировка отбором:   ");
        ourArray.printArr(arrSort);
        System.out.println("Сравнений в пузырьковой: " + arrayBubble.getComparison());
        System.out.println("Перестановок в пузырьковой: " + arrayBubble.getPermutation());

        System.out.println("Сравнений в отборе: " + sortSelection.getComparison());
        System.out.println("Перестановок в отборе: " + sortSelection.getPermutation());
    }
}