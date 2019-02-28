package adaptador;

public class MotorDiesel implements Motor {
    public MotorDiesel(){
        System.out.println("creando motor a diesel...");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor a diesel");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando motor a diesel");
    }

    @Override
    public void apagar() {
        System.out.println("apagando motor a diesel");
    }
    
}
