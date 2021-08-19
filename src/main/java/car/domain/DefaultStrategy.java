package car.domain;

public class DefaultStrategy implements MovingStrategy{
    private static final int MINNUMBER = 4;
    @Override
    public boolean isMovable(int inputNumber) {
        return inputNumber >= MINNUMBER;
    }
}
