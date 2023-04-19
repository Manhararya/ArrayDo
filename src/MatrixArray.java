public class MatrixArray {
    public static void main(String args[]){
         //creating a matrix
        int original[][]={{15,55},{21,48}};

        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(original[j][i]+" ");
            }
            System.out.println();
        }
    }
}
