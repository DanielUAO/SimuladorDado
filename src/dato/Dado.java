
package dato;
import java.util.Random;

public class Dado {
    
  private int dado1;
  private int dado2;

    public Dado() {
    }
  

    public Dado(int dado1, int dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
    }
  public void Lanzamiento(){
  Random ranNum = new Random();
  
  dado1 = ranNum.nextInt(6) + 1;
  dado2 = ranNum.nextInt(6) + 1;
  
  }
    
}
