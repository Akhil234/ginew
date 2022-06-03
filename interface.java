class student
{
	int rollnumber;
	void getnumber(int n)
	{
		rollnumber=n;
	}
	void putnumber()
	{
		System.out.println("Roll no:"+rollnumber);
	}
}
class test extends student
{
	float part1,part2;
	{
	void getmarks(float m1,float m2)
	{
		part1=m1;
		part2=m2;
	}
	void putmarks()
	{
		System.out.println("marks obtained");
	System.out.println("part1 ="+part1);
System.out.println("part2="+part2);

}
}
interface sports
{
float sportwt=6.0F;
void putwt();
}
class results extends test implements sports
{
float total;
public void putwt()
{
System.out.println("sportswt="+sportwt);
}
void display()
{
total=part1+part2+sportwt;
putnumber();
putmark();
putwt();
System.out.println("total score="+total);
}
}
class hybrid
{
	public static void main(String args[])
	{
		Result student1=new Result();
		stude
