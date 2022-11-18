public class OperadoresLogicos {

     public static void main(String[] args) {
        
       /* Conjunção: &&  só é verdadeira quando ambos os operandos ou expressões são verdade.
         Disjunção: || operação que só é falsa quando ambos os operandos ou expressões são falsos.
        Disjunção exclusiva: ^operação que só é verdade quando ambos operandos ou expressões são opostos.
        Negação: ! operação que inverte o valor logico de um operando ou expressão.

        */
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2" + (b1 && b2));
        System.out.println("b1 && b3" + (b1 && b3));

        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b2 || b4" + (b2 || b4));

        System.out.println("b1 ^ b3" + (b1 ^ b3));
        System.out.println("b4 ^ b1" + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 = i2) < (f2 - f1)) && true " + (((i1 + i2) < ((f2 - f1)) && true)));
        System.out.println("((i1 > i2) || (f2 < f1) " + ((i1 > i2) || ((f2 < f1))));

        double salarioMensal = 11893.58d;
        double mediaSalarial = 10500d;

        int quantidadeDependente = 4;
        int mediaDepentende = 2;

        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependente >= mediaDepentende));

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependente >= mediaDepentende;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);



    }
}
