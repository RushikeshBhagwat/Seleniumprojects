import java.util.ArrayList;

public class practisejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practisejava po=new practisejava();
		po.getdata();
		
       String sty="Rushikesh";
       System.out.println(sty.isEmpty());
	}
	public void getdata() {
		ArrayList a=new ArrayList();
		a.add("Rahul");
		a.add("RahulS");
		System.out.println(a.get(1));
	}
   
}
