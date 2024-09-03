public class ArrayRotation {
    public static void ArrayRotation(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
               // if((j==0)){
                //    swap(matrix,i,j,i,matrix.length-1);
                //}

                int temp ; 
               temp =  matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
 
                System.out.print(matrix[i][j]+" ");
            }
 
            System.out.println();
        }
    }

    public static void swap(int[][] matrix,int i,int j,int k,int l){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = temp;

    }

    public static void main(String[] args){
        int[][] arr = { {1,2,3},{4,5,6},{7,8,9} };

        ArrayRotation(arr);

    }
}
