//Ned Ean
//Compute This
//April 12th 2017
package compute.pkgthis;

public class ComputeThis {

    public static void main(String[] args) {
        double sinan = 187;
        double cosan = 122;
        double sinrad = Math.toRadians(sinan);
        double cosrad = Math.toRadians(cosan);
        double cos = Math.cos(cosrad);
        double cosab = Math.abs(cos);
        
        double d1 = (3 * Math.PI * Math.sin(sinrad) + cosab);
        double d2 = ((Math.pow(14.72, 3.801)) + Math.log(72));
        
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
    
}
