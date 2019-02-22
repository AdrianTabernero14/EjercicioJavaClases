/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicioclases;

/**
 *
 * @author adria
 */
public class Persona {
    private String nombre="";
    private int edad=0;
    
    private char sexo='H';
    private double peso=0;
    private double altura=0;
private int resultado=0;
private Integer longitud = 9;
    private String dni;
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
       
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int calcularIMC(){
        double imc;
        int resultado=0;
        imc = peso/(Math.pow(altura,2));
        if (imc<20){
            resultado=-1;
        }
        else if(20<=imc && imc<=25){
            resultado=0;
        }
        else if(imc>25){
            resultado=1;
        }
        return resultado;
    }
    public Boolean esMayorDeEdad(){
        if(edad>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public void comprobarSexo(char sexo){
        if( sexo!='H' && sexo!='M'){
             sexo=this.sexo;
        }
    }
    
    public String generaDNI() {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String numeros = "0123456789";

        Integer numNumeros = (int) (Math.random() * (this.longitud - 9)) + 8;
        
        Integer numMayusculas = this.longitud - numNumeros ;

        this.dni = "";
        for (int i = 0; i < numNumeros; i++) {
            int pos = (int) (Math.random() * numeros.length());
            this.dni = this.dni + numeros.charAt(pos);
        }
        for (int i = 0; i < numMayusculas; i++) {
            int pos = (int) (Math.random() * mayusculas.length());
            this.dni = this.dni + mayusculas.charAt(pos);
        }

        

        

        
        return dni;
    }
    @Override
    public String toString(){
      return "El expediente de la persona "+nombre+" con el DNI "+dni+" es:"
              + "\n Sexo: "+sexo+""
              + "\n Edad: "+edad+" años"
              + "\n Peso: "+peso+" kg"
              + "\n Altura: "+altura+" m";
              
    }
}
