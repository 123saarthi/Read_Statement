/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reading1;

import java.io.DataInputStream;
class Reading
{ public static void main(String args[])
  { DataInputStream in=new DataInputStream(System.in);
    int intnumber=0;
    float floatnumber=0.0f;
    try
    { System.out.println("Enter an integer");
      intnumber=Integer.parseInt(in.readLine());
      System.out.println("Enter a float number");
      floatnumber=Float.valueOf(in.readLine()).floatValue();
    }
    catch(Exception e) { }
      System.out.println("intnumber="+intnumber);
      System.out.println("floatnumber="+floatnumber);
}
}
