import java.net.Socket;
import java.util.Scanner;

//criando uma classe 
class Carro{ 


   //Criando atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor aqui (Método)
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    // get e set tanque (set = setar, colocar valor, guardar um valor) (get = retorno do valor)
    void setCor( String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //método do total para encher o tanque

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}

