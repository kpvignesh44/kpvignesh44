class base
{
int empno=100;
void  displayemp_no()
{System.out.println("empno"+empno);
}}
class drive extends base
{
String empname="anbu";
void dispempname()
{
System.out.println("empname"+empname);
}
}
public class single
{

public static void main(String[] args) 
{
drive d=new drive();
d.displayemp_no();
d.dispempname();
}}