import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hava;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Durumunu Giriniz: ");
        hava = inp.nextInt();

        if(hava <5) {
            System.out.println("Kayak yapabilirsiniz. ");

        }
        else if (hava>=5 && hava<10) {
            System.out.print("Sinemaya gidebilirsiniz. ");
        }
        else if(hava>=10 && hava<=15){
            System.out.print("Sinemaya ve pikniğe gidebilirsiniz. ");
        }
        else if (hava>15 && hava<=25){
            System.out.print("Pikniğe gidebilirsiniz. ");
        }
        else {
            System.out.print("Yüzmeye gidebilirsiniz. ");
        }
    }
}