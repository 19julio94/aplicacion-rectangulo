package aplicacionrectangulo;
/**
 *
 * @author jpatriciodasilva
 */
public class Rectangulo {
    
    private float base;
    private float altura;
    //constructores
    public Rectangulo(){
        
    }
    public Rectangulo(float ba,float al){
        base=ba;
        altura= al;
        
        }
   //metodos de acceso
    public void setBase(float ba){
        base=ba;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float altura){
        
        this.altura = altura; 
       
    }
    public float getAltura(){   
        return altura;
        
    } 
          
    
}
