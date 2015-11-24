/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
class Demo7
{
	public static void main(String[] args)
	{
		for(int i = 1; i < 11; i++)
		{
			System.out.println("i= " + i);
			//只打印到前五个
			if(i == 5)
			{
				//结束整个循环
				break;//
			}
		}
		
		System.out.println("=================");
		
		for(int i = 1; i < 11; i++)
		{
			//不打印4
			if(i == 4)
			{
				continue;//跳过本次循环,开始下一次循坏
			}
			System.out.println("i= " + i);
		}
	}
}