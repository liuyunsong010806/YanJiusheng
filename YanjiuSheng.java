package Jiekou;

public class YanjiuSheng implements Xuesheng,Jiaoshi {
    int number;
    String name;
    String sex;
    int age;
    static int x;
    static int y;

    YanjiuSheng(){};
    YanjiuSheng(int number,String name,String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String toString(){
        return "成员序号："+number+"成员姓名："+ name + "\t性别：" + sex + "\t年龄：" + age ;
    }

    public int f(int x){
        this.x=x;
        int sum=0;
        sum=xuefei*x;
        return sum;
    }

    public int m(int x){
        this.y=y;
        int sum=0;
        sum=xinshui*y;
        return sum;
    }

    int Jingshouru(){
        int m=m(y)-f(x);
        return m;
    }
}
