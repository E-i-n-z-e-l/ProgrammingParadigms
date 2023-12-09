public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Нашли элемент, возвращаем его индекс
            } else if (arr[mid] < target) {
                left = mid + 1; // Искомый элемент находится в правой половине
            } else {
                right = mid - 1; // Искомый элемент находится в левой половине
            }
        }

        return -1; // Элемент не найден
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;

        int result = BinarySearch.binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Элемент найден по индексу: " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
