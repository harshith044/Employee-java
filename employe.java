package employeee;

public class Employe {
	public String name,address;
	public int year;
	public Employe(String n,int y,String add) {
		name=n;
		address=add;
		year=y
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public String getAddress() {
		return address;
	}
}
class Empl{
	public static void main(String[] args) {
		Employe e1=new Employe("Robert",1994,"63C-WallsStreet");
		System.out.println("Name\tYear\tAdress");
		System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getAddress());
		
	}
}
