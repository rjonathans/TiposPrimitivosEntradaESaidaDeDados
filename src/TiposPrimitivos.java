import java.io.PrintStream;
import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {

        /* Definição de variável e objeto:
         * Objeto.: De maneira geral, Objeto é uma classe sendo estanciada!!
         * De maneira mais Conceitual, um objeto é algo distinguível que
         * contém atributos (ou propriedades) e possui um comportamento.
         * Cada objeto tem uma identidade e é distinguível de outro
         * mesmo que seus atributos sejam idênticos.
         *
         * Uma variável referenciará sempre a um tipo primitivo de Java
         * ou a qualquer outro objeto criado em nosso programa.
         */

        //Tipos Primitivos
        int idade = 3;
        float sal = 1825.54f;
        char letra = 'G';
        boolean casado = false;

        //typecast
        int idadeTypecast = (int) 3;
        float salTypecast = (float) 1825.54;
        char letraTypecast = (char) 'G';
        boolean casadoTypecast = (boolean) false;

        //Wrapper Class
        System.out.println("Digita a sua idade aqui ");
        Scanner teclado = new Scanner(System.in);
        Integer idadeWrapper = teclado.nextInt(); // aqui atribuímos o valor ao objeto
        System.out.println(" o Valor de 'idadeWrapper' foi atribuido \n" +
                "construido que recebeu a informaçao que vc digitou no teclado \n" +
                "o comando 'new Scanner(System.in)' recebeu o que vc digitou e o proximo comando \n" +
                "atribuiu valor ao objeto 'idadeWrapper' e agora vc pode ler aqui que é" + idadeWrapper);

        Float salWrapper = new Float(sal);
        Character letraWrapper = new Character('G');
        Boolean casadoWrapper = new Boolean(false);

        /*Entrada de Dados usando o SCANNER (classe java.util.scanner)
         *tambem usaremos o PRINT, PRINTNL,PRINTF, FORMAT para saída de dados
         * lembrando que OUT significa saida e System é sistema, que pode ser qualquer Sistema.
         */
        System.out.println("Digite o nome do Aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do Aluno");
        Float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        System.out.println("A nota de " + nome + " é " + nota);

    }

}