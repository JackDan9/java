/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
class Demo4 
{
	public static void main(String[] args)
	{
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		
		//====================================
		
		System.out.println("/============================");
		System.out.println(true | true);//true
		System.out.println(true | false);//true
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		
		//===================================
		
		System.out.println("/=============================");
		System.out.println(true ^ true);//false
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false
		
		//===================================
		
		System.out.println("/============================");
		boolean b = true;
		System.out.println(!b);//false
		System.out.println(!!b);//true
		//==================================
		System.out.println("/===============短路与==============");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		
		//=================================
		System.out.println("/===============短路或==============");
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.printlln(false || true);//true
		System.out.println(false || false);//false
		
		/*
			短路与:
				特点:当&&左边的运算为false的时候,就不再判断&&后面的运算了
				
			短路或:
				特点:当||左边的运算为true的时候,就不再判断||后面的运算了
		*/
		System.out.println("---------------------");
		//System.out.println((3==4) & (1/0==1));//出现异常,说明程序运行了(1/0==1)
		//System.out.println((3==4) & (1/0==1));//没有出现异常,那是因为没有运行//后面的语句
		
		System.out.println("---------------------");
		
		int temp = 5;
		//System.out.println(3 < temp < 7);//ERROR
		
		System.out.println(3 < temp && temp < 7);
	}
}