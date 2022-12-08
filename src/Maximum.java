public class Maximum<T extends Comparable<T>> {
    T val1;
    T val2;
    T val3;

    public Maximum(T val1, T val2, T val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    void max() {
        T max = val1;
        if (val2.compareTo(max) > 0)
            max = val2;
        if (val3.compareTo(max) > 0)
            max = val3;
        printMax(val1,val2,val3,max);
    }

    void printMax(T val1, T val2, T val3, T max) {
        System.out.println("Maximum between " + val1 + " " + val2 + " " + val3 + " is " + max);
    }
}