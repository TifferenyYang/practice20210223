/**
 * @program: JavaBase
 * @Date: 2020/3/31 20:51
 * @Author: lin.yang
 * @Description:
 */
public class TestFibonacci {
	public static void main(String args[]) {
		System.out.println(f(40));
	}
	public static int f(int n) {
		if(n==1 || n==2){
			return 1;
		}
		else{
			return f(n-1)+f(n-2);
		}
	}
}
