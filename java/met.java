class mat
{
    static float mul(float x , float y)

{
return x*y;

}
static float div(float x,float y)
{
return x/y;
}

}

class met
{
    public static void main(String args[])
    {
        float a = mat.mul(5,1);
        float b = mat.div(a , 2);
        System.out.println("Mul = "+a);
        System.out.println("Div = "+b);
    }
}