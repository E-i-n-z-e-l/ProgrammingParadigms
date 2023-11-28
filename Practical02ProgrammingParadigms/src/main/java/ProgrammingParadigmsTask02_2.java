/**
 * **Процедурная парадигма:** В процедурной парадигме программа строится вокруг процедур или функций, которые
 * могут обращаться друг к другу, передавая данные и вызывая различные операции. Эта парадигма ориентирована
 * на последовательное выполнение процедур. В Java, хотя это язык ориентирован на объекты, можно написать программу,
 * используя процедуры и функции без создания объектов.
 */

// Программа в процедурной парадигме:
public class ProgrammingParadigmsTask02_2 {
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10; // Предположим, что n = 10
        printMultiplicationTable(n);
    }
}
