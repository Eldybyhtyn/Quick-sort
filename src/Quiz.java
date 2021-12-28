public class Quiz {

    public static void main(String[] args) {
        int[] mas = new int[] {4, 9, 7, 6, 2, 3, 8};
        showArray(mas);
        System.out.println();
        quickSort(mas, 0, mas.length - 1);
        showArray(mas);
    }

    public static void quickSort(int[] mas, int start, int end) {

        int center = mas[(mas.length - 1) / 2];

        while (start <= end) {
            while (mas[start] < center) {
                start++;
            }
            while (mas[end] > center) {
                end--;
            }
            System.out.printf("Меняем %d на %d\n", mas[start], mas[end]);

            int temp = mas[start];
            mas[start] = mas[end];
            mas[end] = temp;
            start++;
            end--;
            showArray(mas);
        }
        if (end > 0) quickSort(mas, 0, end);
        if (mas.length > start) quickSort(mas, (mas.length - 1) / 2, mas.length - 1);

    }

    public static void showArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

}