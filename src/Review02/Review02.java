package Review02;

public class Review02
{

    public static void main(String[] args)
 {
  for (int n = 1; n <= 100; n++ )
       //n=Number
  {
   if (n % 3 == 0)
      {System.out.println("Fizz");}

   else if (n % 5 == 0 )
      {System.out.println("Buzz");}

   else
      {System.out.println(n);}

  }
 }
}