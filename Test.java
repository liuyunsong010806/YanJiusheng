package Jiekou;
import java.util.Scanner;    //主要功能是简化文本扫描、获取控制台输入
public class Test {
    public static void main(String args[]) {
        YanjiuSheng a = null;
        Scanner in = new Scanner(System.in);
        YanjiuSheng lys = new YanjiuSheng(1,"刘云嵩", "男", 19);
        YanjiuSheng zhangsan = new YanjiuSheng(2,"张三", "男", 18);
        YanjiuSheng zhaosi = new YanjiuSheng(3,"赵四", "女", 20);
        System.out.println("学生信息: " + lys);
        System.out.println("学生信息: " + zhangsan);
        System.out.println("学生信息: " + zhaosi);
        System.out.println("请输入1,2,3进行学生选择: ");
        try {
            while (true) {
                int x = in.nextInt();
                if (x == 1) {
                    a = lys;
                } else if (x == 2) {
                    a = zhangsan;
                } else if (x == 3) {
                    a = zhaosi;
                } else {
                    System.out.println("无该学生");
                }
                if (x != 1 && x != 2 && x != 3) {
                    break;
                }
                System.out.println("\n请输入您本学年的学期数:");
                YanjiuSheng.x = in.nextInt();
                System.out.println("\n请输入本学期任职的月数:");
                YanjiuSheng.y = in.nextInt();
                System.out.println("\n学生信息: " + a);
                System.out.print("本学年学费：" + a.f(YanjiuSheng.x));
                System.out.println("\n年收入（月收入x月数：" + YanjiuSheng.xinshui + "x" + YanjiuSheng.y + "):" + a.m(YanjiuSheng.y));
                System.out.println("\t净收入(总收入-学费)：  " + a.Jingshouru());
                double money;
                double omoney;
                if (a.Jingshouru() <= 36000) {
                    money = a.Jingshouru() * 0.97;
                    omoney = a.Jingshouru() * 0.03;
                    System.out.println("\t\t\t   ➖纳税：   " + omoney);
                    System.out.print(" 税后收入（税率：0.03）：  " + money);
                } else if (a.Jingshouru() <= 144000 && a.Jingshouru() >= 36000) {
                    money = a.Jingshouru() * 0.90;
                    omoney = a.Jingshouru() * 0.10;
                    System.out.println("\t\t\t   ➖纳税：   " + omoney);
                    System.out.println(" 税后收入（税率：0.10）：  " + money);
                } else if (a.Jingshouru() <= 300000 && a.Jingshouru() >= 144000) {
                    money = a.Jingshouru() * 0.80;
                    omoney = a.Jingshouru() * 0.20;
                    System.out.println("\t\t\t   ➖纳税：   " + omoney);
                    System.out.println(" 税后收入（税率：0.20）：  " + money);
                } else {
                    System.out.println("你不需要勤工俭学的机会！");
                }
            }
            }
        catch(Exception e){
        System.out.println("输入数字！");}

    }
}
