package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

nameOfDay(4);

    }




    public static void nameOfDay(int num){

        if (num<1||num>7){
            System.out.println("Invalid");
            return;
        }
        String day=(num==1)?"Monday":(num==2)?"Thursday":(num==3)?"Thursday":(num==4)?"Wednesyday":(num==5)?"Friday"
                :(num==6)?"Saturday":"Sunday";
        System.out.println(day);
        }







}
