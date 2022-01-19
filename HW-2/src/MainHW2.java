public class MainHW2 {
    public static void main(String[] args) {
        int triangleAreaX1 = 1;
        int triangleAreaY1 = 3;
        int triangleAreaX2 = 2;
        int triangleAreaY2 = -5;
        int triangleAreaX3 = -8;
        int triangleAreaY3 = 4;
        float triangleAreaResult = triangleArea(triangleAreaX1, triangleAreaY1, triangleAreaX2, triangleAreaY2, triangleAreaX3, triangleAreaY3);
        System.out.println("Triangle Area result: " + triangleAreaResult);

        int isEvenInput = 12;
        boolean isEvenResult = isEven(isEvenInput);
        System.out.println("Number " + isEvenInput + " is " + (isEvenResult ? "even" : "odd"));

        double moduloLessInputFirst = -15;
        double moduloLessInputSecond = 13.2;
        double moduloLessInputLast = -4.01;
        double moduloLessResult = moduloLess(moduloLessInputFirst, moduloLessInputSecond, moduloLessInputLast);
        System.out.println("Module less result is: " + moduloLessResult);
    }

    protected static float triangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }

    protected static boolean isEven(int number) {
        return number % 2 == 0;
    }

    protected static double moduloLess(double firstNumber, double secondNumber, double lastNumber) {
        double firstNumberModulo = firstNumber < 0 ? firstNumber * (-1) : firstNumber;
        double secondNumberModulo = secondNumber < 0 ? secondNumber * (-1) : secondNumber;
        double lastNumberModulo = lastNumber < 0 ? lastNumber * (-1) : lastNumber;

        if (firstNumberModulo <= secondNumberModulo && firstNumberModulo <= lastNumberModulo) {
            return firstNumber;
        } else if (secondNumberModulo <= firstNumberModulo && secondNumberModulo <= lastNumberModulo) {
            return secondNumber;
        }

        return lastNumber;
    }
}
