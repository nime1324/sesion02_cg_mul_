
package sistemascoordenadas2d;
/*bajo el sistema de coordenadas cartesianas referir un 
punto con sus retspectrivas propiedades y valores .
Dchos valores deben asignarse como una entradfa por teclado de parte del usuario
*/
public class SistemasCoordenadas2D {

    public static void main(String[] args) {
        Cartesiana2D punto = new Cartesiana2D();
        Polar punto2 = new Polar();
       
        // agregar las instrucciones necesarias para que se presente 
        // en la pantalla la solicitud de los datos y posteriormente
        // el usuario los ingrese desde el teclado 
        punto.setX(4);
        
    }
    
}
class Cartesiana2D{
private int x, y;

public void setX(int x){
this.x = x;}
public void setY(int y){
this.y = y;}
}

class Polar{
    private int radio;
    private float angulo;

    public int getRadio() {
        return radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
    
    

}
