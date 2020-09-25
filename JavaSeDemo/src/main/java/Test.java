import java.util.Scanner;

public class Test {

    public static void main(String [] a){
        Scanner input=new Scanner(System.in);
        int select=1;
        int ps=0;//配送费
        //存储姓名
        String name[]={"胡图图" };
        String name1[]=new String[5];
        for(int w=0;w<name.length;w++){
            name1[w]=name[w];
        }
        //存储订单数量
        int number[]={2};
        int number1[]=new int[5];
        for(int w=0;w<number.length;w++){
            number1[w]=number[w];
        }
        //存储时间
        int  time[]={16};
        int time1[]=new int[5];
        for(int w=0;w<time.length;w++){
            time1[w]=time[w];
        }
        //存储地点
        String site[]={"翻斗大街"};
        String site1[]=new String[5];
        for(int w=0;w<site.length;w++){
            site1[w]=site[w];
        }
        while(select!=6&&select!=0){

            System.out.println("欢迎使用吃货联盟订餐系统");
            System.out.println("***********************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐单");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("***********************************");
            System.out.print("请选择");
            select=input.nextInt();
            switch(select){
                case 1:System.out.println("******我要订餐******");
                    int i=0;
                    System.out.print("请输入订餐人姓名");
                    for(;i<name1.length;i++){
                        name1[i]=input.next();
                        break;
                    }
                    System.out.println("本店有：");
                    System.out.println("1.红烧肉  ￥20/份");
                    System.out.println("2.鱼香肉丝  ￥25/份");
                    System.out.println("3.五常大米  ￥2/份");
                    System.out.print("请选择你的食物编号：");
                    int menu=input.nextInt();
                    System.out.print("订单数量：");
                    for(;i<number1.length;i++){
                        number1[i]=input.nextInt();
                        break;
                    }
                    System.out.print("请输入送餐时间（送餐时间是10点到20点整点送餐）");
                    for(;i<time1.length;i++){
                        time1[i]=input.nextInt();
                        break;
                    }
                    System.out.print("请输入你的送餐地址：");
                    for(;i<site1.length;i++){
                        site1[i]=input.next();
                        break;
                    }
                    for(;i<number1.length;i++){//继承
                        if(time1[i]>10&&time1[i]<20){
                            switch(menu){
                                case 1:System.out.println("下单成功！");
                                    System.out.println("您购买的商品是：红烧肉  "+number1[i]+"份");
                                    System.out.println("送餐时间是："+time1[i]);
                                    if(20*number1[i]>50){//判断配送费
                                        ps=0;
                                    }else{
                                        ps=6;
                                    }
                                    System.out.println("你的餐费是："+20*number1[i]+"元  "+"配送费是："+ps+"  合计："+((20*number1[i])+ps));
                                    break;
                                case 2:System.out.println("下单成功！");
                                    System.out.println("您购买的商品是：鱼香肉丝  "+number1[i]+"份");
                                    System.out.println("送餐时间是："+time1[i]);
                                    if(25*number1[i]>50){//判断配送费
                                        ps=0;
                                    }else{
                                        ps=6;
                                    }
                                    System.out.println("你的餐费是："+25*number1[i]+"元  "+"配送费是："+ps+"  合计："+((25*number1[i])+ps));
                                    break;
                                case 3:System.out.println("下单成功！");
                                    System.out.println("您购买的商品是：五常米饭  "+number1[i]+"份");
                                    System.out.println("送餐时间是："+time[i]);
                                    if(2*number1[i]>50){//判断配送费
                                        ps=0;
                                    }else{
                                        ps=6;
                                    }
                                    System.out.println("你的餐费是："+2*number1[i]+"元  "+"配送费是："+ps+"  合计："+((2*number1[i])+ps));

                            }//switch结束

                        }else if(!(select!=6&&select!=0)){
                            System.out.println("请输入10点到20点的整数！！！！！");
                            break;
                        }
                    }//for结束
                    System.out.println("你要继续吗");
                    select=input.nextInt();
                    if(select==0){
                        continue;
                    }
                    break;//我要订餐结束
                case 2:System.out.println("*****查看餐单*****");
                    System.out.println("序号\t\t"+"订餐人\t\t"+"送餐时间\t\t"+"送餐地址\t\t"+"订单状态");
                    for(int w=0;w<name1.length;w++){
                        if(!(name1[w]==null&&time1[w]==0&&site1[w]==null)){
                            System.out.println((w+1)+"\t\t"+name1[w]+"\t\t"+time1[w]+"\t\t"+site1[w]);
                        }else{
                            break;
                        }
                    }
            }//大switch结束
        }// 循环结束
    }
}
