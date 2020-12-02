public class Counter {
    int field = 0;
    int fieldReset = field;


    public Counter() {
    }

    public Counter(int field) {
        this.field = field;
        fieldReset = field;
    }


    public void add(int number) {
        field = field + number;
    }

    public void add() {
        field++;
    }

    public int get() {
        return field;
    }

    public void reset() {
        field = fieldReset;
    }

    public static void main(String[] args) {



    }
}
