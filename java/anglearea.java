class Rectangle
{
    int l ,b,a;
    Rectangle(int x, int y)
    {
        l = x;
        b = y;
    }
    int rectArea()
    {
        a=l*b;
        return(a);
    }
}

class anglearea
{
    public static void main(String args[])
{    
    int area1;
    Rectangle rect1=new Rectangle(10,15);
    area1=rect1.rectArea();
    System.out.println("area="+area1);
}
}