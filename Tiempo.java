public class Tiempo {

    public static long aMilisegundos(int dias, int horas, int minutos, int segundos) {

        final long MILISEGUNDOS_POR_SEGUNDO = 1000L;
        final long MILISEGUNDOS_POR_MINUTO = 60 * MILISEGUNDOS_POR_SEGUNDO;
        final long MILISEGUNDOS_POR_HORA = 60 * MILISEGUNDOS_POR_MINUTO;
        final long MILISEGUNDOS_POR_DIA = 24 * MILISEGUNDOS_POR_HORA;

        return (dias * MILISEGUNDOS_POR_DIA) +
                (horas * MILISEGUNDOS_POR_HORA) +
                (minutos * MILISEGUNDOS_POR_MINUTO) +
                (segundos * MILISEGUNDOS_POR_SEGUNDO);
    }

    public static void main(String[] args) {
        
        int d = 1;
        int h = 2;
        int m = 30;
        int s = 15;

        long resultado = aMilisegundos(d, h, m, s);
        System.out.println(d + "d " + h + "h " + m + "m " + s + "s equivalen a: " + resultado + " milisegundos.");
    }
}
