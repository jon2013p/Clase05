import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double tllamada,ptotal,pinicial,cdia,chor,impd,imph;
    Scanner s=new Scanner(System.in);
    System.out.println("Que día de la semana se realizó la llamada? (1-7)");
    cdia= s.nextDouble();
    System.out.println("En que horario se realizó la llamada ? (1=matutino,2=vespertino) ");
    chor= s.nextDouble();   
    System.out.println("Cuántos minutos duró la llamada? ");
    tllamada= s.nextDouble();     
    if(tllamada>0 && tllamada<5){
      pinicial=tllamada;
  }
  else if (tllamada>5 && tllamada<8){
      pinicial=((tllamada-4)*0.80)+5;
  }
  else if (tllamada>8 && tllamada<10){
      pinicial=((tllamada-7)*0.70)+5+2.4;
  }
  else if (tllamada>10){
      pinicial=((tllamada-9)*0.50)+5+2.4+2.1;
  }        

  if (cdia=7){
      impd=pinicial*0.03;
  }
  else {
      impd=0;
  }

  if (chor=1){
      imph=pinicial*0.15;
  }
  else{
      imph=pinicial*0.10;
  }

  ptotal=pinicial+impd+imph;
  System.out.println("El valor de la factura es: "+ptotal);

}