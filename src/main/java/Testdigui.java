/**
 * @program: JavaBase
 * @Date: 2020/3/31 20:40
 * @Author: lin.yang
 * @Description:
 */
public class Testdigui {
	public static void main(String args[]) {
		System.out.println(method(5));
	}

	public static int method(int n) {
		if(n==1)
			return 1;
		else
			return n*method(n-1);

	}
}
