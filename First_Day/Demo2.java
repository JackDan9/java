/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of java
*/
class Demo2
{
	public static void main(String[] args)
	{
		System.out.println(5 % 2);//求余数
		/*
			++;
				表示自己的值加1
				
					++在变量的后面:
						表示先运算在自身加1;
					
					++在变量的前面:
						表示变量先自增1,在参与运算
						
					--(同);
		*/
		
		int a = 5;
		//int b = a ++;//6,5
		
		int b = ++ a;//a = a + 1; 6,6
		System.out.println("a=" + a + ", b=" + b);
		
		//Exception in thread "main" java.lang.ArithmeticException: /by zero
		//System.ouyt.println(1/0);//ERROR
		
		System.out.println(1.0/0);//Infinity 正无穷大
		
		//int x=7510; x = x / 1000 * 1000; x=?
		
		System.out.println( 7510 / 1000 * 1000);//7000
		
		/*
			
			隐式类型转换
			= , += , -=, *=, /=, %=
			
			+=;
			
			int x = 7;
			
			x += 8; <====> x = x + 8;
			
			
			byte b = 17;
			
			b += 8; <====> b = b + 8;
		*/
		
		byte b1 = 17;
		
		//b1 = b1 + 8;//ERROR:可能损失精度
		b1 += 8;
		
		System.out.println(b1);
	}
}