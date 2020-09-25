import java.util.Scanner;

public class MainView {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// new一个业务逻辑层的对象，用于调用业务逻辑层的方法

		int select;
		do {
			System.out.println();
			System.out.println("word_manager");
			System.out.println("1.查看所有单词\n2.根据单词查看意思");
			System.out.println("3.添加单个单词\n4.批量添加单词");
			System.out.println("5.根据名字删除单词\n6.查看未记的单词");
			System.out.println("0.退出系统");
			System.out.print("请输入你要选择的编号:");
			select = input.nextInt();
			System.out.println();
			switch (select) {
			case 0:
				System.out.println("退出成功");
				break;
			case 1:
				
				break;
			case 2:
			
				break;
			case 3:

				break;
			case 4:
			
				break;
			case 5:
			
				break;
			case 6:
			
				break;
			default:
				break;
			}
		} while (select != 0);
	}
}
