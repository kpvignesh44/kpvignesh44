import java.util.Scanner;


 class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rev,num;
num=0;
rev=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
num=scan.nextInt();
while(num!=0)
{rev=rev*10;
rev=rev+num%10;
	num=num/10;
}


System.out.println(+rev);
	









	}

}
