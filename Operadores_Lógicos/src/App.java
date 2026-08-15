public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores Lógicos");

      double nota = 6;
      int frequência = 75;
      boolean result;



/*
Operador "and &&" as duas condições devem ser verdadeiras
Operador "Or ||" PELO MENOS UMA CONDIÇÃO deve ser verdadeira
Operador " Not !" nega saída
\N pula uma linha
*/
System.out.println("operador e" );
 result = (nota >=6 && frequência >=75);
 System.out.print(result);

System.out.println("\n operador ou" );
 result = (nota <=4 || frequência >=75);
 System.out.println(result);

 System.out.println("\n operador not" );
 System.out.println(result);
System.out.println(!result);
System.out.println(!(!result));
    



}
}
