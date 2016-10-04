package unidad2evaluacionparte.pkg2;

import static java.util.Arrays.sort;

public class Ordenamiento {
    public static void QuickSortINT(int vect[], int izq, int der) {
        int i = 0; 
        int j = 0;
        int x = 0;
        int aux = 0;
        i = izq;
        j = der;
	x = vect[(izq + der) / 2];
	do {
            while ((vect[i] < x) && (j <= der)) {
		i++;
            }
            while ((x < vect[j]) && (j > izq)) {
                j--;
            }
            if (i <= j) {
                aux = vect[i];
                vect[i] = vect[j];
		vect[j] = aux;
		i++;
		j--;
            }
	} 
        while (i <= j);
            if (izq < j)
		QuickSortINT(vect, izq, j);
            if (i < der)
		QuickSortINT(vect, i, der);
    }
   
    public static void QuickSortDoble( double[] a ){
        double[] left = null, right = null;
        int      nleft, nright;
        double   pivot;
        int      i, j, k;
        if ( a.length <= 1 ){
            return;
        }
        pivot = a[a.length-1];
        nleft = nright = 0;
        for ( i = 0; i < a.length-1; i++ )
            if ( a[i] <= pivot )
                nleft++;
            else
                nright++;
            left  = new double[nleft];
            right = new double[nright];
            i = 0;
            j = 0;
            for ( k = 0; k < a.length-1; k++ )
                if ( a[k] <= pivot )
                    left[i++] = a[k];
                else
                    right[j++] = a[k];
            sort(left);
            sort(right);
            k = 0;
            for ( i = 0; i < left.length; i++ )
                a[k++] = left[i];
                a[k++] = pivot;
            for ( j = 0; j < right.length; j++ )
                a[k++] = right[j];
    }
    
    public static void ShellsortInt (int[] a) {
        int salto=a.length/2;
        while(salto>=1){
        for(int rec=salto;rec<a.length;rec++){
            int temp=a[rec];
            int j=rec-salto;
            while(j>=0&&a[j]>temp){
                a[j+salto]=a[j];
                j-=salto;
            }
            a[j+salto]=temp;
        }
        salto/=2;
        }
    }
    
    public static void ShellsortDouble (double[] a) {
        int salto=a.length/2;
        while(salto>=1){
        for(int rec=salto;rec<a.length;rec++){
            double temp=a[rec];
            int j=rec-salto;
            while(j>=0&&a[j]>temp){
                a[j+salto]=a[j];
                j-=salto;
            }
            a[j+salto]=temp;
        }
        salto/=2;
        }
    }

    public static void imprimeA(int []a){
        String sal="";
        for(int i=0;i<a.length;i++){
            if(a[i]<10)
                sal+=" "+a[i]+" ";
            else
                sal+=a[i]+" "; 
        }
        System.out.println(sal); 
    }
    
    public static void imprimeB(double []a){
        String sal="";
        for(int i=0;i<a.length;i++){
            if(a[i]<10)
                sal+=" "+a[i]+" ";
            else
                sal+=a[i]+" "; 
        }
        System.out.println(sal); 
    }
    
    public static void main (String[] args) {
        int a[] = { 25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
        double b[]={10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
        System.out.println("Arreglos Originales");
        imprimeA(a);
        imprimeB(b);
        System.out.println("--------");
        System.out.println("QuickSort Int");
	QuickSortINT(a, 0, a.length - 1);
        imprimeA(a);
        System.out.println("---------");
        System.out.println("QuickSort Double");
	QuickSortDoble(b);
        imprimeB(b);
        System.out.println("---------");
        System.out.println("Shell Int");
        ShellsortInt(a);
        imprimeA(a);
        System.out.println("-------");
        System.out.println("Shell Double");
        ShellsortDouble(b);
        imprimeB(b);
    } 
}

