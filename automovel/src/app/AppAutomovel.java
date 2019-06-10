
package app;
import java.util.*;
import abstratas.*;
import automoveis.*;
import motor.Motor;

public class AppAutomovel {
    public static void main(String[] args) {
        
        Motor motor1 = new Motor("Cartepilar", "Deasel", 500, 8000);/*
        Carro carro1 = new Carro(motor1,"Geraldo", "Expolder", "LKT9986", 4, 500, 60);
        carro1.imprimir();
        carro1.acelerar(10);
        carro1.desacelerar(8);
        carro1.desconto();
        System.out.printf("R$ %.2f \n",carro1.getPreco());
        carro1.virarADireita();
        carro1.virarAEsquerda();
        carro1.frear();*/
        
        Carro carro2 = new Carro(motor1);
        carro2.entradaDados(motor1);
        carro2.imprimir();
        
        
    }
    
}
