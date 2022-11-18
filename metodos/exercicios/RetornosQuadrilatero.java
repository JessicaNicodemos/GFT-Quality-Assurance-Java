/*Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. 
Agora faça os métodos retornarem valores. */
public class RetornosQuadrilatero {
    
        public static double area (double lado){
    
            return lado * lado;
        }
        public static double area (double lado1, double lado2){
    
            return lado1 * lado2;
        }
        public static double area (double baseMaior, double baseMenor, double altura){
    
            return ((baseMaior+baseMenor)*altura)/2;
        }

        public static void main(String[] args) {
            System.out.println("Exercício retornos" );

            double areaQuadrado = RetornosQuadrilatero.area(3);
            System.out.println("Área do quadrado: " + areaQuadrado);

            double areaRtangulo = RetornosQuadrilatero.area(5d, 5d);
            System.out.println("Área do retangulo: " + areaRtangulo);

            double areaTrapezio = RetornosQuadrilatero.area(7, 8, 9);
            System.out.println("Área do trapezio: " + areaTrapezio);
            
        }
}
