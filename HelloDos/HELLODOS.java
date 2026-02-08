import java.util.*;

class HelloDOS{
    public static void main(String eds[])   {
        Scanner input = new Scanner(System.in);//new means namana na n new lahat ng input
        System.out.println("Hello World in DOS!");
        
        int n1,n2,n3;

        System.out.print("enter 1stno:");
    n1= input.nextInt();

        System.out.print("enter 2nd no:");
n2=input.nextInt();
        System.out.print("enter 3rd no:");
n3=input.nextInt();
                    //method call
System.out.print("sagot="+Sum(n1,n2,n3));
    }
        static int Sum(int x,int y,int z)   {  
            int ans = x+y+z;
            return ans;

}
}
