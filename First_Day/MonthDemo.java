/*
	@Author:RayDanjunjun
	@Date:2015-11-24
	@Content:Some information of monthly design by java
*/
class MonthDemo
{
	public static void main(Strings[] args)
	{
		int month = 13;
		
		/*
			if(month >=3 && month <= 5)
			{
				//春天
			}
			else if(month >= 6 && month <= 8)
			{
			}
			else if(month >= 9 && month <= 11)
			{
			}
			
			else
			{
				
			}
		*/
		String msg = "ERROR";
		switch(month)
		{
			case 3:
			case 4；
			case 5:
				//System.out.println("Spring");
				msg = "Spring";
			break;
			
			case 6:
			case 7:
			case 8:
				//System.out.println("Summer");
				msg = "Summer";
			break;
			
			case 1:
			case 2:
			case 12:
				//System.out.println("Winter");
				msg = "winter";
			break;
			
			//default:
				//System.out.println("ERROR");
				//msg="ERROR";
			//break;
		}
		System.out.println(msg);
		
		char c = 'A';
		switch(c)
		{
			case 'C':
			
			case 'A'；
		}
		
		String season = "Spring";
		
		switch(season)
		{
			case "A":
			case "Spring";
		}
		
	}
}