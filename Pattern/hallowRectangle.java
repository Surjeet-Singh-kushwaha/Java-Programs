public class hallowRectangle{
    public static void halloRecta(){
          int lines=5;
    for(int i=1;i<=lines;i++){
        for(int j=1;j<=lines;j++){
            if((i==1 || i==lines) || (j==1||j==lines)){
            System.out.print("*");
        }
        else{
         System.out.print(" ");
        }}
        System.out.println();
     }
    }
    public static void main(String args[]){
      halloRecta();
      halloRecta();
}  
}