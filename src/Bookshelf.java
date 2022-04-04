public class Bookshelf {

    public static void main(String[] args) {
        int[] books = new int[] {14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(myFunction(books, 33));

    }

    public static int myFunction(int[] x, int y) {
        int left = 0;
        int right = x.length - 1;
        int index = 0;
        while (left < right) {
            int m = (left + right) / 2;
            if (x[m] > y) {
                if (x[m-1] == y) {
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

        //f ? System.out.println("нашли") : System.out.println("не нашли");
        //if (f == true) System.out.println("нашли");
        //else System.out.println("не нашли");
}

    /*public static void myFunction(int[] books, int pcs) {
        int left = 0;
        int right = books.length - 1;
        boolean f = false;
        while (left < right) {
            int middle = (left + right) / 2;
            if (books[middle] == pcs) {
                f = true;
                break;
            } else {
                if (books[middle] > pcs) right = middle - 1;
                else if (books[middle] < pcs) left = middle + 1;
            }
        }
        if (books[left] == pcs) f = true;
        //f ? System.out.println("нашли") : System.out.println("не нашли");
        if (f == true) System.out.println("нашли");
        else System.out.println("не нашли");
    }*/

