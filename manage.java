import java.util.Scanner;
class manage {
	static int count = 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*Welcome to contact manage system*");
		System.out.println(":::Main Menu:::");
		System.out.println(
				"1.Add a new Contact\n2.List all contacts\n3.Edit a contact\n4.Delete a contact\n");
		boolean flag = true;
		String str[][] = new String[50][50];
		while (flag) {
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					add(str);
					break;
				case 2:
					list(str);
					break;
				case 3:
					edit(str);
					System.out.println("Successfully Updated the contact");
					break;
				case 4:
					delete(str);
					System.out.println("Deleted the Contact Successfully");
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}
	}

	static void add(String str[][]) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id:");
		String id = sc.next();
		str[count][temp++] = id.toString();
		System.out.print("Name:");
		String name = sc.next();
		str[count][temp++] = name;
		System.out.print("Phone number:");
		String number = sc.next();
		str[count][temp++] = number;
		System.out.print("Address:");
		String address = sc.next();
		str[count][temp++] = address;
		System.out.print("E-mail Address:");
		String email = sc.next();
		str[count][temp++] = email;
		count++;
		System.out.println("Successfully added the contact");
		System.out.println("To exit this write space in name!!!!");
	}

	static void list( String str[][]) {
		System.out.println("Enter the id of the contact:");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		boolean flag = true;
		String temp[] = {"Name: ","Contact: ","Address: ","Email: "};
		int temp1 = 0;
		for (int i = 0; i < count; i++) {
			if (id.equals(str[i][0])) {
				for (int j = 1; j < 5; j++) {
					System.out.print(temp[temp1++]);
					System.out.println(str[i][j]);
				}
				flag = false;
			}
		}
		if (flag == true)
		{
			System.out.println("Record does not found!!!!");
		}
	}
	static void edit(String str[][])
	{
		System.out.println("Enter the id of the contact:");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		for(int i=0;i<count;i++)
		{
			if(id.equals(str[i][0]))
			{
				int temp = 1;
				System.out.print("Name:");
				String name = sc.next();
				str[i][temp++] = name;
				System.out.print("Phone number:");
				String number = sc.next();
				str[i][temp++] = number;
				System.out.print("Address:");
				String address = sc.next();
				str[i][temp++] = address;
				System.out.print("E-mail Address:");
				String email = sc.next();
				str[i][temp++] = email;
			}
		}

	}
	static void delete(String str[][])
	{
		System.out.println("Enter the id of the contact:");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		for(int i=0;i<count;i++)
		{
			if (id.equals(str[i][0]))
			{
				for (int j = i;j < count - 1; j++)
				{
					str[j][0] = str[j+1][0];
					str[j][1] = str[j+1][1];
					str[j][2] = str[j+1][2];
					str[j][3] = str[j+1][3];
					str[j][4] = str[j+1][4];
				}
				count--;
				break;
			}
		}

	}
}