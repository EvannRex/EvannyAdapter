package adaptador;

public class MotorGasolina implements Motor {
    public MotorGasolina(){
        System.out.println("creando motor a gasolina...");
    }

    @Override
    public void encender() {
        System.out.println("encendiendo motor a gasolina");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando motor a gasolina");
    }

    @Override
    public void apagar() {
        System.out.println("apagando motor a gasolina");
    }
     
}
