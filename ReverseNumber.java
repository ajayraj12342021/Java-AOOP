class Reverse {
    int reverse = 0;

    void reverseNumber(int n) {
        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + n % 10;
        reverseNumber(n / 10);
    }
}

public class ReverseNumber {
    public static void main(String[] args) {

        Reverse r = new Reverse();

        r.reverseNumber(1234);

        System.out.println("Reverse = " + r.reverse);
    }
}