/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of switching by java
*/
class WhileDemo
{
	public static void main(String[] args)
	{
		/*
			while(boolean条件语句)
			{
				循环体
				//为true就执行这里
			}
			//先判断 后做
		*/
		boolean b = false;
		int count = 0;
		while(count <= 10)
		{
			System.out.println("Hello World!" + count);
			count ++;//count = count + 1;
		}
		
		int i = 1;
		
		int sum = 0;
		
		while(i <= 1000)
		{
			sum = sum + i;
			//System.out.println(i);
			i ++;
		}
		System.out.println("i= " + i);
		
		//1		i = 1 		sum = 1;
		//2 	i = 2 		sum = 1 + 2;
		//3 	i = 3		sum	= 1 + 2 + 3；
		
		System.out.println("sum= " + sum);
	}
}