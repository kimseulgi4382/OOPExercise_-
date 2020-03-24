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
		
		System.out.println("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("�˻��Ͻ� ȸ�� ������ �������� �ʽ��ϴ�.");
				
			}
		}

	}

	public void searchName() {
		
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("�˻��Ͻ� ȸ�� ������ �������� �ʽ��ϴ�");
			}
		}

	}

	public void searchEmail() {
		
		System.out.println("�̸����� �Է��ϼ��� : ");
		String userEmail = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(userEmail)) {
				printOne(m[i]);
				break;
			} else {
				System.out.println("�˻��Ͻ� ȸ�� ������ �������� �ʽ��ϴ�");
			}
		} 

	}

	public void updatePwd() {
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		int sw = 0;
		int index = 0;
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				sw = 1;
				index = i;
				break;
			} else {
				sw = 0;
			}
		}
		
		if(sw == 1) {
			System.out.println("�����Ͻ� ��й�ȣ�� �Է��ϼ��� : ");
			String userPwd = sc.next();
			m[index].setUserPwd(userPwd);
			System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
			return;
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�");
			return;
		}
		
		

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
		
		System.out.println("ID : " + m.getUserId());
		System.out.println("�н����� : " + m.getUserPwd());
		System.out.println("�̸� : " + m.getUserName());
		System.out.println("���� : " + m.getAge());
		System.out.println("���� : " +  m.getGender());
		System.out.println("�̸��� : " + m.getEmail());

	}

}
