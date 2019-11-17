package NewWork;

public class NumberCompare {
    private double[] arrays;
    private boolean isAlreadySort;
    public void getIsAlreadySort() {
        System.out.print("排序情况为：");
        System.out.println(isAlreadySort);
    }
    public NumberCompare(double[] input, boolean isSort) {
        this.arrays = input;
        if (isSort) {
            sort();
        }
        this.isAlreadySort = isSort;
    }
    public NumberCompare(double[] input) {
        this(input,false);
    }
    public void sort() {
        double[] clone = this.arrays;
        double numberCache;
        for (int x = 0; x < this.arrays.length; x++) {
            for (int y = 0; y < this.arrays.length; y++) {
                if (this.arrays[x] < this.arrays[y]) {
                    numberCache = this.arrays[x];
                    this.arrays[x] = this.arrays[y];
                    this.arrays[y] = numberCache;
                }
            }
        }
        this.isAlreadySort = true;
    }
    public Object[] showMin() {
        double min = arrays[0];
        int itsIndex = 0;
        for (int index = 0; index < arrays.length; index++) {
            if (arrays[index] < min) {
                min = arrays[index];
                itsIndex = index;
            }
        }
        Object[] objects = {min, itsIndex};
        return objects;
    }
    public  Object[] showMax() {
        double max = arrays[0];
        int itsIndex = 0;
        for (int index = 0; index < arrays.length; index++) {
            if (arrays[index] > max) {
                max = arrays[index];
                itsIndex = index;
            }
        }
        Object[] objects = {max, itsIndex};
        return objects;
    }
    public  double sortMinValue() {
        if (!isAlreadySort) {
            sort();
        }
        return this.arrays[0];
    }
    public double sortMaxValue() {
        if (!isAlreadySort) {
            sort();
        }
        return this.arrays[this.arrays.length - 1];
    }

    public double[] getArrays() {
        return arrays;
    }
}
