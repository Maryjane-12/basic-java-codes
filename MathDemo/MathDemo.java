
class MathDemo{
    public static void main (String mich[]){
        int N1,N2,ans;
        N1=10;
        N2=5;

        ans=N1+N2;
        System.out.println("Sum=" +ans);
        ans=N1-N2;
        System.out.println("Sum=" +ans);
        ans=N1/N2;
        System.out.println("Sum=" +ans);
        ans=N1*N2;
        System.out.println("Sum="+ans);

        double grd=74.5;


        int day;
        switch (day = 56) {
            case 1: 
            System.out.println("Sunday");
            break;

            case 2: 
            System.out.println("Monday");
            break;

            case 3: 
            System.out.println("Tuesday");
            break;

            case 4: 
            System.out.println("Wednesday");
            break;

            case 5: 
            System.out.println("Thursday");
            break;

            case 6: 
            System.out.println("Friday");
            break;

            case 7: 
            System.out.println("Saturday");
            break;

            default:
            System.out.println("Nasa choices ba yan???");
        }
    }
}
