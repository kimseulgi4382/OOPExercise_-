package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	static Member[] m = new Member[10];
	static int ctn = 0;
	Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {
		
		
			
			System.out.println("���̵� �Է� : ");
			String userId = sc.next();
			System.out.println("�н����� �Է� : ");
			String userPwd = sc.next();
			System.out.println("�̸� �Է� : ");
			String userName = sc.next();
			System.out.println("���� �Է�  : ");
			int age = sc.nextInt();
			System.out.println("���� �Է� : ");
			char gender = sc.next().charAt(0);
			System.out.println("�̸��� �Է� : ");
			String email = sc.next();
			
			
			m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
			ctn++;

	
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�"); 
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
