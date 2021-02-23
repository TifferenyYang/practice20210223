/**
 * @program: JavaBase
 * @Date: 2020/3/30 21:50
 * @Author: lin.yang
 * @Description:
 */
public class Test3_5 {
 public static void main(String args[]) {
  int num = 0, i = 1;
  while(i <= 100) {
   if (i % 3 == 0) {
    System.out.println(i);
    num++;
   }
   if (num == 5) {
    break;
   }
   i++;
  }
 }
}
