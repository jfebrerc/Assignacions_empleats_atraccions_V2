/**
 * Classe filla de Persona
 */
package Classes;

public class Assignacio { //Comentaris al marge per als atributs
    private int id;
    private Empleat empleat;
    private Atraccio atraccio;
    private String data;
    private static int nextId;

    public Assignacio(Empleat e, Atraccio a, String d) {
        empleat = e;
        atraccio = a;
        data = d;
        id = nextId;
        nextId++;
    }

    /** GETTERS */
    public Empleat getEmpleat() {
        return empleat;
    }

    public Atraccio getAtraccio() {
        return atraccio;
    }

    public String getData(){
        return data;
    }

    /** SETTERS */
    public void setEmpleat(Empleat e){
        empleat = e;
    }

    public void setAtraccio(Atraccio a){
        atraccio = a;
    }

    public void setData(String d){
        data = d;
    }

    /** METODES */

    @Override
    public String toString() {
        String imprimir = String.format("%s %20s %20s %70s %70s", id, empleat.getNom(), empleat.getDNI(), atraccio.getNom(), data);
        return imprimir;
    }


}