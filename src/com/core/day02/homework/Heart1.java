/**
 * 本代码归王军版权所有，未经许可，不得复制，转载，分发……。
 */
package com.core.day02.homework;

/**
 * @author 王军
 *
 */
public class Heart1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i;
		int j;
		int k;
		for(i=1;i<=3;i++)//前9行
		{
			for(j=1;j<=3;j++)
			{
				for(k=1;k<=29;k++)
				{   
					switch(i)
					{
					case 1://前3行
						if(Math.abs(k-8)<=2*j||Math.abs(k-22)<=2*j)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
						break;
					case 2://4~6行
						System.out.print("*");
						break;
					case 3://7~9行
						if(Math.abs(k-15)<=14-j)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
						break;
				     }
			}
				System.out.println();
			}
		}

			for(i=1;i<=5;i++)//10~14
			{
				for(j=1;j<=29;j++)
				{
					if(Math.abs(j-15)<=11-2*i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("              *");//15行

		}

	}


