import java.util.Arrays;

public class Pirson {
    /**
     * Вычисляем среднее значение массива и корреляцию Пирсона.
     * @param array
     * @return
     */
    public static double mean(double[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }
    public static double pearsonsCorrelation(double[] array1, double[] array2) {
        double mean1 = mean(array1);
        double mean2 = mean(array2);

        double sumXY = 0;
        double sumX2 = 0;
        double sumY2 = 0;

        for (int i = 0; i < array1.length; i++) {
            sumXY += (array1[i] - mean1) * (array2[i] - mean2);
            sumX2 += Math.pow(array1[i] - mean1, 2);
            sumY2 += Math.pow(array2[i] - mean2, 2);
        }

        return sumXY / Math.sqrt(sumX2 * sumY2);
    }
    public static void main(String[] args) {
        double[] data1 = {1, 2, 3, 4, 5};
        double[] data2 = {6, 7, 8, 9, 10};

        double correlation = pearsonsCorrelation(data1, data2);
        System.out.println("Корреляция Пирсона: " + correlation);
    }
}
