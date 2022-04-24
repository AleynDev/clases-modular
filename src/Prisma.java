/**
 * @author Aleyn Coello
 * <h1>Clase que hace referencia a un objeto geométrico prisma</h1>
 */
public class Prisma implements Comparable<Prisma> {


    Integer baseTriangulo;
    Integer alturaPrisma;
    String nombre;

    /**
     * <h2>Constructor de la clase Prisma con sus 3 atributos</h2>
     * @param baseTriangulo
     * @param alturaPrisma
     * @param nombre
     */
    public Prisma(Integer baseTriangulo, Integer alturaPrisma, String nombre) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
        this.nombre = nombre;
    }


    /**
     * <h2>Método para la salida del atributo nombre</h2>
     * @return String
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * <h2>Método para la entrada del atributo nombre</h2>
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * <h2>Método para la salida del atributo baseTriangulo</h2>
     * @return Integer
     */
    public Integer getBaseTriangulo() {
        return baseTriangulo;
    }


    /**
     * <h2>Método para la entrada del atributo baseTriangulo</h2>
     * @param baseTriangulo
     */
    public void setBaseTriangulo(Integer baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }


    /**
     * <h2>Método para la entrada del atributo alturaPrisma</h2>
     * @return Integer
     */
    public Integer getAlturaPrisma() {
        return alturaPrisma;
    }


    /**
     * <h2>Método para la entrada del atributo alturaPrisma</h2>
     * @param alturaTriangulo
     */
    public void setAlturaPrisma(Integer alturaTriangulo) {
        this.alturaPrisma = alturaTriangulo;
    }


    /**
     * <h2>Método para determinar la altura de un triángulo</h2>
     * @return float
     */
    public float alturaTriangulo() {
        return (float) Math.sqrt(Math.pow(this.baseTriangulo, 2) - Math.pow((this.baseTriangulo / 2), 2));
    }


    /**
     * <h2>Método para determinar el área de un triángulo</h2>
     * @return float
     */
    public float areaBase() {
        return ((this.baseTriangulo * alturaTriangulo()) / 2);
    }


    /**
     * <h2>Método para determinar el perimetro de un triángulo</h2>
     * @return float
     */
    public float perimetro() {
        return (this.baseTriangulo * 3);
    }


    /**
     * <h2>Método para determinar el área lateral de un prisma</h2>
     * @return float
     */
    public float areaLateral() {
        return (perimetro() * this.alturaPrisma);
    }


    /**
     * <h2>Método para determinar el área total de un prisma</h2>
     * @return float
     */
    public float areaTotal() {
        return (2 * areaBase() + areaLateral());
    }


    /**
     * <h2>Sobreescritura del metodo toString, para formatear la</h2>
     * <h2>salida del contenido del ArrayList<Prisma></h2>
     * @return String
     */
    @Override
    public String toString() {
        return " Creando el objeto " + this.nombre + " con:" +
                "\n  - Base Triángulo: " + this.baseTriangulo +
                "\n  - Altura Prisma: " + this.alturaPrisma +
                "\n  - Area total: " + areaTotal() + "\n";
    }



    /**
     * <h2>Sobreescritura del método compareTo de la interfaz Comparable para
     * ordenar las listas de Prismas por el valor de su area total de mayor a menor.</h2>
     * @param p hace referencia a la clase Prisma
     * @return int (-1 si la primera condición es verda, 0 si es igual y 1 si es falso).
     */
    @Override
    public int compareTo(Prisma p) {
        if (p.areaTotal() < areaTotal()) {
            return -1;
        }
        else if (p.areaTotal() < areaTotal()) {
            return 0;
        }
        else {
            return 1;
        }
    }

}
