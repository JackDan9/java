/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of returning by java
*/
class ReturnDemo
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i ++)
		{
			if(i == 5)
			{
				//break;
				
				//return;//表示结束循环所在的方法
				return;
			}
			System.out.prtintln("i= " + i);
		}
		System.out.println("Hello World!");
	}
}