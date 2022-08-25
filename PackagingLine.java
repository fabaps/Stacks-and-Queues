import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.io.*;


public class PackagingLine{
  public static void main(String[] args) throws Exception{
    
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

    ConcurrentLinkedQueue<Playera> sinEstampar = new ConcurrentLinkedQueue<>();
    Stack<Playera> estampadas = new Stack<>();
    Stack<Playera> dobladas = new Stack<>();
    Stack<Playera> empacadas = new Stack<>();
    ConcurrentLinkedQueue<Playera> rojas = new ConcurrentLinkedQueue<>();
    ConcurrentLinkedQueue<Playera> azules = new ConcurrentLinkedQueue<>();
    ConcurrentLinkedQueue<Playera> blancas = new ConcurrentLinkedQueue<>();

    System.out.println("BIENVENIDO A LA LINEA DE PRODUCCIÓN");
    System.out.println();
    System.out.println();

    Random r = new Random();
    int correlativo = 7;
    int contadorRojas = 0;
    int contadorAzules = 0;
    int contadorBlancas = 0;
      
    Playera p1 = new Playera(1,"roja");
    Playera p2 = new Playera(2,"azul");
    Playera p3 = new Playera(3,"blanca");
    Playera p4 = new Playera(4,"roja");
    Playera p5 = new Playera(5,"azul");
    Playera p6 = new Playera(6,"blanca");

    sinEstampar.add(p1);
    sinEstampar.add(p2);
    sinEstampar.add(p3);
    sinEstampar.add(p4);
    sinEstampar.add(p5);
    sinEstampar.add(p6);

    

    while(true){
      int opcion = r.nextInt(5) + 1;
      int camisaAleatoria = r.nextInt(3) + 1;
      System.out.print("Presione Enter para continuar");
      String enter = tec.readLine();

      switch(opcion){
        case 1: //Ingresar nueva playera a la cola sinEstampar
          System.out.println();
          System.out.println("Se ingreso camisa sin estampar");
          if (camisaAleatoria == 1){
            Playera roja = new Playera(correlativo++,"roja");
            sinEstampar.add(roja);
          } else if (camisaAleatoria == 2){
           Playera azul = new Playera(correlativo++,"azul");
           sinEstampar.add(azul);
          } else if (camisaAleatoria == 3){
           Playera blanca = new Playera(correlativo++,"blanca");
           sinEstampar.add(blanca);
          }
          break;

        case 2: //Estampar Playera
          if (sinEstampar.element() == null){
            System.out.println();
            System.out.println("Intentamos estampar una playera pero no hay playeras disponibles");
          } else {
            System.out.println();
            System.out.println("Se doblo playera");
            estampadas.push(sinEstampar.poll());
          }
          break;
        case 3: //doblar playera
          if (estampadas.empty() == true){
            System.out.println();
            System.out.println("Intentamos doblar una playera pero no hay estampadas");
          } else {
            System.out.println();
            System.out.println("Se doblo playera");
            dobladas.push(estampadas.pop());
          }
          break;
        case 4: //empacar
          if (dobladas.empty() == true){
            System.out.println();
            System.out.println("Intentamos empacar una playera pero no hay dobladas");
          } else {
            System.out.println();
            System.out.println("Se empaco playera");
            empacadas.push(dobladas.pop());
          }
          break;

        case 5:
          if (empacadas.empty() == true){
            System.out.println();
            System.out.println("Intentamos clasificar una playera pero no hay empacadas");
          } else {
            System.out.println();
            System.out.println("Se clasifico playera con respecto a su color");
            String s = "roja";
            String s1 = "azul";
            String s2 = "blanca";
            boolean b = empacadas.peek().color.contains(s);
            boolean b1 = empacadas.peek().color.contains(s1);
            boolean b2 = empacadas.peek().color.contains(s2);
            if(b == true){
              rojas.add(empacadas.pop());
              contadorRojas++;
            } else if(b1 == true){
              azules.add(empacadas.pop());
              contadorAzules++;
            } else if(b2 == true){
              blancas.add(empacadas.pop());
              contadorBlancas++;
            }
          }
          break;

      }

      System.out.println();
      System.out.println("Iniciales (Sin Estampar): " + sinEstampar);
      System.out.println("Estampadas: " + estampadas);
      System.out.println("Dobladas: " + dobladas);
      System.out.println("Empacadas: " + empacadas);
      System.out.println("Rojas Clasificadas: " + rojas);
      System.out.println("Azules Clasificadas: " + azules);
      System.out.println("Blancas Clasificadas: " + blancas);
      System.out.println();
      System.out.printf("Rojas %d, Azules %d, Blancas %d\n", contadorRojas, contadorAzules, contadorBlancas);
      

      
      
      
      


      
    }
  

  }
}

class Playera{

  int numero;
  String color;

  public Playera(int numero, String color){
    this.numero = numero;
    this.color = color;
  }

  @Override
  public String toString(){
    return String.format("%d-%s", this.numero, this.color);
  }

}