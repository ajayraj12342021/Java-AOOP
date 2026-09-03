public class hcfandlcm {
    public static void main(String[] args){
        int a=12;
        int b=18;
        int hcf=1;
        for(int i=1;(i<=a && i<=b);i++){
            if((a%i==0)&& (b%i==0)){
                hcf=i;
            }
        }
        int lcm=(a*b)/hcf;
        System.out.println("The Hcf is:" + hcf);
        System.out.println("The Lcm is:" + lcm);
    }             
} 
