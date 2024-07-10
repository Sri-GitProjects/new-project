import java.util.*;
import java .util.Random;
class livemoney{
   private static final int inital=100;
   private int arr[];
   private int size;
    livemoney(){
        size =1;
        arr=new int[inital];
    }
    public int add(int val){
       arr[size]=val;
       size++;
       return size;
    }
    public void display(){
        int number;
        Random random=new Random();
        number=random.nextInt(987);
        for(int i=1;i<size;i++){
            System.out.println(arr[i]+"="+number);
        }
    }
    public void deleteAtNum(int num){
         for(int i=num+1;i<size;i++){
            arr[i-1] =arr[i];
            size--;

         }
    }

}
public class dynamicarraydemo{
    public static void main(String[]args){
        int val,num,pos;
        livemoney list=new livemoney();
        Scanner m=new Scanner(System.in);
        while(true){
        System.out.println ("\n************ wellcome bitcon platform  $$$$$$$$$$$$$$$$$$$\n");
        System.out.println ("1. buying\n");
        System.out.println ("2. selling\n");
        System.out.println ("3. chick\n");
        System.out.println ("4. exit\n");
        int choice=m.nextInt();
        switch(choice) {
            case 1:System.out.println("enter you qunite");
            val=m.nextInt();
            list.add(val);
            System.out.println("buing successful");
            break;
            case 2:System.out.println("enter you qunite number");
             num=m.nextInt();
             if(num<1){
                System.out.println("invalid numbers");
                break;
             }
             list.deleteAtNum(num);
             System.out.println("selling successful");
             int number;
             Random random=new Random();
             number=random.nextInt(987);
             System.out.println(number);
             break;
             case 3:System.out.println("enter the posnum");
             pos=m.nextInt();
             if(pos<1){
                System.out.println("invalid position");
                break;
             }
             list.display();
             break;
             case 4:System.exit(0);
             default:System.out.println("invalid choice:");
        }
        }
    }
}
