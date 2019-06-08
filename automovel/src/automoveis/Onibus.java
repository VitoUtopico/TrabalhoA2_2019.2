package automoveis;
import motor.Motor;
public class Onibus extends Automovel{
    private String motorista;
    
    // SETTER:
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
    
    
}
