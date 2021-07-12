public class Tutoria0907 {
    public static void main(String[] args) {
        int [][] datos = {{1,0,1,78},{2,1,2,46},{3,0,3,62},{3,0,3,76}};
        int sumatoria1= 0;

        for(int i=0;i < datos.length;i++)
        {
          sumatoria1 = sumatoria1 + datos[i][3];
          
        }
        float promedio = (float)sumatoria1 / (float)datos.length;
        System.out.println(promedio);

            double sumatoria2=0, varianza;

        for (int i=0; i < datos.length; i++)
        {
            //sumatoria2= sumatoria2 + (float)Math.pow(datos[i][3] - promedio, 2);
            sumatoria2= sumatoria2 + Math.pow(datos[i][3] - promedio, 2);
        }
        varianza=sumatoria2 / (double)datos.length;
        System.out.println(varianza);
    }
}
