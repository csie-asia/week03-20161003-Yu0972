package hw;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/04
 * Author: 105021045 郭毓呈
 */

import java.util.Scanner;
public class hw04_105021045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一正整數=");
		int n = scn.nextInt();
		int x = n;
		int m = 1;
		while(x > 0){ 
		m = m * x ; x -- ;
			}
		System.out.println(n+"!"+"="+m);
	}

}
