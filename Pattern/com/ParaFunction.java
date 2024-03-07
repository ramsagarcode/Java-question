package Pattern.com;

public class ParaFunction {
public static void main(String[] args) {
	ParaFunction obj= new ParaFunction();
	int x=10;
	int y=12;
	int get_result=obj.add(x, y);
	System.out.println(get_result);
	
}
	
	public  int add(int a, int b) {
		int result=a+b;
		return result;
	}
}
