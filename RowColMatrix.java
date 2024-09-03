
public class RowColMatrix {
    public static void main(String[] args) {
        int target = 32;
        int mat[][] = {
                        {10,20,30,40},
                        {11,21,31,41},
                        {12,22,32,42},
                        {13,23,33,43}};
        int r = 0;
        int c = mat.length-1;
        while(r<=mat.length-1 && c>=0){
            if(mat[r][c]==target){
                System.out.println("ELement Found at row "+(r+1)+" and column "+(c+1));
                break;
            }
            if(mat[r][c]>target){
            
                c--;
            }
            if(mat[r][c]<target){
                r++;
            }
        }

    }

    
}
