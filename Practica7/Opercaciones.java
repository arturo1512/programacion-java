import java.io.*;
public class Opercaciones{
public String leer;
public int a;
public int b;
public int resultado;

public void Opercaciones(){


}

public void setLee(Opercaciones op)
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  try {
         System.out.println("Dame el primer numero");

         leer= br.readLine();
         op.a=Integer.valueOf(leer).intValue();

        }
        catch (IOException e){
         System.out.println(e);              
         



   }
try {
         System.out.println("Dame el segundo numero");

         leer= br.readLine();
         op.b=Integer.valueOf(leer).intValue();

        }
        catch (IOException e){
         System.out.println(e);              
         



   }
}

    public void  getSuma(Opercaciones op){
     op.setLee(this);
     this.resultado=this.a+this.b;
     System.out.println("el resultado es:"+this.resultado);

    }
    public void getResta(Opercaciones op){
     op.setLee(this);
     this.resultado= this.a - this.b;
     System.out.println("el resultado es:"+this.resultado);
     }


}