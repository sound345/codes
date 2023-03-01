import java.o.*;
import java.util.*;
public class sum

{

           public static void main(string[])

           {
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter A Number");
                   int number=sc.nextln();
                   int sum=0;
                   int input=number;
                   while(input!=0)
                   {
                     int lastdigit=input%10;
                     sum+=lastdigit;
                     input/=10;
                     }
                     system.out.println("Sum of Digit of Number"+Number+"is"+sum);
                     sc.close();
                     {
               }