package Main.Java.DataStructureandAlgorithm;


public class SudokuSolver {

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };

        if(solveBoard(board)) {
            System.out.println("Solved successfully!");
        }
        else {
            System.out.println("Unsolvable board :( ");
        }
        
        printBoard(board);
    }

    private static void printBoard(int[][] board) {
        for(int row = 0; row < GRID_SIZE; row++) {
            for(int column = 0; column < GRID_SIZE; column++) {
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    // row에 숫자가 있는지 확인하는 불린 메서드 (파라미터: 검사할 수도쿠 보드, 검사할 숫자, 검사할 행 넘버)
    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for(int i = 0; i < GRID_SIZE; i++) {
            // 행에 있는 숫자가 number와 일치하면 true
            if(board[row][i] == number) {
                return true;
            }
        }
        // 불일치 == 숫자가 없으면 false
        return false;
    }

    // column에 숫자가 있는지 확인하는 불린 메서드 (파라미터: 검사할 수도쿠 보드, 검사할 숫자, 검사할 열 넘버)
    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if(board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    // 3x3 박스 마다 숫자가 있는지 확인하는 불린 메서드 (파라미터: 검사할 수도쿠 보드, 검사할 숫자, 박스내 행 넘버, 박스내 열 넘버)
    // 박스내 검사는 가장 왼쪽 상단에 있는 칸부터 옆으로 옮겨가며 실행
    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        // 행과 열 넘버가 들어왔을 때, 그 숫자가 있는 박스내의 가장 왼쪽 상단 칸의 행과 열 인덱스 변수
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for(int i = localBoxRow; i < localBoxRow + 3; i++) {
            for(int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                // +3 해주는 이유 = 3X3 박스를 순회하기 위함
                if(board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // 위 세 가지를 전부 체크해주는 메서드
    private static boolean isValid(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInBox(board, number, row, column);
    }

    // 백트래킹 알고리즘
    /* 빈 칸을 맞딱드렸을 때 1~9까지의 숫자를 넣어보며 isValid한지 확인하고,
     isValid 검사인 row, column, box와 비교했을 때 겹치지 않는 숫자를 입력한 후 다음 칸으로 이동.
     실행중 빈 칸에 1~9까지 모든 수가 isValid하지 못할 때,
     이전에 채운 빈칸으로 돌아가 지우고 Valid한 다른 숫자를 입력하고 풀던 곳으로 돌아와 이어서 실행.
     백트래킹 = 채우기와 돌아와서 수정을 반복하며 보드를 전부 채우는 방식*/
    private static boolean solveBoard(int[][] board) {
        // 보드 전체를 순회하는 for문
        for(int row = 0; row < GRID_SIZE; row++) {
            for(int column = 0; column < GRID_SIZE; column++) {
                if(board[row][column] == 0) {
                    for(int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if(isValid(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;

                            // 재귀 사용
                            /*위에서 빈 칸을 채웠으니, 재귀로 이 메서드를 다시 실행해 채운 빈 칸은 넘어가고
                            그 다음 빈 칸부터 찾아 채우도록 함.
                            solveBoard(board) == true의 의미: 앞에서의 빈 칸들을 성공적으로 채웠다.*/
                            if(solveBoard(board)) {
                                return true;
                            }
                            // 성공적으로 채우지 못했을 때, 다시 0로 설정.
                            /*이유: isValid를 통과한 numberToTry 수를 빈 칸에 할당했는데,
                            solveBoard(board)에서 false가 뜨면 Valid하지만 칸에 맞는 수가 아니라는 의미이다.
                            때문에 다시 0으로 설정한다. 다시 numberToTry for문으로 돌아가 다른 수를 검사한다.*/
                            else {
                                board[row][column] = 0;
                            }
                        }
                    }
                    // 전부 isValid를 통과하지 못할 경우 false
                    return false;
                }
            }
        }
        return true;
    }

}


//Solved successfully!
//732458619
//956173824
//184629537
//871564392
//643892751
//295317468
//329786145
//418235976
//567941283
