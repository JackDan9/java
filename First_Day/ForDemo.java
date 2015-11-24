/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
class ForDemo
{
	public static void main(String[] args)
	{
		/*
			for(初始化语句a; boolean判断语句b; 循环完执行执行语句c)
			{
				//循环体d
			}
			
			//若事先知道循环的次数, 首选for
		*/
		
		//执行顺序 a -> b --> false :结束循环
		//				|
		//				true: --> d--->c --->b
		
		for(int i = 0; i < 5; i ++)
		{
			System.out.println("Hello World!" + i);
		}
		
		//1 + 2 + 3 + ... + 100
		
		int num = 1;
		int sum = 0;
		do
		{
			sum += num;
			num ++;
		}
		while (num<=100);
		
		System.out.println(num);
		
		//for
		
		sum = 0;
		int i;
		for(i = 1; i < 101; i++)
		{
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println("i= "+i);
		
		//while for
		//实现知道循环的次数就是要for
		
		for(;;){}
	}
}