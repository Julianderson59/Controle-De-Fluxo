import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parametroUm;
        int parametroDois;

        System.out.println("Informe o primeiro parâmetro: ");
        parametroUm = scanner.nextInt();
        System.out.println("Informe o segundo parâmetro: ");
        parametroDois = scanner.nextInt();

        try{

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosExcepcion e) {
            System.out.println("O primeiro parâmetro é maior que o segundo");

        }

    }
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExcepcion{
        int resultado;

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosExcepcion();
        }else{

                resultado = parametroDois - parametroUm;

                for(int x=0; x<=resultado; x++){
                    System.out.println("Imprimindo o número " + x);
                }
            }
        }
    static class ParametrosInvalidosExcepcion extends Exception {
        public ParametrosInvalidosExcepcion() {
            super("Parâmetros inválidos fornecidos");
        }
    }
}

