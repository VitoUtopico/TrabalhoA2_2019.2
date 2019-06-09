package automoveis;

import abstratas.InterfaceAutomoveis;
import java.util.Scanner;
import motor.Motor;

public abstract class Carro extends Automovel implements InterfaceAutomoveis{
    private int volumeMala;
    
    // SETTER:
    @Override
    public void setNumeroPassageiros(int passageiros){
        if(passageiros > 4){
            throw new IllegalArgumentException("O carro comporta no máximo 4 passageiros");
        }
        super.setNumeroPassageiros(passageiros);
    }
    public void setVolumeMala(int mala){
        if(mala <= 0){
            throw new IllegalArgumentException("Insira um valor positivo.");
        }
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
        System.out.println("Volume do porta malas:");
        setVolumeMala(Integer.parseInt(sc.nextLine()));
    }
    
    // IMPRIMIR:
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Volume do porta malas: %d L\n", getVolumeMala());
    }
    
    // METODOS ABSTRATOS:
    @Override
    public void acelerar(int acelera){
        super.motor.setRpm(super.motor.getRpm() + acelera * 100);
    }
    
    @Override
    public void desacelerar(int desacelera){
        super.motor.setRpm(super.motor.getRpm() - desacelera * 100);
    }
    
    @Override
    public void frear(){
        System.out.println("O carro está freando!");
    
    }

    @Override
    public void virarAEsquerda(){
        System.out.println("Carro virando a esquerda");
    }
    
    @Override
    public void virarADireita(){
        System.out.println("Carro virando a direita");
    }
    
    @Override
    public void desconto(){
        super.setPreco(super.getPreco() * (1 + 10 * super.getPreco() / 100));
    }    
}
