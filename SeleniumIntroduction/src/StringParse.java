
public class StringParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getdata());

	}
	public static String getdata() {
		String st="Welcome to 'my' academy";
		String[] sy=st.split("'");
		return sy[1];
	}

}
