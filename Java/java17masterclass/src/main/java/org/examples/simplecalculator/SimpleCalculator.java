public class SimpleCalculator {
    // write code here
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;

    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double neededFirstNumber) {
        firstNumber = neededFirstNumber;
    }

    public void setSecondNumber(double neededSecondNumber) {
        secondNumber = neededSecondNumber;
    }

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubstractionResults() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResults() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResults() {
        if (secondNumber == 0) return 0;
        else return (firstNumber / secondNumber);
    }

}
