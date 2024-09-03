import java.util.*;
public class Maze {
    public static int mazeCount(int row,int col){
        if(row==0 || col==0){
            return 1;
        }
        return mazeCount(row-1, col) + mazeCount(row, col-1);
    }

    public static void printMazePath(int row,int col,String str){
        if(row==1 && col==1){
            System.out.println(str);
            return;
        }
        if(row>1 && col>1){
            printMazePath(row-1, col-1, str+"V");
        }
        if(row>1){
            printMazePath(row-1, col, str+"D");
        }
        if(col>1){
            printMazePath(row, col-1, str+"R");
        }
        
       
    }

    public static List<String> printMazePathToList(int row,int col,String str){
        
        if(row==1 && col==1){
            List<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        List<String> list = new ArrayList<>();
        
        if(row>1){
            list.addAll(printMazePathToList(row-1, col, str+"D"));
        }
        if(col>1){
             list.addAll(printMazePathToList(row, col-1, str+"R"))  ;
        }

        return list;
    }

    public static List<String> printMazePathToListDia(int row,int col,String str){
        
        if(row==1 && col==1){
            List<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(row>1 && col>1){
            list.addAll(printMazePathToListDia(row-1, col-1, str+"D"));
        }
        if(row>1){
            list.addAll(printMazePathToListDia(row-1, col, str+"V"));
        }
        if(col>1){
             list.addAll(printMazePathToListDia(row, col-1, str+"H"))  ;
        }

        return list;
    }

    public static void printPathBlocked(boolean[][] maze,int row,int col,String str){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(str);
            return;
        }
        if(maze[row][col] == false){
            return;
        }
        if(row<maze.length-1){
            printPathBlocked(maze, row+1, col, str+"D");
        }
        if(col<maze[0].length-1){
            printPathBlocked(maze, row, col+1, str+"R");
        }
    }


    public static void allowingThePersonToMoveInAllDirection(int row,int col,boolean[][] maze,String str){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(str);
            return;
        }
        if(maze[row][col] == false) return;
        maze[row][col] = false;
        if(row<maze.length-1){
            allowingThePersonToMoveInAllDirection(row+1, col, maze, str+"D");
        }
        if(col<maze[0].length-1){
            allowingThePersonToMoveInAllDirection(row, col+1, maze, str+"R");
        }
        if(row>0){
            allowingThePersonToMoveInAllDirection(row-1, col, maze, str+"U");
        }
        if(col>0){
            allowingThePersonToMoveInAllDirection(row, col-1, maze, str+"L");
        }

        maze[row][col] = true;
    }

    public static void allowingThePersonToMoveInAllDirectionPrint(int row,int col,boolean[][] maze,String str,int[][] path,int step){
        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col] = step;
            for(int arr[] : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(str);
            System.out.println();
            return;
        }
        if(maze[row][col] == false) return;
        maze[row][col] = false;
        path[row][col] = step;
        if(row<maze.length-1){
            allowingThePersonToMoveInAllDirectionPrint(row+1, col, maze, str+"D",path,step+1);
        }
        if(col<maze[0].length-1){
            allowingThePersonToMoveInAllDirectionPrint(row, col+1, maze, str+"R",path,step+1);
        }
        if(row>0){
            allowingThePersonToMoveInAllDirectionPrint(row-1, col, maze, str+"U",path,step+1);
        }
        if(col>0){
            allowingThePersonToMoveInAllDirectionPrint(row, col-1, maze, str+"L",path,step+1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }



    public static void main(String[] args) {
        // boolean[][] maze = {
        //     {true,true,true},
        //     {
        //         true,true,true
        //     },
        //     {
        //         true,true,true
        //     }
        // };
        // int[][] path = new int[maze.length][maze[0].length];

        // allowingThePersonToMoveInAllDirectionPrint(0, 0, maze, "",path,1);

        System.out.println(mazeCount(3, 7));
    }
}
