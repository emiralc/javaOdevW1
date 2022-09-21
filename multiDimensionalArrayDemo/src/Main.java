public class Main {
    public static void main(String[] args) {
        String [][] sehirler=new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="izmir";
        sehirler[0][2]="adıyaman";
        sehirler[1][0]="trabzon";
        sehirler[1][1]="ankara";
        sehirler[1][2]="muğla";
        sehirler[2][0]="kars";
        sehirler[2][1]="adana";
        sehirler[2][2]="van";

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}