
package boletin5;


public class Consumo {
    
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    //constructores
    public Consumo(){}
    public Consumo(float km,float litros, float vMed, float pGas){
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    //devolvertempoempregado en realizarunahviaxe
    public void getTempo(){
        System.out.println("el tiempo de viaje ha sido: "+(km/vMed)+" horas");
    }
    //devolver consumo medio l/km
    public void consumoMedio(){
        System.out.println("el consumo medio es:"+((100*litros)/km)+" cada 100 litros");
    }
    //devolver consumo medio en euros
    public void consumoEuros(){
        System.out.println("Gastas "+(((100*litros)/km)*pGas)+" euros cada 100 litros");
    }
    //metodos de acceso
    
    public float getKm(){
        return km;
    }
    public float getVMed(){
        return vMed;
    }
    public void setKms(float km){
        this.km=km;
    }
    public void setLitros(float litros){
        this.litros=litros;
    }
    public void setvMed(float vMed){
        this.vMed=vMed;
    }
    public void setPGas(float pGas){
        this.pGas=pGas;
    }
    
}
