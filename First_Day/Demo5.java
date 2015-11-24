/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
//表达式是由数字、运算符、数字分组符号(括号)等以能求得数值的有意义的序列;
class Demo5
{
	public static void main(String[] args)
	{
		int ret =  3 + 2 - 5;
		System.out.println(ret);
		
		/*
			三目运算符:三目运算符
			
			格式:
				boolean表达式 ? 语句1 : 语句2;
				
				boolean表达式有两种结果:
					true: 执行语句1
					false: 执行语句2
				
				三目运算表达式的结果由语句1和语句2来决定,一般来说语句1和语句2的类型是一样的;
				
				如果怎么样,否则怎么样.
		*/
		
		int score = 99;
		
		char b = score >= 60 ? 'A' : 'E';
		
		System.out.println(b);
	}
}