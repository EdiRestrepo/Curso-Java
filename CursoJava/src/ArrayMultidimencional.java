public class ArrayMultidimencional {
    
    public static void main(String[] args) {
        
//        int [][] x = new int[2][3];
//        
//        x[0][0] = 1;
//        x[0][1] = 2;
//        x[0][2] = 3;
//        
//        x[1][0] = 4;
//        x[1][1] = 5;
//        x[1][2] = 6;
//        
//        for(int[] matrizInterna : x){
//            
//            for(int dato : matrizInterna){
//                System.out.println(dato);
//            }
//        }

//        int[][] x = {
//            {1,2,3},
//            {4,5,6},
//            {7,8}
//        };
//        
//        for(int[] matrizInterna : x){
//            
//            for(int dato : matrizInterna){
//                
//                System.out.println(dato);
//            }
//        }

              int[][][] x = {
            {
                {1,2,3},
                {4,5,6},
               
            },{
                {-1,-2,-3},
                {-4,-5,-6},
            }
            
            
        };
        
        for(int[][] matriz2D : x){
            
            for(int[] matriz1D : matriz2D){
                
                for(int dato :  matriz1D ){
                    System.out.println(dato);
                }
            }
        }
        
    }
    
}
