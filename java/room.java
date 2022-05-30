class room
{
    float length;
    float breadth;
    room(float x,float y)
    {
        length=x;
        breadth=y;
    }
    room(float x )
    {
        length=breadth=x;
        //length = y;
    }
    float area()
    {
        float r = length * breadth;
        return (r);
    }
}

class ak
{
    public static void main(String args[])
    {
        int area2;
        room room1=new room(4,8);
        room room2=new room(7,8);
        
    }
}