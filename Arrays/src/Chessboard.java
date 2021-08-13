import java.util.Arrays;

public class Chessboard {
    public static void main(String [] args){

        int boardDim = 8;//initialization of the board size
        char[][] board = new char[boardDim][boardDim];

        boolean isBlack = false;//color is false then given true by first run

        //attempting to print out the color of a chessboard()black or white
        for(int y = 0; y < board.length; y++ ){
            //along the horizontal axis
            isBlack =!isBlack;
            for(int x = 0;  x< board[y].length; x++){
                if(isBlack) {board[y][x]='B';}
                else {board[y][x]='W';}
                isBlack= !isBlack;
            }
        }

        for(int i = 0; i < board.length; i++){
            System.out.println(Arrays.toString(board[i]));
        }
    }
}
