import java.util.Comparator;


public final class CustomArrays {

    public static int binarySearch(final byte[] a, final byte key) {
        return binarySearchBase(a, 0, a.length, key);
    }

    public static int binarySearch(final byte[] a, final int fromIndex, final int toIndex, final byte key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(final char[] a, final char key) {
        return binarySearchBase(a, 0, a.length, key);
    }

    public static int binarySearch(final char[] a, final int fromIndex, final int toIndex, final char key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(final double[] a, final double key) {
        return binarySearchBase(a, 0, a.length, key);
    }

    public static int binarySearch(final double[] a, final int fromIndex, final int toIndex, final double key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(final float[] a, final float key) {
        return binarySearchBase(a, 0, a.length, key);
    }

    public static int binarySearch(final float[] a, final int fromIndex, final int toIndex, final float key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(final int[] a, final int key) {
        return binarySearchBase(a, 0, a.length, key);
    }

    public static int binarySearch(final int[] a, final int fromIndex, final int toIndex, final int key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(final long[] a, final long key) {
        return binarySearchBase(a, 0, a.length, key);
    }

    public static int binarySearch(final long[] a, final int fromIndex, final int toIndex, final long key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(final short[] a, final short key) {
        return binarySearchBase(a, 0, a.length, key);
    }

    public static int binarySearch(final short[] a, final int fromIndex, final int toIndex, final short key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key);
    }

    public static <T> int binarySearch(final T[] a, final T key, final Comparator c) {
        return binarySearchBase(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(final T[] a, final int fromIndex, final int toIndex, final T key, final Comparator c) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearchBase(a, fromIndex, toIndex, key, c);
    }


    private static int binarySearchBase(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static int binarySearchBase(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static int binarySearchBase(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else {
                long midBits = Double.doubleToLongBits(midVal);
                long keyBits = Double.doubleToLongBits(key);
                if (midBits == keyBits)
                    return mid;
                else if (midBits < keyBits)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -(low + 1);
    }

    private static int binarySearchBase(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else {
                int midBits = Float.floatToIntBits(midVal);
                int keyBits = Float.floatToIntBits(key);
                if (midBits == keyBits)
                    return mid;
                else if (midBits < keyBits)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -(low + 1);
    }

    private static int binarySearchBase(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static int binarySearchBase(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static int binarySearchBase(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static <T> int binarySearchBase(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (c == null) {
            return binarySearchBase(a, fromIndex, toIndex, key);
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);
            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    private static int binarySearchBase(Object[] a, int fromIndex, int toIndex, Object key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable midVal = (Comparable)a[mid];
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static void rangeCheck(int arrayLength, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(fromIndex + " > " + toIndex);
        }
        if (fromIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }
        if (toIndex > arrayLength) {
            throw new ArrayIndexOutOfBoundsException(toIndex);
        }
    }
}
