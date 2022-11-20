public class EstruturaBasicaOORodarApp {
    
    public static void main(String[] args) { //Entrada para alicação começar

        //Construtor padrão, sem parametros
        Carro carro1 = new Carro(); //Criação objeto (carro1) na classe Carro

            carro1.setCor("Azul");
            carro1.setModelo("BMW série 3");
            carro1.setCapacidadeTanque(59);

            System.out.println(carro1.getModelo());
            System.out.println(carro1.getCor());
            System.out.println(carro1.getCapacidadeTanque());
            System.out.println( carro1.totalValorTanque ( 6.39 ) ) ;

            //Construtor com valores, sobrecarga do construtor
            Carro  carro2 = new  Carro ( "Cinza" , "Mercedes-Benz Classe C " , 66 );

            System.out.println(carro1.getModelo());
            System.out.println(carro1.getCor());
            System.out.println(carro1.getCapacidadeTanque());
            System.out.println( carro2.totalValorTanque ( 6.46 ) ) ;
            
        }
    }

