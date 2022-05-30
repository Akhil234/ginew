class Student
{
    String color;
    String type;
    int age;
    String name;

    public void write()
    {
        System.out.println("writing something");
    }
    public void printcolor()
    {
        System.out.println(this.color);
    }
    public void studinfo()
    {
        System.out.println(this.age);
        System.out.println(this.name);
    }
    Student(Student Student2)
    {
        this.age=Student2.age;
        this.name=Student2.name;

    }
    Student()
    {

    }
}
 public class OOPS
 {
     public static void main(String args[])
     {
         //Pen pen1=new Pen();
         //pen1.color="blue";
         //pen1.type="gel";
      
         //Pen pen2=new Pen();
         //pen2.color="black";
         //pen2.type="jel";
         //pen2.printcolor();
         //pen1.printcolor();

         Student Student1=new Student();

         Student1.age=12;
         Student1.name="AKHIL";
         Student1.studinfo();
         Student Student2=new Student(Student1);
         Student2.studinfo();


         //pen1.write();
     }
 }