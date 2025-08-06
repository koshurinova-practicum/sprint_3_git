package array;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7, 2, 8, 4, 6};
        // Предполагаем, что первый элемент массива является максимальным
        int max = array[0];
        // Проходим по всем элементам массива
        for (int i = 1; i < array.length; i++) {
            // Если текущий элемент больше текущего максимального, обновляем максимальный элемент
            if (array[i] > max) {
                max = array[i];
            }
        }
        // Выводим максимальный элемент
        System.out.println("Максимальный элемент в массиве: " + max);
    }

}
