public class ProblemSet8_1 {

    public static void main(String args[]) {
        int[] solarray = new int[207];
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                for (int k = 1; k < 100; k++) {
                    if (good(i, j) && good(j, k) && good(i, k)) {
                        append(solarray, i, j, k);
                    }
                }
            }
        }
        printDiophantineArray(solarray);
    }
    static boolean good(int a, int b) {
        int x = a * b + 1;
        int y = (int) (Math.sqrt(x) + .5);
        return (y * y == x);
    }

    public static void append(int[] a, int b, int c, int d){
        for (int i =0; i<a.length; i+=3){
            if((a[i]==b || a[i] ==c || a[i] == d) && (a[i+1]==b || a[i+1]== c || a[i+1] == d) && (a[i+2] == b || a[i+2] == c || a[i+2] == d)){
                return;
            }
        }
        for (int i=0; i<a.length; i++){
            if(a[i] == 0){
                a[i] = b;
                a[i+1] = c;
                a[i+2] = d;
                return;
            }
        }
    }
    public static void printArray(int[] a){
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }

    public static void printDiophantineArray(int[] a){
        for (int i=0; i<a.length; i+=3){
            System.out.println(a[i] + ", " + a[i+1] + ", " + a[i+2]);
        }
    }
}


