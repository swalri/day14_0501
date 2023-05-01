package OP;

import java.util.Scanner;

public class TestClass01 {
	private Scanner scan = new Scanner(System.in);
	private ClassDTO01 dto = new ClassDTO01();
	private int i = 0;// 회원가입 수
	private boolean loginplay = false;// 로그인확인
	container c;

	// 기능 구현
	public void display() {
		while (true) {
			System.out.println("=================");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그아웃");
			System.out.println("4. 종료");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				login();
				break;
			case 2:
				plus();
				break;
			case 3:
				logout();
				break;
			case 4:
				System.out.println("종료합니다");
				System.exit(0);
				break;
			default:
				break;
			}
		} // while
	}

	// id 입력
	private void inputId() {
		String id;
		System.out.print("id : ");
		id = scan.next();
		dto.setId(id);
	}

	// pwd 입력
	private void inputPwd() {
		String pwd;
		System.out.print("pwd : ");
		pwd = scan.next();
		dto.setPwd(pwd);
	}

	// 로그인
	private void login() {
		if (i == 0) {
			System.out.println("등록되어있는 회원이 없습니다.");
		} else {
			inputId();
			if (dto.player.containsKey(dto.getId())) {
				inputPwd();
				if (dto.getPwd().equals(dto.player.get(dto.getId()))) {
					loginplay = true;
					System.out.println(dto.getId() + "님 어서오세요");
					loginoption();
				} else {
					System.out.println("비밀번호가 다름니다");
				}
			} else {
				System.out.println("없는 아이디 입니다");
			}
		}
	}

	// 로그인 기능
	private void loginoption() {
		boolean tf = true, option = false;
		while (tf) {
			System.out.println("==================");
			System.out.println("1. 기능");
			System.out.println("2. off");
			System.out.println("3. 종료");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				if (option) {
					System.out.println("기동중입니다");
				} else {
					c = new container();
					c.start();
					option = true;
				}
				break;
			case 2:
				if (option) {
					c.containerstop();
					option = false;
				} else {
					System.out.println("기능을 시작해 주세요");
				}

				break;
			case 3:
				c.containerstop();
				option = false;
				System.out.println("종료합니다");
				tf = false;
				break;
			default:
				break;
			}
		}

	}

	// 회원가입
	private void plus() {
		inputId();
		if (dto.player.containsKey(dto.getId())) {
			System.out.println("사용중인 아이디 입니다");
		} else {
			inputPwd();
			dto.player.put(dto.getId(), dto.getPwd());
		}
		i++;
	}

	// 로그아웃
	private void logout() {
		if (i == 0) {
			System.out.println("등록되어있는 회원이 없습니다.");
		} else {
			if (loginplay) {
				System.out.println("로그아웃");
				dto.setId(null);
				dto.setPwd(null);
				loginplay = false;
			} else {
				System.out.println("로그인 되어있지 않습니다");
			}
		}
	}

}
