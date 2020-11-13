package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		
		System.out.print("사번: ");
		int point = sc.nextInt();
		
		if(point/3 == 0 || 0 == point%3) {
			System.out.println("A팀입니다.");
		}else if(point/3 == 1 || 1 == point%3) {
			System.out.println("B팀입니다.");
		}else if(point/3 == 2 || 2 == point%3) {
			System.out.println("C팀입니다.");
		}else if(point<0) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			System.out.println("A팀입니다.");
		}
			
			
			
		
		
		sc.close();
	}

}
