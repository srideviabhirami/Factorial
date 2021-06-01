public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getFactorial() {
        if (this.number <= 1)
            return 1;
        else {
            int number = this.number;
            this.number -= 1;
            return number * this.getFactorial();
        }
    }
}
