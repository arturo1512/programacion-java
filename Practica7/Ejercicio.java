import java.io.*;
import java.util.*;
public class Ejercicio{
private int edad;
private int precio;
private String leer;
private String medicamento;
private int day;
public void  setEdad(int edad_P){
       edad=edad_P;
}
public void  setPrecio(int precio_P){
       precio=precio_P;
}

public void setMedicamento(String Medicamento_P){
       medicamento=Medicamento_P;


}

public static void main(String[]args){

     Apoyo ids=new Apoyo();
     ids.setId(230);
     Apoyo total1=new Apoyo();
     total1.setTotales(25);

    Ejercicio aprende=new Ejercicio();
    aprende.setEdad(23);

    Ejercicio aprende2=new Ejercicio();
    aprende2.setPrecio(567);
    Ejercicio aprende3=new Ejercicio();
    aprende3.setMedicamento("Paracetamol");
    Apoyo fecha1=new Apoyo();
    fecha1.setFecha("MArzo");
    Apoyo leer1=new Apoyo();
    leer1.setLee("lee");
    leer1.setLee("lee");


    Apoyo sumar=new Apoyo();
    sumar.Suma();
    System.out.println(""+sumar.resul+leer1);
      Saldo saldo1=new Saldo(23213);
      

double deposito;
   deposito=leer1.setLee(deposito);
saldo1.abonar(deposito);



    System.out.println("Halo el dia es:"+leer1.totales);
  

    System.out.println("LA Fecha y es dia son:"+fecha1.fecha+"/"+aprende.edad);
   System.out.println("EL total de medicamento que tengo es:"+total1.totales);

System.out.println("el ID numerico es:"+ids.numerico);

System.out.println("El medicamento es:"+aprende3.medicamento);
System.out.println("El precio es:"+aprende2.precio);

    System.out.println("la edad es:"+aprende.edad);

}






}