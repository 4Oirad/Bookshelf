public class Bookshelf {

    public static void main(String[] args) {
        int[] books = new int[] {14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(myFunction(books, 60));

    }

    public static int myFunction(int[] x, int y) {
        int left = 0;
        int right = x.length - 1;
        int index = 0;
        while (left <= right) {
            int m = (left + right) / 2;
            if (x[m] > y) {
                if (m == 0) {
                    index = -1;
                    break;
                }
                if ((x[m-1] == y) || (x[m-1] < y)) {
                   index = m - 1;
                   break;
                }
                right = m - 1;
            } else {
                left = m + 1;
            }
        index = m;
        }
        return x.length - 1 - index;
    }
}