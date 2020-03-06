package ListPackage;
import java.util.ArrayList;
import java.util.*;
public class ListApplication
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(99);
		numbers.add(101);
		numbers.add(0);
		numbers.add(1);
		numbers.add(1112);
		numbers.add(4);
		numbers.add(2);
		numbers.add(99999);
		numbers.add(0);
		int flag=0;
		while(flag==0) {
		System.out.println("1.fetching\n2.add\n3.delete\n4.printing\n5.exit\nenter your choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			int position;
			System.out.println("Enter the position : ");
			position=sc.nextInt();
			System.out.println("fetched element is: "+fetch(numbers,position));
			break;
		case 2:
			System.out.println("ENter the element to be added:");
			int element=sc.nextInt();
			System.out.println("Enter the position at which you want to add:");
			int pos=sc.nextInt();
			add_element(numbers,element,pos);
			break;
		case 3:
			System.out.println("Enter the position of element that you want to delete:");
			int index=sc.nextInt();
			System.out.println("Deleted element is :"+delete_element(numbers,index));
			break;
		case 4:
			System.out.println("The items of the list are:\n");
			display(numbers);
			break;
		case 5:
			flag=1;
			break;
		default :System.out.println("PLease select a valid option");
		}
		}
	}
	
	private static void display(ArrayList<Integer> numbers) {
		for(int i=0;i<numbers.size();i++) {
			System.out.print(numbers.get(i)+" ");
		}
	}

	private static Integer delete_element(ArrayList<Integer> numbers, int position) {
		// TODO Auto-generated method stub
		return(numbers.remove(position));
	}

	private static void add_element(ArrayList<Integer> numbers, int element,int pos) {
		// TODO Auto-generated method stub
		numbers.add(pos,element);
	}

	public static int fetch(ArrayList<Integer> numbers,int position)
	{
		return numbers.get(position);
	}
	
}