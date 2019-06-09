package automoveis;

import abstratas.InterfaceAutomoveis;
import java.util.Scanner;
import motor.Motor;

public abstract class Moto extends Automovel implements InterfaceAutomoveis{
    private int volumeBagageiro;
    
    public void setVolumeBagageiro(int bagageiro){
        volumeBagageiro = bagageiro;
    }
    public int getVolumeBagageiro(){
        return volumeBagageiro;
    }    
    
    // CONSTRUTORES:
    public Moto(){}
    public Moto(String marca){
        setMarca(marca);        
    }
    public Moto(int bagageiro){
       setVolumeBagageiro(bagageiro);
    }
    public Moto(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco, int bagageiro){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeBagageiro(bagageiro);        
    }
    public Moto(String proprietario, String marca,String placa, 
            int passageiros, double preco, int bagageiro){
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeBagageiro(bagageiro);        
    }
    public Moto(String marca,String placa, int passageiros, 
            double preco, int bagageiro){
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeBagageiro(bagageiro);        
    }
    public Moto(String placa, int passageiros, double preco, int bagageiro){
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeBagageiro(bagageiro);        
    }
    public Moto(Motor motor, String marca,String placa, 
            int passageiros, double preco, int bagageiro){
        setMotor(motor);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setVolumeBagageiro(bagageiro);        
    }
    public Moto(Motor motor, String proprietario, String marca,
            double preco, int bagageiro){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPreco(preco);
        setVolumeBagageiro(bagageiro);        
    }
    public Moto(Motor motor, String proprietario, String marca,
            String placa){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);      
    }
    
    // CADASTRAR:
    public void cadastrar(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco, int bagageiro){
        super.cadastrar(motor, proprietario, marca, placa, passageiros, preco);
        setVolumeBagageiro(bagageiro);
    }
    
    // ENTRADA DADOS:
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Volume do porta malas:");
        setVolumeBagageiro(Integer.parseInt(sc.nextLine()));
    }
    
    // IMPRIMIR:
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Volume do bagageiro: %d L\n", getVolumeBagageiro());
    }
    
    // METODOS ABSTRATOS:
    @Override
    public void acelerar(int acelera){
        super.motor.setRpm(super.motor.getRpm() + acelera * 200);
    }
    
    @Override
    public void desacelerar(int desacelera){
        super.motor.setRpm(super.motor.getRpm() - desacelera * 200);
    }
    
    @Override
    public void frear(){
        System.out.println("A moto está freando!");
    
    }

    @Override
    public void virarAEsquerda(){
        System.out.println("Moto virando a esquerda");
    }
    
    @Override
    public void virarADireita(){
        System.out.println("Moto virando a direita");
    }
    
    @Override
    public void desconto(int percentual){
        if (percentual < 5 || percentual > 70){
            throw new IllegalArgumentException("Desconto negado");
        }
        super.setPreco(super.getPreco() * (1 + percentual * super.getPreco() / 100));
    }
}
