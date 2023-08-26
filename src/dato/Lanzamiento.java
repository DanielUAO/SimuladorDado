
package dato;
import modelo.Base;

public class Lanzamiento extends Base {
    
  private int dado1;
  private int dado2;

    public Lanzamiento() {
    }
  

    public Lanzamiento(int dado1, int dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    public int getDado1() {
        return dado1;
    }

    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }
    

    @Override
    public String toString() {
        return  dado1 + ", " + dado2;
    }
    
    @Override
    public Base copy() {
        return new Lanzamiento(dado1,dado2);
    }
    
    
}
