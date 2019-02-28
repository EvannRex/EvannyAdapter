package adaptador;

public class MotorElectricoAdapter implements Motor {
    private MotorElectrico motorElectrico;
    
    public MotorElectricoAdapter(){
        System.out.println("creando motor electrico adapter");
        this.motorElectrico= new MotorElectrico();
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor electrico adapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando motor electrico adapter");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("apagando motor electrico adapter");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
    
}
