public class Main {
    public static void main(String[] args) {
        FactorialHelper factorialHelper = new FactorialHelper();

        System.out.println(factorialHelper.calculate(5));
        System.out.println(factorialHelper.calculate(0));
        System.out.println(factorialHelper.calculate(-1));
        System.out.println(factorialHelper.calculate(3));
        System.out.println(factorialHelper.calculate(1));
        System.out.println(factorialHelper.calculate(2));
        System.out.println(factorialHelper.calculate(4));
    }
}
