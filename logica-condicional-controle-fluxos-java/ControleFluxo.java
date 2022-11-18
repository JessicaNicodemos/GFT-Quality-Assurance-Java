public class ControleFluxo {
    
    public static void main (String[] args) {

       /* Tipos:
       Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução.
       Opçãos: if(se), switch(escolha) e operador ternário
       
       Decisão: if, if-else, if-else-if, if-eslse-if-else

       Boas práticas:
       - Switch é para valores exatos e if para expressões booleanas
       - Evitar usar o defeault do switch para "cases genéricos"
       - Evitar o efeito "fecha" dos if's
       - Evitar muitos if's aninhados
       - Usar a boa prática da aula 2 para diminuir o tamanho if
       */ 

       ifFlecha();
       ifSemFlecha();
       ifFerias();
       ifMenor();

       switchSemana();
       switchNumero();
       switchFerias();
    }

    /**
     * 
     */
    private static void ifFlecha() {

        int mes = 9;
        if (mes ==1){
            System.out.println("Janeiro");
            } else {
                if (mes ==2){
                 System.out.println("Fevereiro");
              } else {
                  if (mes ==3){
                 System.out.println("Março");
                     } else {
                         if (mes ==4){
                            System.out.println("Abril");
                                 } else {
                                      if (mes ==5){
                                        System.out.println("Maio");
                                          } else {
                                             if (mes ==6){
                                                 System.out.println("Junho");
                                                     } else {
                                                        if (mes ==7){
                                                             System.out.println("Julho");
                                                                } else {
                                                                     if (mes ==8){
                                                                          System.out.println("Agosto");
                                                                              else {
                                                                                 if (mes ==9){
                                                                                     System.out.println("Setembro");
                                                                                 }
                                                                              }
                                                                     }
                                                                    }
                                                     }
                                                    }
                                 }
                                }
                            }

  
  
    }

 private static Void ifSemFlecha() {
    int mes = 9;
    if (mes ==1){
    System.out.println("Janeiro");
    } else {
    if (mes ==2){
    System.out.println("Fevereiro");
    } else {
    if (mes ==3){
    System.out.println("Março");
    } else {
    if (mes ==4){
    System.out.println("Abril");
    } else {
    if (mes ==5){
    System.out.println("Maio");
    } else {
    if (mes ==6){
    System.out.println("Junho");
    } else {
    if (mes ==7){
    System.out.println("Julho");
    } else {
    if (mes ==8){
    System.out.println("Agosto");
    } else {
    if (mes ==9){
    System.out.println("Setembro");
    }
}
}
}
}
}
}
}
}
}
    
  private static void ifFerias() {

    String mes = "julho";
    if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
        System.out.println("Ferias");
    }
  }                                                   

  private static void ifMenor() {

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

private static void witchSemana() {

    String dia = "Terça";
    switch (dia){
        case "Segunda":
            System.out.println(2);
            break;
        case "Terça":
            System.out.println(3);
            break;   
        case "Quarta":
            System.out.println(4);
            break;
        case "Quinta":
            System.out.println(5);
            break;
        case "Sexta":
            System.out.println(6);
            break;
        case "Sábado":
            System.out.println(7);
            break;
        case "Domingo":
            System.out.println(1);
            break;
        default:
            System.out.println(1);
                System.out.println("Dia inválido");
    }

}

private static void switchNumero(){

    int numero =4;
    switch (numero){
        case 1:
        case 2:
        case 3:
            System.out.println("Certo");
            break;
        case 4:
             System.out.println("Errado");
             break;  
        case 5:
             System.out.println("Talvez");
             break;  
        default:
            System.out.println("Valor Indefinido");
            break; 

    }
}

private static void switchFerias(){

    String mes = "dezembro";
    switch (mes) {
        case "dezembro":
        case "julho":
        case "janeiro":
            System.out.println("Férias");
            break;
        default:
            System.out.println("Mês Indefinido");  
            break;
    }
}
}