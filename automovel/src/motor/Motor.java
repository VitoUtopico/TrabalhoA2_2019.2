package motor;
import java.util.*;
public class Motor {
    private String marca, tipoCombustivel;
    private int rpm, rpmMaximo;
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setTipoCombustivel(String combustivel){
        tipoCombustivel = combustivel;
    }
    public void setRpm(int rpm){
        this.rpm = rpm;
    }
    public void setRpmMaximo(int rpmMaximo){
        this.rpmMaximo = rpmMaximo;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getTipoCombustivel(){
        return tipoCombustivel;
    }
    public int getRpm(){
        return rpm;
    }
    public int getRpmMaximo(){
        return rpmMaximo;
    }
    
    public Motor(){}
    public Motor(String marca, String combustivel, int rpm, int rpmMaximo){
        setMarca(marca);
        setTipoCombustivel(combustivel);
        setRpm(rpm);
        setRpmMaximo(rpmMaximo);
    }
    
    public void cadastrar(String marca, String combustivel, int rpm, int rpmMaximo){
        setMarca(marca);
        setTipoCombustivel(combustivel);
        setRpm(rpm);
        setRpmMaximo(rpmMaximo);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca do motor:");
        setMarca(sc.nextLine());
        System.out.println("Tipo do combustível:");
        setTipoCombustivel(sc.nextLine());
        System.out.println("Rotações por minuto:");
        setRpm(Integer.parseInt(sc.nextLine()));
        System.out.println("RPM máximo:");
        setRpmMaximo(Integer.parseInt(sc.nextLine()));
    }
    
    public void imprimir(){
        System.out.printf("Marca do motor: %s\n", getMarca());
        System.out.printf("Tipo do combustivel: %s\n", getTipoCombustivel());
        System.out.printf("Rotações por minuto: %d\n", getRpm());
        System.out.printf("RPM máximo: %d\n", getRpmMaximo());
    }    
}
