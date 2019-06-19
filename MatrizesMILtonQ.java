/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;
/**
 *
 * @author Docente
 */
public class MatrizesMILtonQ {
    public int[][] cuadradosXnum(int numero){
    int[][] tablaM=new int[numero][2];
        for(int i = 0; i < tablaM.length; i++) {
           tablaM[i][0]=i+1;
           tablaM[i][1]=(i+1)*(i+1);           
        }
        return tablaM;
    }    
    public void sumaDeValoresxParesImpar(){
        int[][]  datos={{3,40,70,30},{50,5,20,4},{60,18,6,10},{16,5,9,7}};
        int par=0, impar=0, todos=0;        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if(datos[i][j]%2==0){
                    par=par+datos[i][j];
                }else{
                    impar=impar+datos[i][j];
                }
                todos=todos+datos[i][j];
            }
        }
        System.out.println("PAR:"+par);
        System.out.println("impar:"+impar);
        System.out.println("todos:"+todos);
     }
    
    public int[][] transformada01(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimensionX-i){
                    matriz[i][j]=numInit+(i+j)*(i+j+1)/2+i;
                }else{
                matriz[i][j]=-1;
                }
            }
        }        
    return matriz;
    }
    public int[][] transformada02(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimensionX-i){
                    matriz[i][j]=numInit+(i+j)*(i+j+1)/2+j;
                }else{
                matriz[i][j]=-1;
                }
            }
        }        
    return matriz;
    }
     public int[][] transformada03(int dim, int numIint){
    {   int[][] matriz = new int[dim][dim];
        int i = 1;
        int j = 1;
            for (int element = 0; element < dim * dim; element++){
            matriz[i - 1][j - 1] = element;
            if ((i + j) % 2 == 0){
                    if (j < dim)j++;
        else
                i+= 2;
                    if (i > 1)i--;
        }else{
                    if (i < dim)i++;
            else
                j+= 2;
                    if (j > 1)j--;
            }
        }
        return matriz;
        }
    }
    public int[][] transformada04(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimensionX-i){
                    matriz[i][j]=numInit+(i+j)*(i+j+1)/2+i;
                }else{
                matriz[i][j]=-1;
                }
            }
        }        
    return matriz;
    }
    public int[][] transformada05(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){
                    matriz[i][j]=numInit;
                    numInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
   public int[][] transformada06(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < matriz[0].length; j++){
                if(contador<=i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
   public int[][] transformada07(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < matriz[0].length; j++){
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada08(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = matriz[0].length-1; j>=0; j--){
        for (int i = 0; i < matriz.length;i++) {
                if(contador<=j){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada11(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int i = 0; i < matriz.length;i++) {
            for (int j = matriz[0].length-1; j>=0; j--){
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada12(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = matriz.length-1; j>=0; j--){
        for (int i = 0; i < matriz[0].length; i++) {
                if(contador<=j){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada13(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = 0; j < matriz[0].length; j++){
        for (int i = 0; i < matriz.length;i++) {
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada14(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = 0; j < matriz[0].length; j++){
        for (int i = 0; i < matriz.length;i++) {
                if(contador<=j){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada16(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){ 
                    matriz[j][i]=numInit;
                    numInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
       public int[][] transformada17(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = matriz[0].length-1; j>=0; j--){
        for (int i = 0; i < matriz.length;i++) {
                if(contador<=j){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada18(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = matriz[0].length-1; j>=0; j--){
        for (int i = 0; i < matriz.length;i++) {
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada19(int dim, int numIint) {
        int[][] matriz = new int[dim][dim];
        int contador = 0;
        for (int j = matriz.length - 1; j >= 0; j--) {
            for (int i = matriz[0].length - 1; i >= 0; i--) {
                if (contador <= j) {
                    matriz[i][j] = numIint;
                    numIint++;
                    contador++;
                } else {
                    matriz[i][j] = -1;
                }
            }
            contador = 0;
        }
        return matriz;
    }
    public int[][] transformada20(int dim, int numInit) {
        int[][] matriz = new int[dim][dim];
        int contador = 0;
        for (int j = 0; j <= matriz.length - 1; j++) {
            for (int i = matriz[0].length - 1; i >= 0; i--) {
                if (contador <= j) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = -1;
                }
            }
            contador = 0;
        }
        return matriz;
    }
    public int[][] transformada22(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = 0; y <= matriz.length - 1; y++) {
            if (cont % 2 == 0) {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            } else {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }
    public int[][] transformada25(int dim, int numInit){
        int contador=0;
          int[][] matriz=new int[dim][dim];
          for (int x = 0; x < matriz.length; x++) {
              if(contador%2==0){
                  for (int y = 0; y < matriz[0].length; y++) {
                      matriz[x][y]=numInit;
                      numInit++;
                  }
              }else{
                  for (int y = matriz[0].length-1; y >=0; y--) {
                      matriz [x][y]=numInit;
                      numInit++;
                  }
              }
              contador++;
        }
        return matriz;
    }
         public int[][] transformada27(int dim, int numInit){
    int cont=0; int[][] matriz=new int[dim][dim];
        for (int x =matriz.length-1; x >=0 ; x--) {
            if(cont%2==0){
                for (int y = matriz[0].length-1; y >=0; y--) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
              
                
            }else{
                for (int y = matriz[0].length-1; y >=0; y--) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
            }
            cont++;
        }    
        return matriz;
    }
   
    public int[][] transformada28(int dim, int numInit){
    int cont=0; int[][] matriz=new int[dim][dim];
        for (int x =matriz.length-1; x >=0 ; x--) {
            if(cont%2==0){
                for (int y = 0; y < matriz[0].length; y++) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
            }else{
                for (int y = matriz[0].length-1; y >=0; y--) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
            }
            cont++;
        }    
        return matriz;
    }
   

    public int[][] transformada29(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }            
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }
            
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit;
        }
        
        return matriz;
     }
    public int[][] transformada30(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
                  
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }      
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit--;
        }
        
        return matriz;
     }
    
    
    
     public int[][] transformada31(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
            
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }            
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit;
        }
        
        return matriz;
     }
     public int[][] transformada32(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
                  
            
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }      
        for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit--;
        }
        
        return matriz;
     }
     public int[][] transformada33(int dim, int numInit){
     int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
            
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }            
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            
         }
        
         if(dim%2!=0){
         matriz[dim/2][dim/2]=numInit;
         }
        
        return matriz;
    }
       public int[][] transformada34(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
                  
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }      
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit--;
        }
        
        return matriz;
     }
     public int[][] transformada36(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        for(int Prin = 0; Prin < dim/2; Prin++){
            for(int ldx = dim-Prin-1; ldx > Prin; ldx--){
                matriz[ldx][dim-Prin-1]=numIint;
                numIint++;
            }
            for(int lsx = dim-Prin-1; lsx>Prin; lsx--){
                matriz[Prin][lsx]=numIint;
                numIint++;
            }
            for(int lxx = Prin; lxx<dim-Prin-1; lxx++){
                matriz[lxx][Prin]=numIint;
                numIint++;
            }
            for(int lix = Prin; lix<dim-Prin-1; lix++){
                matriz[dim-Prin-1][lix]=numIint;
                numIint++;
            }
        if(dim%2!=0){
            matriz[dim/2][dim/2]=numIint;
        }
        }
        return matriz;
    }
    
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        MatrizesMILtonQ ag=new MatrizesMILtonQ();
        int[][] matriX=ag.cuadradosXnum(10);
        for (int i = 0; i < matriX.length; i++) {
            System.out.println(matriX[i][0]+"|"+matriX[i][1]);
        }
        System.out.println("Resultados de la Suma de contenido de Matriz");
        ag.sumaDeValoresxParesImpar();
        System.out.println("Transformada01");
        ag.imprimirMatriz(ag.transformada01(5, 0));
        System.out.println("Transformada02");
        ag.imprimirMatriz(ag.transformada02(5, 0 ));
        System.out.println("Transformada03");
        ag.imprimirMatriz(ag.transformada03(5, 0 ));
        System.out.println("Transformada04");
        ag.imprimirMatriz(ag.transformada04(5, 5));
        System.out.println("Transformada05");
        ag.imprimirMatriz(ag.transformada05(5, 0));
        System.out.println("Transformada06");
        ag.imprimirMatriz(ag.transformada06(5, 0));
        System.out.println("Transformada07");
        ag.imprimirMatriz(ag.transformada07(5, 0));
        System.out.println("Transformada08");
        ag.imprimirMatriz(ag.transformada08(5, 0));
        System.out.println("Transformada11");
        ag.imprimirMatriz(ag.transformada11(5, 0));
        System.out.println("Transformada12");
        ag.imprimirMatriz(ag.transformada12(5, 0));
        System.out.println("Transformada13");
        ag.imprimirMatriz(ag.transformada13(5, 0));
        System.out.println("Transformada14");
        ag.imprimirMatriz(ag.transformada14(5, 0));
        System.out.println("Transformada16");
        ag.imprimirMatriz(ag.transformada16(5, 0));
        System.out.println("Transformada17");
        ag.imprimirMatriz(ag.transformada17(5, 0));
        System.out.println("Transformada18");
        ag.imprimirMatriz(ag.transformada18(5, 0));
        System.out.println("Transformada19");
        ag.imprimirMatriz(ag.transformada19(5, 0));
        System.out.println("Transformada20");
        ag.imprimirMatriz(ag.transformada20(5, 0));
        System.out.println("Transformada22");
        ag.imprimirMatriz(ag.transformada22(5, 0));
        System.out.println("Transformada25");
        ag.imprimirMatriz(ag.transformada25(5, 0));
        System.out.println("Transformada27");
        ag.imprimirMatriz(ag.transformada27(5, 0));
        System.out.println("Transformada28");
        ag.imprimirMatriz(ag.transformada28(5, 0));
        System.out.println("Transformada29");
        ag.imprimirMatriz(ag.transformada29(5, 0));
        System.out.println("Transformada30");
        ag.imprimirMatriz(ag.transformada30(5, 0));
        System.out.println("Transformada31");
        ag.imprimirMatriz(ag.transformada31(5, 0));
        System.out.println("Transformada32");
        ag.imprimirMatriz(ag.transformada32(5, 0));
        System.out.println("Transformada33");
        ag.imprimirMatriz(ag.transformada33(5, 0));
        System.out.println("Transformada34");
        ag.imprimirMatriz(ag.transformada34(5, 0));
        System.out.println("Transformada36");
        ag.imprimirMatriz(ag.transformada36(5, 0));
        
        
        
    }
}