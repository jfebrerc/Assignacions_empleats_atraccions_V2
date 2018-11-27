/** Classe principal de persones */

package Classes;

public class Persona {
    /* Atributs */
    private String nom;
    private String cognom1;
    private String cognom2;
    private int id;
    private String passwd;
    private String DNI;
    private static int nextId;

    /** CONSTRUCTOR */
    public Persona(String nomc, String cognom1c, String dnic) {
        nom = nomc;
        cognom1= cognom1c;
        DNI=dnic;
        id = nextId;
        nextId++;
    }


    /** SETTERS */
    public void setNom(String n) {
        nom = n;
    }

    public void setCognom1(String c1) {
        cognom1 = c1;
    }

    public void setCognom2(String c2) {
        cognom2 = c2;
    }

    public void setPasswd(String pwd) {
        passwd = pwd;
    }

    public void setDNI(String dnix){
        DNI = dnix;
    }

    public void setId(int n){
        id=n;
    }

    /** GETTERS */
    public String getNom() { return nom; }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public int getId() {
        return id;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getDNI(){
        return DNI;
    }

    /** METODES */
    @Override
    public String toString() {
        String imprimir = String.format("|%-20d|", getNom()); /*getNom() + " " + getCognom1() + " " + getDNI();*/
        return imprimir;
    }
}
//AFEGIR ID
//CLASSE ARRAYS
//MAXIM ARRAY
//COMPROVAR SI ES EMPLEAT