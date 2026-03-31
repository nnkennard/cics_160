public class FunctionOnStack {

    public static int factorial(int x){
        int result=-1;
        if (x==0 || x==1){
            result = 1;
        } else if (x > 1) {
            result = x * factorial(x-1);
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 3;
        int k = factorial(x);
        System.out.println(x+"! = "+k);
    }
}
