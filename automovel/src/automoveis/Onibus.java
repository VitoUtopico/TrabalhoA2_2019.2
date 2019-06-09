package automoveis;
import abstratas.InterfaceAutomoveis;
import java.util.Scanner;
import motor.Motor;
public abstract class Onibus extends Automovel implements InterfaceAutomoveis{
    private String motorista;
    
    // SETTER:
    @Override
    public void setNumeroPassageiros(int passageiros){
        if(passageiros > 40){
            throw new IllegalArgumentException("O onibus comporta no máximo 40 passageiro");
        }
        super.setNumeroPassageiros(passageiros);
    }
    public void setMotorista(String motorista){
        this.motorista = motorista;
    }
    // GETTER:
    public String getMotorista(){
        return motorista;
    }
    
    // CONSTRUTORES:
    public Onibus(){}
    public Onibus(String marca){
        setMarca(marca);        
    }
    public Onibus(String motorista, String marca){
       setMotorista(motorista);
       setMarca(marca);
    }
    public Onibus(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco, String motorista){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setMotorista(motorista);        
    }
    public Onibus(String proprietario, String marca,String placa, 
            int passageiros, double preco, String motorista){
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setMotorista(motorista);        
    }
    public Onibus(String marca,String placa, int passageiros, 
            double preco, String motorista){
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setMotorista(motorista);        
    }
    public Onibus(String placa, int passageiros, double preco, String motorista){
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setMotorista(motorista);        
    }
    public Onibus(Motor motor, String marca,String placa, 
            int passageiros, double preco, String motorista){
        setMotor(motor);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
        setMotorista(motorista);        
    }
    public Onibus(Motor motor, String proprietario, String marca,
            double preco, String motorista){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPreco(preco);
        setMotorista(motorista);        
    }
    public Onibus(Motor motor, String proprietario, String marca,
            String placa){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);      
    }

    // CADASTRAR:
    public void cadastrar(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco, String motorista){
        super.cadastrar(motor, proprietario, marca, placa, passageiros, preco);
        setMotorista(motorista);
    }
    
    // ENTRADA DADOS:
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Nome do motorista:");
        setMotorista(sc.nextLine());
    }
    
    // IMPRIMIR:
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Nome do motorista: %s\n", getMotorista());
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
        System.out.println("O ônibus está freando!");
    
    }

    @Override
    public void virarAEsquerda(){
        System.out.println("Ônibus virando a esquerda");
    }
    
    @Override
    public void virarADireita(){
        System.out.println("Ônibus virando a direita");
    }
    
    @Override
    public void desconto(int percentual){
        if (percentual < 5 || percentual > 70){
            throw new IllegalArgumentException("Desconto negado");
        }
        super.setPreco(super.getPreco() * (1 + percentual * super.getPreco() / 100));
    }    
}
