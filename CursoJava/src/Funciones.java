
public class Funciones {
    public static void main(String[] args) {
        
//        saludar("Edison", 35); 
//        var suma = sumar(5, 8);
        
//        System.out.println("La suma es "+ suma);

//            cuentaRegresiva(10);

//        System.out.println(factorial(5));

        System.out.println(sumar("",4,8,9,6));




    }
    
     static String saludar(String nombre, int edad){
        System.out.printf("Hola %s tu edad es %d \n", nombre, edad);
        
        return "Su nombre es ";
    }
    
    
    static int sumar(String nombre, int... numeros){
        
        int suma = 0;
        var nume = numeros;
        System.out.println(nume);
        for(int num: numeros){
            
            suma += num;
        }
        
        return suma;
    }
    
    static double sumar(double a, double b){
        
        return a + b;
    }
    
    static void cuentaRegresiva(int numero){
        
        numero --;
        
        if(numero > 0){
            System.out.println(numero);
            cuentaRegresiva(numero);
        }else{
            System.out.println("Llego hasta cero");
        }
    }
    
    static int factorial(int numero){
        
        if(numero > 1){
            numero = numero * factorial(numero - 1);
            
        }
        
        return numero;
        
    }
 
    
}
