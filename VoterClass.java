import java.util.Scanner;

public class VoterClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        if(age>=18)
            System.out.println("you are a voter");
        else
            System.out.println("Not a voter");
    }
}
