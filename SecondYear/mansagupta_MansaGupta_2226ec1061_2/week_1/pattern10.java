import java.util.Scanner;
public class pattern10{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in) ;
        int n = SC.nextInt();
        for(int i=n;i>=1;i--){
	        for(int j=1;j<=i;j++){
	            System.out.print(j+" ");
	        }
	        System.out.println();
	    }
    }
}

   
