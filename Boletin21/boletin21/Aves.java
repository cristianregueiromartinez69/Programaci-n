
package boletin21;


public abstract class Aves implements IPoderVoar {
    
    
   private String golor;

    public Aves(String golor) {
        this.golor = golor;
    }

    public String getGolor() {
        return golor;
    }

    public void setGolor(String golor) {
        this.golor = golor;
    }

    @Override
    public abstract void volar();
   
    
   
   
    
    
    
    
    
    
    
    
    
    
    
    
}
