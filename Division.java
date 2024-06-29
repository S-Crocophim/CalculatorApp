public class Division implements Operation
{
    @Override
    public double calculateResult(double left, double right)
    {
        if (right == 0)
        {
            throw new ArithmeticException("Division by zero");
        }
        return left / right;
    }
}