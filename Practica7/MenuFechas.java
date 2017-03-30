import java.io.*;
import java.util.*;
public class MenuFechas{
  /*
   public boolean EsBisiesto(year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }     
    /*  
   public void setDia(int day) {
        day = day;
    }
    public void setMes(int mes) {
        mes = mes;
    }
    public void setAnio(int year) {
        year = year;
    }
    public int getDia() {
        return day;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return year;
    }



  public boolean FechaCorrecta() {
        boolean dayC, mesC, yearC;
        yearC = year >= 1582;
        mesC= mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (EsBisiesto()) {
                    dayC = day >= 1 && day <= 29;
                } else {
                    dayC = day >= 1 && day <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayC = day >= 1 && day <= 30;
                break;
            default:
                dayC = day >= 1 && day <= 31;
        }
        return dayC && mesC && yearC;
    }



*/
     


public static void main (String args[]){
   String leeropcion;
   int day;
   int mes;
   int year;
   int fechafinal;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   IntroduceFecha fechaprueba=new IntroduceFecha();
   fechaprueba.Mostrar();



        



try {
         System.out.println("Dame dia:");

         leeropcion= br.readLine();
          day=Integer.valueOf(leeropcion).intValue();

        }
        catch (IOException e){
         System.out.println(e);              
         return;



   }
   try {
         System.out.println("Dame mes:");

         leeropcion= br.readLine();
          mes=Integer.valueOf(leeropcion).intValue();

        }
        catch (IOException e){
         System.out.println(e);              
         return;



   }
   try {
         System.out.println("Dame año:");

         leeropcion= br.readLine();
          year=Integer.valueOf(leeropcion).intValue();

        }
        catch (IOException e){
         System.out.println(e);              
         return;

   
     
   boolean dayc, yearC, mesC;
  

        yearC = year >= 1582;
        mesC= mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    dayc = day >= 1 && day <= 29;
                } else {
                    dayc = day >= 1 && day <= 28;
                }
                break;
           
            case 11:
                dayc = day >= 1 && day <= 30;
                break;
            default:
                dayc = day >= 1 && day <= 31;
        }
        //return (dayC && mesC && yearC);
        System.out.println("tu fecha es:"+day+"/"+mes+"/"+year);
         }

      }
  }
  







  



