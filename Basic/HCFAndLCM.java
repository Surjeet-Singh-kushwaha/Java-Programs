public class HCFAndLCM {
    static int HCF(int n1 , int n2){
        int HCF = 1;
        for(int i=1;i<=(n1<n2?n1:n2);i++){
             if(n1%i==0 && n2%i==0){
                HCF = i;
             }
        }
        return HCF;
    }

    public static int LCM(int n1 , int n2){
        System.out.println(n1*n2);
        int LCM = n1 * n2/ HCF(n1 , n2);
        System.out.println(LCM);
        return LCM;

    }
    public static void main(String arg[]){
        int n1 = 23;
        int n2 = 11;
        int hcf = HCF(n1,n2);
        int lcm = LCM(n1,n2);

        System.out.println("LCM: "+lcm);
        System.out.println("HCF: "+hcf);
    }
}
