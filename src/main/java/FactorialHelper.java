public class FactorialHelper {
    int calculate(int i) {
        int result = 1;

        if(i > 0) {
            result = i * calculate(i - 1);
        }

        return result;
    }
}
