import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Scanner sc = new Scanner(System.in);

   Circle c1 = new Circle(10.1);
   Circel c2 = new Circle(14.0);
   Circle c3 = new Circle(20.5);

   System.out.print(c1.toString());
   System.out.print(c2.toString());
   System.out.print(c3.toString());


   System.out.println("Type a number for length and width: ");
   double lenWid = sc.nextDouble();
   System.out.println("Type a length: ");
   double len = sc.nextDouble();
   System.out.println("Type a width: ");
   double wid = sc.nextDouble();

   Rectangle r1 = new Rectangle(lenWid);
   Rectangle r2 = new Rectangle(len, wid);

   System.out.println(r1.toString());
   System.out.println(r2.toString());



   System.out.println("Type a side length: ");
   double side = sc.nextDouble();
   
   RegularPolygon rp1 = new RegularPolygon(side);
   RegularPolygon rp2 = new RegularPolygon(4, side);

   System.out.println(rp1.toString());
   System.out.println(rp2.toString());

   sc.close();
  }
}
