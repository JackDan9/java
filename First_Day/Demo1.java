/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content: Some information of Java
*/
class Demo1
{
	public static void main(String[] args)
	{
		int max = 2147483647;//表示int的最大值/Maximum value of integer
		//2147483647的二进制(binary systyem)
		/*
			0b01111111_11111111_11111111_11111111
			
		  + 0b00000000_00000000_00000000_00000001
		  
		-----------------------------------------------
			
		    0b10000000_00000000_00000000_00000000
		*/
		long i = (long)max + 1;//2147483648
		
		i = max + 1L;
		
		System.out.println(i);//-2147483648
		/*
			向上转型:
				向上:数据类型的范围 从小 ---> 大
					特点:自动转换
				
				小 ---> 大;
				byte,short,char < int < long < float < double
				byte,short,char默认的就会转为int
				
				如果基本类型(Boolean除开)运行元素里面有double,那么结果就是double
				
				数据类型默认提升;
				long l = 95;
				
			向下转型:
				大类型 --> 小类型
				byte,short,char < int < long < float < double
				
		*/
		
		byte b = 12;
		int i1 = b;
		long l = 95;
		double d = 59;
		float f = 123L;
		
		f = f + 123L;
		
		d = f + 123L + 1234 + 3.34;
		
		String s = f + 123L + 1234 + 3.34 + "hi";
		
		s = 2 + 3 + "hi" + "("+(2 + 4)+")";//"5hi2" + 4;
		
		System.out.println(s);
		
		//========================
		
		double PI = 3.14;
		//dpuble i7 = pi;//把pi的值赋给int类型的变量i
		
		int i7 = (int)pi;//把pi的值强制转换车int类型
		
		i7 = (int)(1.23F + 3.34 + 123L);
		System.out.println(i7);
		
		System.out.println('a');
		System.out.println((int)'a');
		System.out.println("'a' + 1 = "+('a' + 1));//类型提升
	}
}