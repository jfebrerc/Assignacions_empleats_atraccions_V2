/** Classe principal de persones */

package Classes;

public class Persona {
    /* Atributs */
    private static int contador = 0;
    private static int MAXIM_PERSONES = 1000;
    private String nom;
    private String cognom1;
    private String cognom2;
    private int id;
    private String passwd;
    private String DNI;

    /** CONSTRUCTOR */
    public Persona() {
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

    public void setContador(int n){
        contador = contador + n;
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

    public int getIdentificador() {
        return id;
    }

    public String getPasswd() {
        return passwd;
    }

    public static int getContador(){
        return contador;
    }

    public static int getMaximPersones(){
        return MAXIM_PERSONES;
    }

    public String getDNI(){
        return DNI;
    }

    /** METODES */
    public static void augmentarPersona(){
        contador = contador +1;
    }

    public static void eliminarPersona(){
        contador = contador -1;
    }

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