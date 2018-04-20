import java.util.Random;

/**
 * Created by 李雷 on 2018/4/10.
 */
public class SaiZi {

    private int last=0;


    public static void main(String[] args) {
//        SaiZi saiZi = new SaiZi();
//        saiZi
//        int a = getNumber();
//
//        if(checkNumber(a,b,false)) return;
//
//        int c = a+b;
//        int d = getNumber();
//        if(checkNumber(c,d,true))


    }

    public static int getNumber(){

        int a = new Random().nextInt(6)+1;

        int b = new Random().nextInt(6)+1;

        return a+b;
    }

//    public static boolean checkNumber(int c){
//
//        if(c==2||c==3||c==12){
//            System.out.println("you rolled "+a+"+"+b +"="+c);
//            System.out.println("you lose");
//            return true;
//        }else if(c==7||c==11){
//            System.out.println("you rolled "+a+"+"+b +"="+c);
//            System.out.println("you win");
//            return true;
//        }
//    }
}
