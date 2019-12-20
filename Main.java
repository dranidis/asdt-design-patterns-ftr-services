/*
 * You should not change anything in this class!!!
 */
public class Main {

    public static void main(String a[]) {
        ServiceFactory psf = PremiumServiceFactory.getInstance();
        ServiceFactory ssf = StandardServiceFactory.getInstance();
        Service s1 = psf.makeService();
        Service s2 = ssf.makeService();

        s1.serve();
        s2.serve();
    }
}

/*
 * should output:
 * 
 * Premium Service 
 * Standard Service
 * 
 */
