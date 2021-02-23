/**
 * @program: JavaBase
 * @Date: 2020/3/30 21:59
 * @Author: lin.yang
 * @Description:
 */
public class Test101_200zhishu {
	public static void main(String args[]) {
		for (int i = 101; i <= 200; i++) {
			boolean f = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					f = false;
					break;
				}
			}
			if(!f){continue;
			}
			System.out.println(i);
		}
	}

}
