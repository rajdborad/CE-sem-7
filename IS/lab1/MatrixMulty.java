import javax.swing.plaf.synth.SynthSpinnerUI;

public class MatrixMulty{
    public static void main(String args[]){
        int a[][] = {{4,6,2},{9,4,2},{2,6,8}};
        int b[][] = {{5,7,2},{2,4,6},{4,8,2}};
        int c[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j] += a[i][k]*b[k][j]; 
                }
                // c[i][j] = c[i][j]%26;
                System.out.print(c[i][j]%26+" ");
            }
            System.out.println();
        }

    }
}
