/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
class Demo8
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		
		/*
			*****
			*****
			*****
		*/
		//嵌套循环; 外层控制行,内层控制列
		int count = 0;
		outer:for(int i = 0; i < 3; i++)
		{
			inner:for(int j = 0; j < 5; j++)
			{
				count++;
				System.out.println("*");
				if(i == 1)
				{
					break outer;
				}
			}
			System.out.println();
		}
		
		//控制外层循环,标签
		
		//终止外层循环 break  外层循环的标签;
		//跳出外层循环: continue 外层循环的标签;
		
		//控制循环 之 return 表示结束该循环所在的方法
		
		System.out.println(count);
	}
}