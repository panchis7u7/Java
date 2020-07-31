package conjuntos;
public class Conjunto {
    private int elementos;
    private String id;

    public Conjunto(){
        elementos = 0;
    }
    
    public Conjunto(String id){
        this.id = id;
        elementos = 0;
        /*byte ne = (byte) (Math.random() * 31 + 1);
        for (byte i = 0; i < ne; i++){
            byte ele = (byte) (Math.random() * 31 + 1);
            this.encenderBit(ele);
        }*/
    }
    
    public void encenderBit(byte ele){
        elementos = (elementos | (0x80000000>>>ele));
    }
    
    public void apagarBit(byte ele){
        elementos = (elementos ^ (0x80000000>>>ele));
    }
    
    public String verElementos(){
        String regresa = "\t[";
        for(byte i = 0; i < 32; i++){
            if((elementos & (0x80000000>>>i))!=0){
                regresa = regresa + i + ", ";
            }
        }
        regresa = regresa + "]" + id;
        return regresa;
    }
    
    public Conjunto interseccion(Conjunto dos){
        Conjunto resultante = new Conjunto();
        resultante.id = this.id + " ∩ " + dos.id;
        resultante.elementos = this.elementos & dos.elementos;
        return resultante;
    }
    
    public Conjunto union(Conjunto dos){
        Conjunto resultante = new Conjunto();
        resultante.id = this.id + " ∪ " + dos.id;
        resultante.elementos = this.elementos | dos.elementos;
        return resultante;
    }
    
    public Conjunto diferencia(Conjunto dos){
        Conjunto resultante = new Conjunto();
        resultante.id = this.id + " - " + dos.id;
        resultante.elementos = this.elementos | dos.elementos;
        resultante.elementos = (resultante.elementos) - (this.elementos & dos.elementos);
        resultante.elementos = resultante.elementos & this.elementos;
        return resultante;
    }
    
    public String comparacion(Conjunto dos){
        String resultante = "";
        if (this.elementos == dos.elementos){
            resultante = "Son iguales";
        }
        else{
            resultante = "No son iguales";
        }
        return resultante;
    }
    
    public String subConjunto(Conjunto dos){
        String resultante = "";
        Conjunto result = new Conjunto();
        result.id = this.id + " Intersección " + dos.id;
        result.elementos = this.elementos & dos.elementos;
        if (this.elementos == result.elementos && dos.elementos != result.elementos){
        //if (result != dos.elementos && this.elementos == result){
            resultante = this.id + " es SubConjunto de " + dos.id;
        }
        else{
            resultante = this.id + " no es SubConjunto de " + dos.id;
        }
        return resultante;
    }
    
    public String toString(){
        return verBits() + this.verElementos();
    }
    
    public String verBits(){
        String regresa = "\n01234567890123456789012345678901\n";
        for(byte i = 0; i < 32; i++){
            if((elementos & (0x80000000>>>i))!=0){
                regresa = regresa + "1";
            }
            else regresa = regresa + ("0");
        }
        regresa = regresa + "]";
        return regresa;
    }
}
