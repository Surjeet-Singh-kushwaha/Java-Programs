public class AdditionOfFraction {
    static int hcf(int n1 , int n2 ){
        int small= n1<n2?n1:n2;
        int hcf=1;
        for(int i =1;i<=small;i++){
            if(n1%i==0&&n2%i==0){
          hcf=i;
            }
        }
   return hcf;

    }
    static int lcm(int n1,int n2){
        return n1*n2/hcf(n1, n2);
    }
    public static void main(String ar[]){
        int n1 = 4,d1=3,n2=3,d2=4;
        int n3,d3;
        d3 = lcm(d1,d2);

        n3 = n1*(d3/d1)+n2*(d3/d2);
        System.out.println(n1+"/"+d1+" + "+ n2+" / "+d2+" = "+n3+"/"+d3 );
    }
}
