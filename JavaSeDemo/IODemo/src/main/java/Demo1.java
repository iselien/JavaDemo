import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		File file = new File("E:\\aa");
		io.yovelas.io.demo.Demo1 de = new io.yovelas.io.demo.Demo1();

//		if(de.delFile(file))file.mkdirs();
//		de.findFile(file,0);
	}

	// find all file
	public void findFile(File file, int index) {
		for (int i = 0; i < index; i++) {
			System.out.print("--");
		}
		if (!file.exists())
			return;
		System.out.print(file.getName() + "\n");

		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				findFile(f, index + 1);
			}
		}

	}

	// delete all file
	public boolean delFile(File file) {
		for (;file.listFiles() != null;) {
			privateDelFile(file);	
		}
		return true;
	}

	public void privateDelFile(File file) {
		if (!file.exists())
			return;
		if (file.delete())
			System.err.println(file + "���ɹ�ɾ��");
		else {
			for (File f : file.listFiles()) {
				privateDelFile(f);
			}
		}
	}
}
