import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      //1
        Random r = new Random();
        int[] arr=new int[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = r.nextInt(21) - 10;


        int maxNum = arr[0];
        int minNum=arr[0];
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
            maxNum = Math.max(arr[i], maxNum);
            minNum = Math.min(arr[i], minNum);

        }
        System.out.println("MIN " + minNum);
        System.out.println("MAX " + maxNum);




       int sum = Arrays.stream(arr).sum();
       double avg = (double)sum / arr.length;
        System.out.println(avg);

        int lessThan=0;
        int greaterThan=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg)  {
                greaterThan++;
            }else if(arr[i]<avg){
                lessThan++;
            }
        }
        System.out.println("Mniejszych niz srednia " + lessThan);
        System.out.println("Wiekszych niz " + greaterThan);

//        for(int i=arr.length-1;i>=0;i--)
//            System.out.print(arr[i] + " ");

        //2
        int[][] arr2= new int[5][5];
        for (int i = 0; i < arr2.length; i++) {

            for(int j = 0; j < arr2[i].length; j++) {
               arr2[i][j]=r.nextInt(10)-5;
                System.out.print(arr2[i][j]+" ");

            }
            System.out.println("");

        }
        int[] max2d=new int[5];
        int[] min2d=new int[5];
        max2d[0]=arr2[0][0];
        max2d[1]=arr2[1][0];
        max2d[2]=arr2[2][0];
        max2d[3]=arr2[3][0];
        max2d[4]=arr2[4][0];
        min2d[0]=arr2[0][0];
        min2d[1]=arr2[1][0];
        min2d[2]=arr2[2][0];
        min2d[3]=arr2[3][0];
        min2d[4]=arr2[4][0];

        for (int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length;j++) {
                max2d[j] =  Math.max(max2d[j],arr2[j][i]);
                min2d[j] =  Math.min(min2d[j],arr2[j][i]);
            }
        }
        for (int i = 0; i < min2d.length; ++i) {
            System.out.println("MIN w kolumnie "+i+" "+min2d[i]);

        }
        for (int i = 0; i < max2d.length; ++i) {
            System.out.println("MAX w kolumnie "+i+" "+max2d[i]);

        }
//3
System.out.println("Podaj liczbe");
            Scanner myObj = new Scanner(System.in);
            int value = myObj.nextInt();
            int value_copy = value;

            int[] bitArr = new int[32];

            if (value < 0) {
                bitArr[0] = 1;
            }

            for (int i = 31; i > 0; i--) {
                bitArr[i] = Math.abs(value % 2);
                value = value / 2;
            }

            System.out.println("liczba " + Integer.toString(value_copy) + " binarne to:");
        for (int i = 0; i < bitArr.length; ++i) {
            if(i==0){
                System.out.print(bitArr[0]+".");

            }else{
                System.out.print(bitArr[i]);

            }


        }

          //4
        System.out.println("Podaj liczbe");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] c = new char[n][n];


        for (int i = 0; i < c.length; i++) {
            var str1 = "";
            for (int j = 0; j < c.length; j++) {
                c[i][j] = czyNwd(i + 1, j + 1) ? '+' : '.';
                str1 += c[i][j] + " ";
            }
            System.out.println(str1);

        }


        //5
        System.out.println("Podaj znak");
        Scanner sc = new Scanner(System.in);


        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int licznikOstatniaLitera = 0;
        int suma= 0;

        for (char znak : chars) {
            if (znak == chars[chars.length - 1]) {
                licznikOstatniaLitera++;
            }


        }

        System.out.println("Ilosc ostatniej litery: " + Integer.toString(licznikOstatniaLitera ));
       //6
        for (char znak : chars) {

            if (Character.isDigit(znak)) {
                suma += (int) znak - 48;
            }
        }
        System.out.println("Suma cyfr z tekstu: " + Integer.toString(licznikOstatniaLitera ));

        //7
        System.out.println("Podaj znak (szyrf Cezara)");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        System.out.println("Podaj liczbe");

        int offs = sc1.nextInt();
        char[] chars1 = str1.toCharArray();

        for (int i = 0; i < str1.length(); i++) {


            chars1[i] = (char) ((chars1[i] + offs) % (int) 'a' + (int) 'a');
        }


        System.out.println(chars1);

//end main
    }


    static boolean czyNwd(int a, int b) {
        return (sprNwd(a, b) == 1);
    }

    private  static int sprNwd(int a, int b) {
        return (a == 0) ? b : sprNwd(b % a, a);
    }

}
