package datoslibro;
import java.util.Scanner;

public class DatosLibro {
    Scanner teclado=new Scanner(System.in);
    private String Autor, Area ;
    public String nombreL;
    private int AñoDePublicación; 
    public  int Cantidad=0;
    private long Codigo;
 
public void IngresarDatos(){
    int contador6;
    System.out.println("Ingrese el nombre del libro");
    nombreL=teclado.nextLine();
    System.out.println("Ingrese el Autor del libro");
    Autor=teclado.nextLine();
    System.out.println("Ingrese el año de publicación");
    AñoDePublicación=teclado.nextInt();
    System.out.println("Ingrese el código");
    Codigo=teclado.nextLong();
    System.out.println("Ingrese la cantidad");
    Cantidad=teclado.nextInt();
    System.out.println("Ingrese el numero correspondiente al area del libro:");
    System.out.println("1.Quimica");
    System.out.println("2.Física");
    System.out.println("3.Tecnología");
    System.out.println("4.Cálculo");
    System.out.println("5.Programación");
    contador6=teclado.nextInt();
    switch(contador6){
        case 1:
            Area="Quimica";
        break;
        
        case 2:
            Area="Física";
        break;
            
        case 3:
            Area="Tecnología";
        break;
        
        case 4:
            Area="Cálculo";
        break;
            
        case 5:
            Area="Programación";
              
    }
    
  
}       

public void mostrarDatos(){
    System.out.println("Nombre: "+nombreL);
    System.out.println("Autor: "+Autor);
    System.out.println("Año de publicación: "+AñoDePublicación);
    System.out.println("codigo: "+Codigo);
    System.out.println("Cantidad: "+Cantidad);
    System.out.println("Area: "+Area);
            
}

public void EliminarDatos(){
    nombreL="Nada";
    Autor="Nada";
    AñoDePublicación=0;
    Codigo=0;
    Cantidad=0;
    Area=null;
}

 public int BuscarLibro(String  nombreLibro){
     int contador9;
     if(nombreL.equals(nombreLibro)){
         
         contador9=1;
     }
     else
         contador9=0;
    return contador9;
}
 
public int Eliminarlibro(String nombreLibro){
    int contador11;
    if(nombreL.equals(nombreLibro)){
         contador11=1;
     }
     else
         contador11=0;
    return contador11; 
    
} 
    
public void CambiarDatos(){
    int contador7;
    System.out.println("Ingrese el numero correspondiente al dato que desea cambiar");
    System.out.println("1.nombre del libro");
    System.out.println("2.Autor del libro");
    System.out.println("3.año de publicación");
    System.out.println("4.código");
    System.out.println("5.cantidad");
    System.out.println("6.area");
    contador7=teclado.nextInt();
    switch(contador7){
        case 1:
            System.out.println("Ingrese el nuevo nombre del libro");
            teclado.nextLine();
            nombreL=teclado.nextLine();
        break;
        
        case 2:
            System.out.println("Ingrese el nuevo Autor del libro");
            teclado.nextLine();
            Autor=teclado.nextLine();
        break;
            
        case 3:
            System.out.println("Ingrese el nuevo año de publicación");
            AñoDePublicación=teclado.nextInt();
        break;
            
        case 4:
            System.out.println("Ingrese nuevo el código");
            Codigo=teclado.nextLong();
        break;
            
        case 5:System.out.println("Ingrese la nueva cantidad");
               Cantidad=teclado.nextInt();
        break;
            
        case 6:
            int contador8;
             System.out.println("Ingrese el numero correspondiente a la nueva area del libro:");
             System.out.println("1.Quimica");
             System.out.println("2.Física");
             System.out.println("3.Tecnología");
             System.out.println("4.Cálculo");
             System.out.println("5.Programación");
             contador8=teclado.nextInt();
            switch(contador8){
        case 1:
            Area="Quimica";
        break;
        
        case 2:
            Area="Física";
        break;
            
        case 3:
            Area="Tecnología";
        break;
        
        case 4:
            Area="Cálculo";
        break;
            
        case 5:
            Area="Programación";
              
        }
            
            
            
    }
}

public class Prestamos extends DatosLibro{
   private long cedula;
   public String LibroPrestado;
   public long CedulaPretado;
   
  public void IngresoCedula(){
     System.out.println("Ingrese su cedula");
     cedula=teclado.nextLong();
} 
   
  public void PrestarLibro(){ 
   
      Cantidad= Cantidad-1;
      System.out.println("Disfrute su libro");
      System.out.println("Quedan "+Cantidad+" libros disponibles");
  }
  
  
  public void DevolverLibro(){
      
    Cantidad=Cantidad+1;
    System.out.println("Su libro fue debuelto con exito");
    System.out.println("Quedan "+Cantidad+" libros disponibles");
    
  }
  
  public void LibrosPrestados(int v){
      if(v==0){
      LibroPrestado=nombreL;
      CedulaPretado=cedula;
      System.out.println("se almaceno informacion de persona que presto libro");
      
      }
      else if(v==1){
      LibroPrestado="libre";
      CedulaPretado=0;
      }
  }

 public void ImprimirLibrosP(){
     System.out.println("Libro: "+LibroPrestado);
     System.out.println("Cedula: "+CedulaPretado);
} 
  
        
  
  
  
} 


         
    public static void main(String[] args) {
        int contador, contador2, contador3, contador4, contador5, librosIngresar, LI, contador8,contadorMenu=1;
        String NomLibro;
        Scanner teclado=new Scanner(System.in);
         DatosLibro datos=new DatosLibro();
         Prestamos libros[]=new Prestamos[10];
         for(int k=0;k<=9;k++){
             libros[k]=datos.new Prestamos();
             libros[k].EliminarDatos();
         }
         do{
         System.out.println("Ingrese el numero de la opcion que desea ejecutar");
         System.out.println("1.Gestionar Información de los libros");
         System.out.println("2.Gestionar Información de los prestamos");
         System.out.println("3.Salir");
         contador=teclado.nextInt();
        switch(contador){
            case 1:{
                System.out.println("Ingrese el numero de la opción que desea ejecutar");
                System.out.println("1.Ingresar Libro");
                System.out.println("2.Actualizar Libro");
                System.out.println("3.Eliminar Libro");
                System.out.println("4.Buscar Libro");
                contador2=teclado.nextInt();
                
                switch(contador2){
                    case 1: 
                        System.out.println("cuantos libros desea ingresar");
                        librosIngresar=teclado.nextInt();
                        for(contador4=0; contador4<librosIngresar; contador4++){
                            LI = contador4+1;
                            System.out.println("Ingrese los datos del libro"+LI);
                            System.out.println("");
                            libros[contador4].IngresarDatos();
                            System.out.println(contador4);
                            libros[contador4].mostrarDatos();
                        }
                        System.out.println("");
                        System.out.println("Ingrese 1 para volver al menu pricipal o 2 para salir");
                        System.out.println("");
                        contadorMenu=teclado.nextInt(); 
                       
                    break;
                        
                    case 2:
                        int contadorEliminar;
                        String NomLibro3;
                        System.out.println("Ingrese el nombre del libro que desea actualizar");
                        System.out.println("");
                        teclado.nextLine();
                        NomLibro3=teclado.nextLine();
                        for(int contadorElimi=0; contadorElimi<=9; contadorElimi++){
                            contador5=libros[contadorElimi].BuscarLibro(NomLibro3);
                            if(contador5==1){
                                libros[contadorElimi].CambiarDatos();
                            }
                        }
                        System.out.println("");
                        System.out.println("Ingrese 1 para volver al menu pricipal o 2 para salir");
                        System.out.println("");
                        contadorMenu=teclado.nextInt();
                        
                        
                        
                        
                        
                        
                    break;
                        
                    case 3:
                        int contador12;
                        String NomLibro2;
                        System.out.println("Ingrese el nombre del libro que desea eliminar");
                        teclado.nextLine();
                        NomLibro2=teclado.nextLine();
                        for(int contador13=0; contador13<=9; contador13++){
                            contador12=libros[contador13].BuscarLibro(NomLibro2);
                            if(contador12==1){
                                libros[contador13].EliminarDatos();
                                System.out.println("");
                                System.out.println("El libro se a eliminado con exito");
                            }
                        }
                        System.out.println("");
                        System.out.println("Ingrese 1 para volver al menu pricipal o 2 para salir");
                        System.out.println("");
                        contadorMenu=teclado.nextInt();
                         
                    break;
                        
                    case 4:
                        
                        int contador9, contadorBus,NoEsta=0;
                        System.out.println("Ingrese el nombre del libro que desea buscar");
                        teclado.nextLine();
                        NomLibro=teclado.nextLine();
                        for(contadorBus=0; contadorBus<=9; contadorBus++){ 
                        contador9=libros[contadorBus].BuscarLibro(NomLibro);
                        if(contador9==1){
                            System.out.println("Informacion de la busqueda: ");
                            libros[contadorBus].mostrarDatos();
                          }
                        else
                            NoEsta++;
                        }
                        
                       if(NoEsta==10){
                           System.out.println("El libro no esta");
                       }
                       System.out.println("");
                       System.out.println("Ingrese 1 para volver al menu pricipal o 2 para salir");
                       System.out.println("");
                       contadorMenu=teclado.nextInt(); 
                    break;    
                     
                }
            }
                
                
         
            break;     
            
            case 2: System.out.println("Ingrese el numero de la opción que desea ejecutar");
                    System.out.println("1.Prestar Libro");
                    System.out.println("2.Devolver Libro");
                    System.out.println("3.Libros Prestados");
                    contador3=teclado.nextInt();
                    switch(contador3){
                        case 1:
                            int contador13, contador14;
                            String NomLibro3;
                            System.out.println("Ingrese el nombre del libro que desea prestar");
                            teclado.nextLine();
                            NomLibro3=teclado.nextLine();
                            for(contador13=0; contador13<=9; contador13++){
                            contador14=libros[contador13].BuscarLibro(NomLibro3);
                            if(contador14==1){
                                System.out.println("Ingrese su cedula");
                                libros[contador13].IngresoCedula();
                                libros[contador13].PrestarLibro();
                                libros[contador13].LibrosPrestados(0);
                            }
                            
                            
                        }
                        break;
                            
                        case 2:
                            int contador15, contador16;
                            String NomLibro4;
                            System.out.println("Ingrese el nombre del libro que desea devolver");
                            teclado.nextLine();
                            NomLibro4=teclado.nextLine();
                            for(contador15=0; contador15<=9; contador15++){
                            contador16=libros[contador15].BuscarLibro(NomLibro4);
                            if(contador16==1){
                                libros[contador15].DevolverLibro();
                                libros[contador15].LibrosPrestados(1);
                                  }
                              }
                        break;
                            
                        case 3:
                           int contador17;
                            for(contador17=0; contador17<=10; contador++){
                               libros[contador17].ImprimirLibrosP(); 
                                
                                
                            }
                            
                      
                            }
                                    
                            
                    }                
                
             }
         
         while(contadorMenu==1);
         
    
    
         }
         
         
    }



