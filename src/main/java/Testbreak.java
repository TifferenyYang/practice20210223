/**
 * @program: JavaBase
 * @Date: 2020/3/24 7:25
 * @Author: lin.yang
 * @Description:
 */
public class Testbreak {
 public static void main(String args[]) {
  int num = 0 ;
  for (int i = 1; i <= 100; i++ ) {
   if(i % 5 == 0) {
    System.out.println(i);
    num++;

   }
   if (num == 5) break;
  }
 }
}
