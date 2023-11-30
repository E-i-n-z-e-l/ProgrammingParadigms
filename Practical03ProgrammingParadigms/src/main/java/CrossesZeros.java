import java.util.Scanner;

public class CrossesZeros {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Игрок " + currentPlayer + ", введите строку и столбец (например: 1 1): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                displayBoard();
                if (isGameWon()) {
                    System.out.println("Игрок " + currentPlayer + " победил!");
                    break;
                } else if (isBoardFull()) {
                    System.out.println("Игра окончена, ничья!");
                    break;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Недопустимый ход!");
            }
        }
    }

    /**
     * Создаем поле для игры.
     */
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
     * Отображаем ходы игроков на поле.
     */
    private static void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Проверка допустимости хода игрока в указанную ячейку.
     * @param row
     * @param col
     * @return
     */
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '-';
    }

    /**
     * Присуждение победы.
     * @return
     */
    private static boolean isGameWon() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    /**
     * Победа по строке.
     * @return
     */
    private static boolean checkRows() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Победа по столбцу.
     * @return
     */
    private static boolean checkColumns() {
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Победа по диагонали.
     * @return
     */
    private static boolean checkDiagonals() {
        return (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    /**
     * Конец игры когда поле заполнено.
     * @return
     */
    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

}
