public class charPyramid {
    public static void main(String args[]){
        int lines=6;
        char ch ='A';
    for(int i=1;i<=lines;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
             ch++;
        }
        System.out.println();
     }
}
}


