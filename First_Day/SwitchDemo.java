/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of switching by java
*/
class SwitchDemo
{
	public static void main(String[] args)
	{
		/*
			switch(条件)//必须是一个返回值类型是byte,short,char,int类型的表达式,
			java5开始新增了一个枚举,java7开始多了String
			{
				case 条件可能的一个值:
					//执行代码块
					
				case 条件可能的一个值:
					//执行代码块
				
				case 条件可能的一个值:
					//执行代码块
					
				...
				
				default:
					如果上面的值都不满足条件,就执行这里
				
			}
			
			一旦从一个case进入,就可能发生穿透现象;
			break控制,表示一旦遇到break就结束switch语句
		*/
		
		int weekday = 1;
		
		switch(weekday)
		{
			case 1:
				System.out.println("1");
			break;
				
			case 2:
				System.out.println("2");
			break;
			
			case 3:
				System.out.println("3");
			break;
			
			case 4:
				System.out.println("4");
			break;
			
			case 5:
				System.out.println("5");
			break;
			
			case 6:
				System.out.println("6");
			break;
			
			case 7:
				System.out.println("7");
			break;
			
			default:
				System.out.println("Hi!You are wrong!");
		}
		System.out.println("--------------------");
	}
}