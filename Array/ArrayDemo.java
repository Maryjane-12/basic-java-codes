import java.util.Scanner;

class ArrayDemo {
    public static void main (String Koi[]) {
        int N[], a, b;
        int[] x, y;

        N = new int [5];
        N[0] = 5; //first element = 0
        N[1] = 10;        
        N[2] = 15;        
        N[3] = 20;
        N[4] = 25;
        //N[5] = 5; ArrayOutOfBoundsExeption

        //ARRAY N[]
        System.out.println("N[]");
        for (a = 0; a < N.length; a++) {
            System.out.println("Index " + a + ": " + N[a]);
        }

        //ARRAY x[]
        System.out.println("x[]");
        x = new int [5];
       
        for (a = 0; a < x.length; a++) {
            x[a] = a+1;
            System.out.println("Index " + a + ": " + x[a]);
        }

        //ARRAY y[]
        System.out.println("y[]");
        y = new int [10];
        int cntr = 0;
        for (b = 0; b < y.length; b++) {
            y[b] = cntr;
            cntr+=4;
            System.out.println("Index " + b + ": " + y[b]);
        }
    }
}

