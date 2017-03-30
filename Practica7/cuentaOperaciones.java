import java.io.*;
 public class cuentaOperaciones{
    public int saldoinicial;
    public int saldofinal;
    public int deposito;
    public String saldo;
 public void cuentaOperaciones(int s_p,int sf_P,int d_P){
	s_p=saldoinicial;
	sf_P=saldofinal;
	d_P=deposito;
}


  public void setSaldo(cuentaOperaciones c_P){
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.println("Dame El saldo inicial a ingresar:");         

         saldo= br.readLine();
         c_P.saldoinicial=Integer.valueOf(saldo).intValue();

        }
        catch (IOException e){
         System.out.println(e);  
        }
	



  }

  public void getDeposito(cuentaOperaciones c_P){	
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try{
      System.out.println("Cuanto vas a Depositar a la cuenta:");
      saldo=br.readLine();
      c_P.deposito=Integer.valueOf(saldo).intValue();
    }
    catch (IOException e){
    	System.out.println(e);
    }


  }
 public void getSaldofinal(cuentaOperaciones c_P){
   c_P.setSaldo(this);
   c_P.getDeposito(this);
   this.saldofinal=this.deposito+this.saldoinicial;
   System.out.println("Tu disponible es de:"+this.saldofinal);




 }



}