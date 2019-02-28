package adaptador;

public class MotorElectrico {
    private boolean conectado;
    public MotorElectrico(){
        System.out.println("creando motor electrico");
        this.conectado=false;
    }
    
    public void conectar(){
        System.out.println("conectando motor electrico");
        this.conectado=true;
    }
    
    public void activar(){
        if(this.conectado){
            System.out.println("motor conectado, activando motor electrico");
        }else{
            System.out.println("no se puede activar el  motor, esta desconectado");
        }
    }
    public void moverMasRapido(){
        if(this.conectado){
            System.out.println("moviendo mas rapido, voltaje aumentando");
        }else{
            System.out.println("no se puede mover mas rapido el  motor, esta desconectado");
        }
    }
    public void detener(){
        if(this.conectado){
            System.out.println("deteniendo motor electrico");
        }else{
            System.out.println("no se puede detener el  motor, ya esta detenido");
        }
    }
    public void desconectar(){
        System.out.println("desconectando el motor");
        this.conectado=false;
    }
}
