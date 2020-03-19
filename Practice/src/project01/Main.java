package project01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		data[] datas = new data[3];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = new data();
		}
		String[] menu = new String[] { "등록", "명단", "수정", "검색", "삭제", "종료" };
		int index = 0;
		while (true) {
			for (int i = 0; i < menu.length; i++) {
				System.out.println(i + 1 + "." + menu[i]);
			}
			System.out.print("입력 :");
			int menuNum = in.nextInt();
			switch (menuNum) {
			case 1: // 등록
				in.nextLine();
				System.out.println("이름을 입력하세요");
				datas[index].setName(in.nextLine());
				System.out.println("나이를 입력하세요");
				datas[index].setAge(in.nextInt());
				index++;
				break;
			case 2: // 명단
				for (int i = 0; i < datas.length; i++) {
					System.out.println("[" + (i + 1) + ".이름:" + datas[i].getName() + " 나이:" + datas[i].getAge() + "]");
				}
				break;
			case 3: // 수정
				System.out.print("수정하고자 하는 사람의 이름을 입력하세요 :");
				in.nextLine();
				String find = in.nextLine();
				for (int i = 0; i < index; i++) {
					if (datas[i].getName().equals(find)) {
						System.out.println(datas[i].getName() + datas[i].getAge());
						System.out.println("수정 1번, 취소 2번");
						int select = Integer.parseInt(in.nextLine());
						switch (select) {
						case 1:
							System.out.print(datas[i].getName() + "->");
							datas[i].setName(in.nextLine());
							System.out.print(datas[i].getAge() + "->");
							datas[i].setAge(in.nextInt());
							break;
						case 2:

							break;
						}
					}
				}
				break;
			case 4: // 검색
				System.out.print("검색하고자 하는 사람의 이름을 입력하세요 :");
				in.nextLine();
				String name = in.nextLine();
				for (int i = 0; i < index; i++) {
					if (datas[i].getName().equals(name)) {
						System.out.println(datas[i].getName());
						System.out.println(datas[i].getAge());
						break;
					}

				}
				break;
			case 5: // 삭제
				System.out.println("삭제하고자 하는 사람의 이름을 입력하세요");
				in.nextLine();
				String name1 = in.nextLine();
				for (int i = 0; i < index; i++) {
					if (datas[i].getName().equals(name1)) {
						System.out.println(datas[i].getName());
						System.out.println(datas[i].getAge());
						System.out.println("삭제하시겠습니까? 예:1 , 아니요:2");
						int select1 = in.nextInt();
						
						
						
						switch (select1) {
						case 1:
							// datas[i].setName(null);
							// datas[i].setAge(0);
							// for(int j = datas.length; j > 1; j--) { // 배열의 마지막 인덱스부터 우리가 바꾸고 싶은 인덱스 전까지
							// 반복문을 돌린다.
							// datas[j] = datas[j-1]; // 인덱스i-1의 값을 인덱스 i로 이동
							// // 이동할 때마다 count 증가
							// }
//							datas[i] = datas[i + 1];
//							datas[i + 1] = datas[i + 2];
							

							index--;
							break;
						case 2:
							System.out.println("삭제가 취소되었습니다.");
							break;
						}

						break;
					}

				}

				break;
			case 6:

			}

		}

	}
}
