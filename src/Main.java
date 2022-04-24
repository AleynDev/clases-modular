import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /**
     * <h2>Método para generar números enteros aleatorios</h2>
     * @return Integer aleatorio entre 1 y 10
     */
    public static Integer generaNum() {
        return ((int) (Math.random() * 10) + 1);
    }


    /**
     * <h2>Método main donnde se ejecuta la app</h2>
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Prisma> listaPrismas = new ArrayList<>();
        int numPrismas = 3;

        for (int i = 0; i < numPrismas; i ++) {
            listaPrismas.add(new Prisma(generaNum(), generaNum(), "Prisma" + (i+1)));
        }

        System.out.println("""
                
                ================================
                  CREACION DE OBJETOS PRISMA: \s
                ================================
                """);

        for (Prisma p: listaPrismas) {
            System.out.println(p.toString());
        }

        Collections.sort(listaPrismas);

        System.out.println("\nOrdenados de mayor a menor\n");

        for (Prisma p: listaPrismas) {
            System.out.println(p.toString());
        }

    }

}
