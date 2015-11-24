/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
class DoWhileDemo
{
	public static void main(String[] args)
	{
		/*
			do
			{
				//执行代码
			}
			while(Boolean条件语句);
			
			特点:先做后判断,
			
			无论条件是true还是false,dowhile至少会执行一次;
		*/
		
		int count = 1;
		do
		{
			System.out.println("Hello World!");
			count ++;
		}
		while(count<=5);
		
		//
		do
		{
			System.out.println("do");
		}
		while(false);
		
		boolean b = false;
		while(b)
		{
			System.out.println("while");
		}
	}
}