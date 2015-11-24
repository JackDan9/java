/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
//条件语句之 if
class IfDemo
{
	public static void main(String[] args)
	{
		/*
			格式1:
				
				如果什么什么为真就,执行......
				if(boolean表达式A)
				{
					//若A为true的话,就执行这里
				}
			
			格式2:
				
				if(boolean表达式)
				{
					//为真就执行这里
				}
				else
				{
					//否则就执行这里
				}
				
			格式3:
				if(boolean表达式)
				{
					//为真就执行这里
				}
				else if(boolean表达式)
				{
					//
				}
				......多个else if ()
					
				else
				{
					//前面的判断语句都为false,就执行这里
				}
		*/
		
		if(false)
		{
			System.out.println("Hello World!");
		}
		
		int age = 17;
		
		if(age > 6)
		{
			System.out.println("6");
		}
		
		if(age > 20)
		{
			System.out.println("20");
		}
		
		if(age > 10)
		{
			System.out.println("10");
		}
		
		System.out.println("-------------------------------");
		
		age = 15;
		
		if(age < 15)
		{
			System.out.println("");
		}
		else// >=
		{
			System.out.println("");
		}
		
		//求出两个数中的最大的数
		
		int a = 49;
		int b = 23;
		
		int max = (a > b) ? a:b;
		
		System.out.println(max);
		
		if(a > b)
		{
			//a
		}
		else
		{
			//b
		}
		
		System.out.println("-----------------------------");
		
		age = 17;
		if(age > 18 && age <= 50)
		{
			System.out.println("Adult");
		}
		else if(age > 50 && age <= 69)
		{
			System.out.println("Wrinkly");
		}
		else if(age > 70)
		{
			System.out.println("Old_People");
		}
		else 
		{
			System.out.println("Children");
		}
		
		System.out.println("-------------------------------");
		
		if(true)
		{
			System.out.println("Running1");
		}
		
		System.out.println("Runninig2");
		
		int weekday = 5;
		
		if(weekday == 1)
		{
			
		}
		else if(weekday == 2)
		{
			
		}
		else if(weekday == 3)
		{
			
		}
		else if(weekday == 4)
		{
			
		}
		else if(weekday == 5)
		{
			
		}
		else if(weekday == 6)
		{
			
		}
		else if(weekday == 7)
		{
			
		}
		else 
		{
			//ERROR
		}
		
	}
}