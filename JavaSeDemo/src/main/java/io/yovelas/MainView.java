import java.util.Scanner;

public class MainView {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// newһ��ҵ���߼���Ķ������ڵ���ҵ���߼���ķ���

		int select;
		do {
			System.out.println();
			System.out.println("word_manager");
			System.out.println("1.�鿴���е���\n2.���ݵ��ʲ鿴��˼");
			System.out.println("3.��ӵ�������\n4.������ӵ���");
			System.out.println("5.��������ɾ������\n6.�鿴δ�ǵĵ���");
			System.out.println("0.�˳�ϵͳ");
			System.out.print("��������Ҫѡ��ı��:");
			select = input.nextInt();
			System.out.println();
			switch (select) {
			case 0:
				System.out.println("�˳��ɹ�");
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
