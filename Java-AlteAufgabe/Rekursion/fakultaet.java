
//Die o.a. Berechnung der Fakult�t kann auch iterativ gel�st werden:


public class fakultaet {
    public static void main(String[] args) {
        System.out.println(fakultaet(5));
    }
    private static int fakultaet(int n) {
        int i = 1;
        int result = 1;
        while(i<n) {
//        	i++;
//        	result=result*i;
        	result *=(++i);
        }
        return result;
    }
} 