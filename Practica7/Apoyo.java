import java.io.*;
import java.util.*;
public class Apoyo{
public int numerico;
public double totales;
public String fecha;
public String lee;
public double sum;
public double resul;
public void setId(int numerico_p){
numerico=numerico_p;


}
public void setTotales(int totales_p){
  totales=totales_p;

}
public void setFecha(String fecha_fecha)
{
fecha=fecha_fecha;


}
public void setLee(String lee_p)
  
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  try {
         System.out.println("variable:");

         lee= br.readLine();
         totales=Integer.valueOf(lee).doubleValue();

        }
        catch (IOException e){
         System.out.println(e);              
         



   }
}

public double Suma()
{
 this.resul= this.totales+ this.totales;

 return resul;

}



}