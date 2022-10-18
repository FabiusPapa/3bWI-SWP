import java.util.Random;


public class Switch {


    public static void main(String[] args) {



        Random ran = new Random();
        int x = 5 + ran.nextInt(10 - 5 + 1);

        switch (x){
            case 5:System.out.println("five");
            break;
            case 6:System.out.println("six");
            break;
            case 7: System.out.println("seven");
            break;
            case 8:System.out.println("eight");
            break;
            case 9:System.out.println("nine");
            break;
            case 10:System.out.println("ten");
            break;
        }

    }
}

