//Muhammad Angga Saputra
//193040070

package pertemuan3;

import java.util.Scanner;

public class soal3_2 {
	//deklarasi tipe array
	int[] arr;
	
	public void run()
	{
		//create array
		arr = new int[5];
		
		//assignment elemen array
		Scanner scan = new Scanner(System.in);
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		arr[3] = scan.nextInt();
		arr[4] = scan.nextInt();
		
		//output array
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		soal3_2 program = new soal3_2();
		program.run();
	}
}
