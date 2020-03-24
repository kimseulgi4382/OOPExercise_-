package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	static Member[] m = new Member[10];
	static int ctn = 0;
	Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {
		
		
			
			System.out.println("아이디 입력 : ");
			String userId = sc.next();
			System.out.println("패스워드 입력 : ");
			String userPwd = sc.next();
			System.out.println("이름 입력 : ");
			String userName = sc.next();
			System.out.println("나이 입력  : ");
			int age = sc.nextInt();
			System.out.println("성별 입력 : ");
			char gender = sc.next().charAt(0);
			System.out.println("이메일 입력 : ");
			String email = sc.next();
			
			
			m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
			ctn++;

	
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다"); 
		return;

	}

	public void seachId() {

	}

	public void searchName() {

	}

	public void searchEmail() {

	}

	public void updatePwd() {

	}

	public void updateName() {

	}

	public void updateEmail() {

	}

	public void deleteOne() {

	}

	public void deleteAll() {

	}

	public void printAllMember() {

	}

	public void printOne(Member m) {

	}

}
