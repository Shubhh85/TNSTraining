public class Increment_Decrement {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int X=30;
        System.out.println(" a and b value before the operations : " + a + " "+ b);


        //increamnet ++
        //decreament --

        ++a;

        int c=(++a) +(--a) - (a) + (--a) + a++;
        System.out.println("c value after the operation :"+ c);

        int d=c++ + a + b--;
        System.out.println("d value afyter the operation:"+ d);
        
    
    }
}
