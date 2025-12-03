import java.util.Scanner;
public class percobaan2 {
    static int hitug_pangkat(int x , int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitug_pangkat(x, y - 1);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int bilangan, pangkat ;
         System.out.println("masukan bilangan yang  akan di input :");
            bilangan = sc.nextInt();
            System.out.println("masukan pangkat :");
            pangkat = sc.nextInt();
            int hasil = hitug_pangkat(bilangan, pangkat); 
    for (int i = 0; i < pangkat; i++) {
        System.out.print(bilangan + " x ");
    }   
    System.out.print("1");    
    System.out.println(" = " + hasil);
        System.out.println("hasil dari " + bilangan + " pangkat " + pangkat + " = " + hitug_pangkat(bilangan, pangkat));
    }
}