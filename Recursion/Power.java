

public class Power {
    static int pow(int num , int pow){
        if(pow==0){
             return 1;
        }
        if(pow ==1){
            return num;
        }
        return num*pow(num, pow-1);
    }
    public static void main(String[] args) {
        int num =3;
        int p=0;
        System.out.println(pow(num,p));
    }
}
