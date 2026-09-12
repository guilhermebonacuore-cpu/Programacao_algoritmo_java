import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner InUser = new Scanner(System.in);
System.out.println("""
    Escolha Seu Meio de Transporte:
    1 - onibus urbano
    2 - metrô
    3 - trem intermunicipal
    4 - onibus rodoviário
         """);
         int Bilhete = InUser.nextInt();
         switch (Bilhete){
            case 1:{
                System.out.printf("");
            }
                break;
         
            default:
                break;
         }
        
    }
}
