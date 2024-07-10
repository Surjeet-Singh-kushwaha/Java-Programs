public class floyedTriangle {
    public static void floyedTri(int lines){
        int k=1;
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyedTri(7);

    }
    
}
