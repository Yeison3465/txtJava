import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
        Preguntas pregunta = new Preguntas();
        Scanner input = new Scanner(System.in);
        Scanner output = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double Corte = 0.0;
        double Corte1 = 0.0;
        double value = 0.0;
        double value2 = 0.0;
        double value3 = 0.0;
        double value4 = 0.0;
        int num ;
        int i = 0;
        while(true){
            System.out.println("+++ Bievendido+++ \n a la auto evaluacion \n ingrese su nombre: ");
            String name = input.nextLine();
            while(true){
                System.out.println("----------------");
                System.out.println("Ingrese su codigo de estudiante: ");
                try{
                    num = output.nextInt();
                    if(num > 0){
                        System.out.println("ok ");
                        break;
                    }
                    System.out.println("error");
                }catch(Exception e){
                    System.out.println("Error... ");
                    output.nextLine();
                }
            }
            // primera pregunta 
            while(true){
                System.out.println("debe pasar el primer corte 1. si o 2. no: ");
                try{
                    int num1 = output.nextInt();
                    if(num1 <= 0 || num1 > 2){
                        System.out.println("error");
                        System.out.println("debe pasar el primer corte 1. si o 2. no: ");
                        num1 = output.nextInt();
                    }else{
                        if(num1 == 1){
                            Corte = 5.0;
                            break;
                        }else if(num1 == 2){
                            Corte = 3.0;
                            break;
                        }
                    }
                }catch(Exception r){
                    System.out.println("Error... ");
                    output.nextLine();
                }
            }
            // segunda pregunta 
            while(true){
                System.out.println("crees que has aprendido algo 1. si o 2. no: ");
                try{
                    int num2 = output.nextInt();
                    if(num2 <= 0 || num2 > 2){
                        System.out.println("error");
                        System.out.println("crees que has aprendido algo 1. si o 2. no: ");
                        num2 = output.nextInt();
                    }else{
                        if(num2 == 1){
                            Corte1 = 5.0;
                            break;
                        }else if(num2 == 2){
                            Corte1 = 3.0;
                            break;
                        }
                    }
                }catch(Exception r){
                    System.out.println("Error... ");
                    output.nextLine();
                }
            }
            // tercera pregunta 
            while(true){
                System.out.println("Del 1.0 al 5.0 en cuanto calificas tu nivel el conocimiento: ");
                try{
                    value = input2.nextDouble();
                    if(value <= 0 || value >= 6){
                        System.out.println("error");
                        System.out.println("Del 1.0 al 5.0 en cuanto calificas tu nivel el conocimiento: ");
                        value = input2.nextDouble();
                    }else{
                        break;
                    }
                    
                }catch(Exception u){
                    System.out.println("Error... ");
                    input2.nextLine();
                }
            }
            // Cuarta pregunta 
            while(true){
                System.out.println("Del 1 al 100 como fue el compromiso en clases: ");
                try{
                    value2 = input2.nextDouble();
                    if(value2 <= 0 || value2 >= 101){
                        System.out.println("error");
                        System.out.println("Del 1 al 100 como fue el compromiso en clases: ");
                        value2 = input2.nextDouble();
                    }else{
                        value2 = value2 * 0.05;
                        break;
                    }
                }catch(Exception g){
                    System.out.println("Error... ");
                    input2.nextLine();
                }
            }
            // Quinta pregunta 
            while(true){
                System.out.println("Del 1.0 al 5.0 como consideras tu asistencia : ");
                try{
                    value3 = input2.nextDouble();
                    if(value3 <= 0 || value3 >= 6){
                        System.out.println("error");
                        System.out.println("Del 1.0 al 5.0 en cuanto calificas tu nivel el conocimiento: ");
                        value3 = input2.nextDouble();
                    }else{
                        break;
                    }
                }catch(Exception e){
                    
                }
            }

            while(true){
                System.out.println("Del 1 al 100 como fue tu dedicacion extracurricular : ");
                try{
                    value4 = input2.nextDouble();
                    if(value4 <= 0 || value4 >= 101){
                        System.out.println("error");
                        System.out.println("Del 1 al 100 como fue tu dedicacion extracurricular: ");
                        value4 = input2.nextDouble();
                    }else{
                        value4 = value4 * 0.05;
                        break;
                    }
                }catch(Exception g){
                    System.out.println("Error... ");
                    input2.nextLine();
                }
            }
            pregunta.setPregunta1(Corte);
            pregunta.setPregunta2(Corte1);
            pregunta.setPregunta3(value);
            pregunta.setPregunta4(value2);
            pregunta.setPregunta5(value3);
            pregunta.setPregunta6(value4);
            pregunta.definitiva();
            pregunta.getPromedio();
            Estudiante estu = new Estudiante(name, num);
            estu.setPreguntas(pregunta);
            lista.add(estu);
            System.out.println(lista);
            try {
                FileWriter writer = new FileWriter("resultados.txt");
                BufferedWriter escritor = new BufferedWriter(new FileWriter("resultados.txt"));

                escritor.write(lista.toString());
                escritor.newLine();
                escritor.write("Pregunta1: " + Corte);
                escritor.newLine();
                escritor.write("Pregunta2: " + Corte1 + "Pregunta3: " + value + " Pregunta4: " + value2 + " Pregunta5: " + value3 + " Pregunta6: " + value4 + "Promedio "  + pregunta.getPromedio());
                escritor.newLine();
                writer.close();
                escritor.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
    

}





        }


        
        
    }

