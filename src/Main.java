public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(10));
    }

    private static int factorial(int num){
        if(num > 0){
            return num * factorial(num - 1);
        }
        if(num == 0){
            return 1;
        }
        return 0;
    }
}