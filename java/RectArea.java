class Rectangle
{
int l,b;
void etData(int x, int y)//test getdata parameter
{
l = x;
b = y;
}
int rectArea ()
{
int area = l*b;
return (area);
}
}


class RectArea
{
public static void main(String args[])
{
    int area1,area2;
    Rectangle rect1=new Rectangle();
    Rectangle rect2=new Rectangle();
    rect1.l=15;
    rect1.b=12;
    area1=rect1.l*rect1.b;
    rect2.etData(20,13);
    area2=rect2.rectArea();
    System.out.println("area1="+area1);
    System.out.println("area2="+area2);
}
}