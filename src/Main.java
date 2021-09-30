/************************************
 * Author: Maximilian Achleitner
 * Date: 30.
 ************************************/

public class Main {
    public static void main(String[] args)
    {
        DatePrinter Dp = new DatePrinter();
        Thread t1 = new Thread(Dp);
        t1.start();

        CountPrinter Cp = new CountPrinter();
        Thread t2 = new Thread(Cp);
        t2.start();
    }
}


// Bei wenigen Durchläufen der Schleifen sieht es so aus als ob die beiden Threads nacheinander ausgeführt werden.
// Dies ändert sich aber einer höheren Anzahl an Durchläufen und liegt wahrscheinlich an der Rechenleistung des Prozessors.