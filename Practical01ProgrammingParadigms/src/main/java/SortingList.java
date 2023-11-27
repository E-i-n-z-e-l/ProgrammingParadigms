import java.util.Arrays;

public class SortingList {
    /**
     * Императивный стиль программирования - это подход к написанию программ, в котором код описывает
     * последовательность команд для выполнения определенной задачи.
     * <p>
     * В императивном стиле программист указывает, как именно нужно выполнять операции, шаг за шагом,
     * какие переменные использовать и какие изменения вносить в состояние программы.
     * <p>
     * Этот стиль программирования часто используется в процедурном программировании и включает в себя
     * использование циклов, условных операторов, переменных и т.д.
     * @param arr
     */
    public static void sortDescendingImperative(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // Сразу прописываем логику сортировки массива.
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Декларативный стиль программирования - это подход к написанию программ, в котором код описывает,
     * что должно быть сделано, а не как это должно быть сделано.
     * <p>
     * Программист описывает желаемый результат, а не последовательность шагов для его достижения.
     * <p>
     * Этот стиль программирования часто используется в функциональном программировании и включает в
     * себя использование функций, выражений и объявлений.
     * @param arr
     */
    public static void sortDescendingDeclarative(int[] arr) {
        Arrays.sort(arr); // Сначала с помощью метода сортируем массив по возрастанию, а потом работаем с ним.
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] numbersOne = {5, 2, 9, 1, 7};

        sortDescendingImperative(numbersOne);
        System.out.println(Arrays.toString(numbersOne));

        sortDescendingDeclarative(numbersOne);
        System.out.println(Arrays.toString(numbersOne));
    }
}
