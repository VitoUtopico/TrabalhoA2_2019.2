package automoveis;

import motor.Motor;

public class Moto extends Automovel{
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
    
    
}
