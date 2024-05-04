public class App {
    public static void mergesort(int[]) arr, int left, int right){

    if (left < right)}
    //Encuentra el punto medio del arreglo
    int mid = (left + right) / 2;

    //Ordena recursivamente la mitad izquierda 
    mergesort(arr, left, mid);
    //Ordena recursivamente la mitad derecha 
    mergesort(arr, mid, + 1, right);

    // Cambia las dos mitades ordenadas
    mergesort(arr, left, mid, right);

    //mergeSortdivide el arreglo en mitades recursivamente.
    //Llamadas recursivas para ordenar cada mitad.

    //Parte 2, metódo merge.

    public static void merge(int[]) arr, int left, int mid, int right) {
        //Tamaños de los subarreglos a funcionar
        int sizeleft = mid - left + 1
        int sizeright = right - mid;

        // arreglos temporales para almacenar los subarreglos
        int [] templeft = new int [sizeleft]:
        int [] tempright = new int [sizeright];

        //copia datos a los arreglos temporales
        for (int i = 0 ; i < sizeleft; i++) {
            templeft[i] = arr [left + 1 ];
    
            for (int j = 0; j < sizeright; j++)
            tempright[j] = arr [mid + 1 + j];

            //funsiona los subarreglos temporales en el arreglo original
            int i = 0, j = 0 ;
            int k = left;  // indice inicial para el arreglo funsionado

            while (i < sizeleft && j < sizeright)
            if (templeft [i]) <= tempright[j])
            arr[k] = templeft [i];
            i++;
            else {
                arr[k] = tempright[j];
                j++;
                k++;

                //copia elementos restantes de templeft[] si los hay
                while(i < sizeleft)
                arr [k] = templeft[i];
                i++;
                k++;


                //copia elementos restantes de tempright[] si los hay
                while(j < sizeright)
                arr[k] = tempright[j];
                j++;
                k++;

                //metodo main

                public static void main(String [] arg)
                int[] arr = {38, 27, 43, 3, 9, 82, 10};
                int n = arr, length;

                mergesort(arr, left:0, n - 1 ); //Llamada al metodo de ordenamiento mergesort

                System.out.prinIn(x:"Arreglo ordenado:");
                for(int num : arr)
                System.out.print(num + " ");



                





}
