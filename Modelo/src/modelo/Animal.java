package modelo;



public abstract class Animal {

    public int patas;
    
    
    public Animal(){
        
    }
    public Animal ( int patas){
        this.patas=patas;
    }
    
    /**
     *
     */
    public abstract void comer( );

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
