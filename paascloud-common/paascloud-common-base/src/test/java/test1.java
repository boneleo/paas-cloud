public class test1
{
    public static void main(String[] args)
    {
        int rondom = rondom();
        System.out.println("第1次随机出了"+rondom );
       if (rondom == 2 || rondom == 3 ||rondom == 12 )
           System.out.println(rondom +"你输了");
       else if (rondom == 7 || rondom == 11 )
            System.out.println(rondom +"你赢了");
       else
           {
               int z = rondom;
               System.out.println("z的值="+z);
               for (int i = 2; i < 100; i++){
                   int sss = rondom();
                   System.out.println("第"+i+"次随机除了"+sss);
                   if (sss == z || sss == 7) {
                       if (sss == z)
                           System.out.println("你赢了");
                       else
                           System.out.println("你输了");
                       break;
                   }
                   z =sss;
                   System.out.println("z的值="+z);
                }
            }
    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
    public static int rondom(){
        int n = (int)(1+Math.random()*6);
        int m = (int)(1+Math.random()*6);
        System.out.println(n+","+m);
        return sum(n,m);
    }

}