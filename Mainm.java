package training;

public class Mainm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodss m=new methodss();
m.launchapp("https://www.snapdeal.com/");
m.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]");
m.login("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[1]/ul/li[1]/a/i");
m.nam("//*[@id=\"userName\"]","vignesharya44@gmail.com");
m.contt("//*[@id=\"checkUser\"]");
//m.actions("/html/body/div[10]/div[3]/div/div[1]/div[2]/ul/li[2]", "/html/body/div[10]/div[3]/div/div[1]/div[2]/ul/li[2]/div/div[1]/div/div/p[2]/a/span");
//m.mobile("/html/body/div[10]/div[9]/div[2]/div[2]/div[4]/div/div[2]/input");
//m.check("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div[2]/div[4]/div/div[2]/button");
	}
}
