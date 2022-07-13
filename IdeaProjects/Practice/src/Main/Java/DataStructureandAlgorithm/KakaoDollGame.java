package Main.Java.DataStructureandAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KakaoDollGame {
    public static void main(String[] args) throws Exception{
        int[][] board = new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = new int[]{1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves)); // 4 (correct answer)
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> temp = new Stack<>();
        temp.push(0);

        for(int move : moves) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][move-1] != 0) {
                    if(board[j][move-1] == temp.peek()) {
                        answer+=2;
                        temp.pop();
                    } else {
                        temp.push(board[j][move - 1]);
                    }
                    board[j][move-1] = 0;
                    break;
                }
            }
        } return answer;
    }
}
