public class Rec {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
    static int fib( int  index){
        if(index<=1)
            return index;
        int num1=fib(index-1);
        int num2=fib(index-2);
        return num1+num2;
    }
}

