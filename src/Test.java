
import Copy.Std.In;
import Copy.Std.StdIn;
import Copy.Std.StdOut;

import java.util.Arrays;

// Based on class BinarySearch
public class Test
{
    // precondition: array a[] is sorted
    public static int rank(int key, int[] a)
    {
        int lo = 0,
                hi = a.length - 1,
                indent = 0;
        while (lo <= hi) {
            StdOut.printf("%s%-4d%d\n", repeat(4*indent++, ' '), lo, hi);

            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    private static String repeat(int n, char c)
    {
        String s = "";
        for (int i = 0; i < n; i++)
            s += c;
        return s;
    }

    public static void main(String[] args)
    {
        int[] whitelist = new int[args.length];
        for(int i=0;i<args.length;i++){
            whitelist[i] = Integer.parseInt(args[i]);
            System.out.print(whitelist[i]+" ");
        }

        Arrays.sort(whitelist);

        // read key; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}
