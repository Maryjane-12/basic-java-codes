import java.util.*;

class OddEven {
    static boolean loop = true;
    static Scanner scannerniKoi = new Scanner (System.in);
    static int integer = 0, counter = 0, x = 0, currNum = 1;
    static int storage[];

    static void AskArrayLength() {
        System.out.println("How many numbers would you like to enter?");
        System.out.print("Number: ");
        counter = scannerniKoi.nextInt();
        storage = new int [counter];
    }

    static void GetInteger() {
        System.out.print("Enter integer #" + (currNum) +": ");
        integer = scannerniKoi.nextInt();
        ++currNum;
    }

    static void OddEvenChecker () {
        if ((integer % 2) == 0) {
            System.out.println(integer + " is an even number.");
        } else {
            System.out.println(integer + " is an odd number.");
        }
    }

    static void SavetoArray() {
        for (x = 0; x < counter; ++x) {
            storage[x] = integer;
            System.out.println(x);
        }
    }

    static void RunRepeat () {
        char response;
        System.out.println("Would you like to enter another number? Y/N");
        System.out.print("Your response: ");
        response = scannerniKoi.next().toLowerCase().charAt(0);

        if (response == 'y') {
            loop = true;
        } else {
            loop = false;
            System.out.println("Program has been stopped.");
        }
    }

    public static void main (String Koi[]) {
        AskArrayLength();
        
        while (loop == true){
            do {
                GetInteger();
                SavetoArray();
                OddEvenChecker();
            } while (x < storage.length);
        }

        RunRepeat();  


 
    } // end of main()
} //end of OddEven
