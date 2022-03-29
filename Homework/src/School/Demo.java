package School;

public class Demo {
    public static void main(String[] args) {
//      创建一个姓名为“zhangsan”的研究生
        Graduate graduate=new Graduate();
        graduate.setName("zhangsan");
        graduate.setAge(22);
        graduate.setSex("男");
        graduate.setFee(8000);
        graduate.setPay(7000);
        System.out.println(graduate);
//      统计他的年收入和学费，如果收入减去学费不足2000 元，则输出“provide a loan”(需要贷款)信息
        int sum= graduate.getPay()- graduate.getFee();
        System.out.println("收入："+sum);
        if (sum<2000){

            System.out.println("provide a loan");
        }

    }
}
