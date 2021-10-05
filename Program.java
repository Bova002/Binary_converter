package binary;
import java.util.Scanner;
class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Binary.toBinary(x));
    }
}
