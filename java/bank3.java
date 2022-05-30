import java.util.*;
import bank2;

 class bank
{
    public String name;
    protected String email;
     String password;


//public void setpassword()
//{
  //  this.password=password;

//
public void printinfo()
{
    System.out.print(this.password);
    System.out.print(this.email);
}
}
public class bank3
{
public static void main(String args[])
{
    bank account1=new bank();
    account1.name="akhil";
    account1.email="akhil@123";
    account1.password="ihdsk";
    account1.printinfo();
}

}