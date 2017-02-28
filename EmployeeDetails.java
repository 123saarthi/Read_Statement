import java.util.Scanner;
public class EmployeeDetails
{ void showmenu()
  { System.out.println("----------Menu----------");
    System.out.println("1. Enter data");
    System.out.println("2. Display data");
    System.out.println("3. Exit");
    System.out.println("Choose the option");
    int option;
    Scanner in=new Scanner(System.in);
    option=in.nextInt();
   }
  public static void main(String args[])
  { EmployeeDetails ed=new EmployeeDetails();
    ed.showmenu();
  }
}
