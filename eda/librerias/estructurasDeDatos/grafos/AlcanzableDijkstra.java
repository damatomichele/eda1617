package librerias.estructurasDeDatos.grafos;


/**
 * Write a description of class AlcanzableDijkstra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class AlcanzableDijkstra implements Comparable<AlcanzableDijkstra>
{
    // instance variables - replace the example below with your own
    int vertice;
    double distancia;
    

    /**
     * Constructor for objects of class AlcanzableDijkstra
     */
    public AlcanzableDijkstra(int a, double b)
    {
        // initialise instance variables
        vertice=a;
        distancia=b;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int compareTo(AlcanzableDijkstra otro)
    {
        // put your code here
        return (int) Math.signum(this.distancia-otro.distancia); 
    }
}
