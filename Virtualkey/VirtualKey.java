import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKey {
	public static void main(String[] args) {
		File file = new File("C:\\Senthamizhselvi phase 1");
		file.mkdirs();// create new directory
		System.out.println("Welcome to Virtual Key Repositry");
		String[] arr = { "1.For Retrieving the file names in an ascending order", "2.For Business level Operatoins:",
				"3.Option to close the application" };
		int[] arr1 = { 1, 2, 3 };
		int len = arr1.length;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println("Enter the choice");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		for (int j = 1; j < len; j++) {
			if (choice == j) {
				switch (choice) {
				case 1:
					File a[] = file.listFiles();
					Arrays.sort(a);

					for (int i = 0; i < a.length; i++)
						System.out.println(a[i]);
					break;
				case 2:
					Boolean temp = true;
					while (temp) {
						System.out.println("1.Add file");
						System.out.println("2.Search user specified file");
						System.out.println("3.Delete user specified file");
						System.out.println("4.Back to main menu");
						int choice1 = scan.nextInt();
						switch (choice1) {
						case 1:
							File f = new File("C:\\Senthamizhselvi phase 1");
							System.out.println("Enter the file name");
							String name = scan.next();
							if (new File(file, name).exists()) {
								System.out.println("File already exist");
							} else {
								File folder1 = new File(file, name);
								folder1.mkdir();
								if (new File(file, name).exists()) {
									System.out.println("file added successfully");
								}
							}
							break;
						case 2:
							System.out.println("Enter a keyword to search");
							String search = scan.next();

							File arr2[] = file.listFiles();
							for (int i = 0; i < arr2.length; i++) {
								if (arr2[i].getName().startsWith(search)) {
									System.out.println(arr2[i]);
								} else {
									System.out.println("No file found");
								}
							}
							break;
						case 3:
							System.out.println("Enter a file name");
							String name1 = scan.next();
							boolean file2 = new File(file, name1).exists();
							System.out.println(file2);
							if (file2 == true) {
								File file3 = new File(file, name1);
								file3.delete();
								System.out.println("File successfully deleted");
							} else {
								System.out.println("file does not exist");
							}

							break;

						case 4:
							temp = false;
							break;
						default:
							System.out.println("Invalid input....Try again!!");
							break;
						}
					}
				case 3:
					System.out.println("closing application");
				}
			}
		}
	}
}