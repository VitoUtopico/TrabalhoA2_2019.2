package automoveis;
import java.util.Scanner;
import motor.Motor;

public class Automovel {
    public Motor motor;
    private String proprietario, marca, placa;
    private int numeroPassageiros;
    private double preco;
    private final int TEMPOMAXIMOUSO = 30, IDADEMINIMAMOTORISTA = 18;
    
    // SETTERS:
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setNumeroPassageiros(int passageiros){
        numeroPassageiros = passageiros;
    }
    public void setPreco(double preco){
        if(preco <= 0){
            throw new IllegalArgumentException("Insira um valor positivo!!!!\n\n");
        }
        this.preco = preco;
    }    
    
    // GETTERS:    
    public Motor getMotor(){
        return motor;
    }    
    public String getProprietario(){
        return proprietario;
    }
    public String getMarca(){
        return marca;
    }
    public String getPlaca(){
        return placa;
    }
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    public double getPreco(){
        return preco;
    }
    public int getTEMPOMAXIMOUSO(){
        return TEMPOMAXIMOUSO;
    }
    public int getIDADEMINIMAMOTORISTA(){
        return IDADEMINIMAMOTORISTA;
    }
    
    // CONSTRUTORES:
    public Automovel(){}
    public Automovel(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);        
    }
    
    public Automovel(Motor motor){
        setMotor(motor);    
    }
    public Automovel(String proprietario){
        setMotor(motor);
    }
    public Automovel(Motor motor, String marca){
        setMotor(motor);
        setMarca(marca);        
    }
    public Automovel(Motor motor,String marca,double preco){
        setMotor(motor);
        setMarca(marca);
        setPreco(preco);        
    }
    public Automovel(String proprietario, String marca,
            String placa, int passageiros, double preco){
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);        
    }
    public Automovel(String marca,String placa, int passageiros, 
            double preco){
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);        
    }
    
    // CADASTRAR:
    public void cadastrar(Motor motor, String proprietario, String marca,
            String placa, int passageiros, double preco){
        setMotor(motor);
        setProprietario(proprietario);
        setMarca(marca);
        setPlaca(placa);
        setNumeroPassageiros(passageiros);
        setPreco(preco);
    }
    
    // ENTRADA DADOS:
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados do motor:");
        motor.entradaDados();
        System.out.println("Dados do automóvel:");
        System.out.println("Marca do automóvel:");
        setMarca(sc.nextLine());
        System.out.println("Nome do proprietário:");
        setProprietario(sc.nextLine());
        System.out.println("Placa:");
        setPlaca(sc.nextLine());
        System.out.println("Número de passageiros:");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Preço:");
        setPreco(Double.parseDouble(sc.nextLine()));
    }
    public void entradaDados(Motor motor){        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados do automóvel:");
        System.out.println("Marca do automóvel:");
        setMarca(sc.nextLine());
        System.out.println("Nome do proprietário:");
        setProprietario(sc.nextLine());
        System.out.println("Placa:");
        setPlaca(sc.nextLine());
        System.out.println("Número de passageiros:");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Preço:");
        setPreco(Double.parseDouble(sc.nextLine()));        
    }
    
    // IMPRIMIR:
    public void imprimir(){
        System.out.printf("Tempo máximo de uso: %d \n", getTEMPOMAXIMOUSO());
        System.out.printf("Idade mínima para conduzir: %d anos\n", getIDADEMINIMAMOTORISTA());
        System.out.println("Dados do motor:");
        motor.imprimir();
        System.out.println("Dados gerais do automóvel:");
        System.out.printf("Marca: %s\n", getMarca());
        System.out.printf("Nome do proprietário: %s\n", getProprietario());
        System.out.printf("Placa: %s\n", getPlaca());
        System.out.printf("Número de passageiros: %d\n", getNumeroPassageiros());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
    }
    
}
