public class Saldo{
private double saldo;

public Saldo(double saldo_P){

	if(saldo_P>0)
		saldo=saldo_P;
}
public void abonar(double monto){

saldo=saldo+monto;

}
public double obtenerSaldo()
{

return saldo;

}









}