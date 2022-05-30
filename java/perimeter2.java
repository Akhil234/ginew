 class perimeter
 {
     int length;
     int breadth;
 perimeter(int z,int l )
 {
     length=z;
     breadth=l;
 }
 perimeter(int x,int y)
 {
     length=x;
     breadth=y;
 }
 void cal_peri()
 {   
    int peri; 
     peri=2*(length*breadth);
     System.out.println("\n the perimeter of the rectangle is:="+peri);
     
 }
}
class perimeter2
{
    public static void main(String args[])

{
    perimeter p1=new perimeter(2,4);
    perimeter p2=new perimeter(5,10);
    p1.cal_peri();
    p2.cal_peri();

    
}
}

