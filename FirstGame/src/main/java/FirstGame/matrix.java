package FirstGame;

public class matrix {
    public static void main(String[] args) {
        int[][] a = {{ 1, 2, 3, 4, 6},
                     { 4, 5, 6, 7, 7},
                     { 7, 8, 9, 12, 9},
                     { 5, 7, 10, 20, 10},
                     { 5, 7, 10, 20, 10}};
        int s = 0;
        int b = 0;
        int c = 0;
        for(int i=0; i<a.length; ++i){
            for(int j=0; j<a[i].length; ++j){
                if(i == j){
                    b += a[i][j];
                }
            }
        }
        for(int i=0; i<a.length; ++i){
            for(int j=0; j<a[i].length; ++j){
                if(i+1 == j){
                    s += a[i][j];
                }
            }
        }
        c = b+s;
        System.out.println(s);
                    System.out.println(b);
                            System.out.println(c);
    }
}

