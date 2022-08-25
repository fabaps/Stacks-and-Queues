import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.io.*;

public class SAT {
    public static void main(String[] args)throws Exception{

      BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

      ConcurrentLinkedQueue<Integer> colaNormal = new ConcurrentLinkedQueue<Integer>();
      ConcurrentLinkedQueue<Integer> colaExc = new ConcurrentLinkedQueue<Integer>();

      int correlativo = 0;

      System.out.println("BIENVENIDO AL SIMULADOR COLA SAT");


      Random r = new Random();

      while(true){
        System.out.print("Ingresa Enter para continuar:");
        String enter = tec.readLine();
    
        int opcion = r.nextInt(3) + 1;
        int agente = r.nextInt(4) + 1;
        int normalExc = r.nextInt(3) +1;

        if (opcion == 1){
          colaNormal.add(correlativo++);
          System.out.printf("\nSe agrego a la cola normal a %d" , correlativo - 1);
          System.out.println();
          System.out.println("Normal: " + colaNormal);
          System.out.println("Exclusiva: " + colaExc);
          System.out.println("AGENTE#1: atendiendo a:");
          System.out.println("AGENTE#2: atendiendo a:");
          System.out.println("AGENTE#3: atendiendo a:");
          System.out.println("AGENTE#4 atendiendo a:");

        } else if (opcion == 2){
          colaExc.add(correlativo++);
          System.out.printf("\nSe agrego a la cola exclusiva a %d" , correlativo - 1);
          System.out.println();
          System.out.println("Normal: " + colaNormal);
          System.out.println("Exclusiva: " + colaExc);
          System.out.println("AGENTE#1: atendiendo a:");
          System.out.println("AGENTE#2: atendiendo a:");
          System.out.println("AGENTE#3: atendiendo a:");
          System.out.println("AGENTE#4 atendiendo a:");

        } else if (opcion == 3){
          if((colaExc.size() == 0) && (colaNormal.size() == 0)){
            System.out.println("No hay agentes disponibles para atender o clientes que atender");
          } else {
            if (normalExc == 1){
              
              if(colaNormal.peek() != null){
                int clienteAtendido = colaNormal.poll();
                System.out.printf("\n Listo para atender a %d", clienteAtendido);
                System.out.println();
                System.out.println("Normal: " + colaNormal);
                System.out.println("Exclusiva: " + colaExc);
                if(agente == 1){
                  System.out.println("AGENTE#1: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if(agente == 2){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if (agente == 3){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if (agente == 4){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: " + clienteAtendido);
                }
              } else {
                System.out.println("NO HAY CLIENTES COLA NORMAL");
              }
            } else if (normalExc == 2){
              if(colaExc.peek() != null){
                int clienteAtendido = colaExc.poll();
                System.out.printf("\n Listo para atender a %d", clienteAtendido);
                System.out.println();
                System.out.println("Normal: " + colaNormal);
                System.out.println("Exclusiva: " + colaExc);
                if(agente == 1){
                  System.out.println("AGENTE#1: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if(agente == 2){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if (agente == 3){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if (agente == 4){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: " + clienteAtendido);
                }
              } else {
                System.out.println("NO HAY CLIENTES COLA EXCLUSIVA");
              }
            } else if (normalExc == 3){
              if(colaExc.peek() != null){
                int clienteAtendido = colaExc.poll();
                System.out.printf("\n Listo para atender a %d", clienteAtendido);
                System.out.println();
                System.out.println("Normal: " + colaNormal);
                System.out.println("Exclusiva: " + colaExc);
                if(agente == 1){
                  System.out.println("AGENTE#1: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if(agente == 2){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if (agente == 3){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: " + clienteAtendido);
                  System.out.println("AGENTE#4 atendiendo a: ");
                } else if (agente == 4){
                  System.out.println("AGENTE#1: atendiendo a: ");
                  System.out.println("AGENTE#2: atendiendo a: ");
                  System.out.println("AGENTE#3: atendiendo a: ");
                  System.out.println("AGENTE#4 atendiendo a: " + clienteAtendido);
                }
              } else {
                System.out.println("NO HAY CLIENTES COLA EXCLUSIVA");
              }
            }
          }
        }

      }

  }

}