import java.util.Arrays;

public class Domino implements Comparable<Domino> {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino o) {
        if (o.getLeftSide() == this.getLeftSide()) {
            if (o.getRightSide() < this.getRightSide())
                return 1;
            else if (o.getRightSide() > this.getRightSide())
                return -1;
            else
                return 0;
        } else if (o.getLeftSide() < this.getLeftSide())
            return 1;
        else
            return -1;

    }

}