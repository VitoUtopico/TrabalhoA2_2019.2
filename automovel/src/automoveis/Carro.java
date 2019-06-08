package automoveis;

import java.util.Scanner;
import motor.Motor;

public class Carro extends Automovel{
    private int volumeMala;
    
    // SETTER:
    public void setVolumeMala(int mala){
        volumeMala = mala;
    }
    // GETTER:
    public int getVolumeMala(){
        return volumeMala;
    }
    
    // CONSTRUTORES:
    public Carro(){}
    public Carro(String marca){
        setMarca(marca);        
    }
    public Carro(int mala){
       setVolumeMala(mala);
    }
    public Carro(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco, int mala){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeMala(mala);        
    }
    public Carro(String proprietario, String marca,String placa, 
            int passageiros, double preco, int mala){
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeMala(mala);        
    }
    public Carro(String marca,String placa, int passageiros, 
            double preco, int mala){
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeMala(mala);        
    }
    public Carro(String placa, int passageiros, double preco, int mala){
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeMala(mala);        
    }
    public Carro(Motor motor, String marca,String placa, 
            int passageiros, double preco, int mala){
        setMotor(motor);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeMala(mala);        
    }
    public Carro(Motor motor, String proprietario, String marca,
            double preco, int mala){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPreco(preco);
        setVolumeMala(mala);        
    }
    public Carro(Motor motor, String proprietario, String marca,
            String placa){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);      
    }
    
    // CADASTRAR:
    public void cadastrar(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco, int volMala){
        super.cadastrar(motor, proprietario, marca, placa, passageiros, preco);
        setVolumeMala(volMala);
    }
    
    // ENTRADA DADOS:
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Marca do automóvel:");
        setMarca(sc.nextLine());       
    }
    
    // IMPRIMIR:
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Volume do porta malas: %d L\n", getVolumeMala());
    }
}
