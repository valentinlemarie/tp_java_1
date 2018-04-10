package com.company;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

import static java.lang.Integer.parseInt;

public class Main {




    public static void main(String[] args) {
	// write your code here
        int a = 5 ;
        int b = 9 ;
        int d = 10 ; int e = 12,f;
        int count = 0 ;
        Date today = new Date();
        boolean bool_a = true;
        boolean bool_b = false;
        boolean stop = false;


        System.out.println("Date "+ today);

        System.out.println("HelloWorld \n a = "+a+"\n b = "+b);
        b = b-a ;
        System.out.println("soutraction b-a = "+b);
        float c = (float) (2*a+0.5);
        System.out.println("floatant c : "+c);


        System.out.print("true || false ");
        if(bool_a||bool_b )
        {
            System.out.println("   addition");
            f = d + e ;
        }else {
            System.out.println("   soustraction");
            f= d - e ;
        }

        System.out.print("true && false ");
        if(bool_a && bool_b)
        {
            System.out.println("   superieur");
            f++;
        }else {
            System.out.println("   inferieur");
            f--;
        }
        System.out.println("valeur variable apres condition  : "+f);


        System.out.println("\n");


        for(int i = 0 ; i<=10; i++) {
            System.out.print(i+" ");
        }

        System.out.println("");
        for(int j = 0 ; j<=10; j+=2) {
            System.out.print(j+" ");
        }

        System.out.println("");
        for(int j = 0 ; j<=10; j+=2) {
            System.out.print(j+" ");
            if(j==6) break;
        }


        System.out.println("\nvaleur initiale de count : "+count);
        while(count<5) {
            count++ ;
            System.out.print(count+" ");
        }

        System.out.println("\ndo while");
        count = 0 ;
        do{
            count++ ;
            stop = true ;
            System.out.print(count+" ");
        }while(count<5 && !stop);

        System.out.println("\n");

        String maChaine = new String("Hello");
        // string maChaine = "Hello";
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        if(str1 == str2 ) System.out.println("test incorect");
        if(str1.equals((str2))) System.out.println("test correct !NPE ");
        if(StringUtils.equals(str1,str2))System.out.println("test correct common-lang ");;


        System.out.println("\n");

        String str3 = str1.concat(str2);
        System.out.println(str3);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder =stringBuilder.append(str1).append(" avec StringBulder");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer = stringBuffer.append(str1).append(" avec StringBuffer");
        System.out.println(stringBuffer);


        System.out.println("");

        int[] array = new int[10]; // allocation tab
        int[] array2 = array ; // copie de la référence

        array[4] = 2 ;
        System.out.println(array2[4]);// array changé mais array 2 aussi

        int[] array3 = new int[10]; // allocation tab
        int length = array3.length;
        System.out.println(length);
        System.out.println(array3.length);

        int[][] matrix;
        matrix = new int[10][];
        for (int row = 0; row <matrix.length ; row++) {
            matrix[row] = new int[5];
            //matrix = new int[10][5];
        }
         int[][] arrayTab = new int[10][];
        for (int row = 0; row < arrayTab.length ; row++) {
            arrayTab[row] = new int[row+1];
        }

        System.out.println("\n");

        String[][] couleur =  new String[5][2];
        couleur[0][0]="blue";
        couleur[0][1]="vert";
        couleur[1][0]="rouge";
        couleur[1][1]="orange";
        couleur[2][0]="gris";
        couleur[2][1]="violet";
        couleur[3][0]="noir";
        couleur[3][1]="maron";
        couleur[4][0]="blanc";
        couleur[4][1]="jaune";

        for (int i = 0; i <couleur.length ; i++) {
            System.out.println("couleur :"+couleur[i][0]+" "+couleur[i][1]);
        }

        System.out.println("\n");

        System.out.println(Language.FR.toString());
        System.out.println(Language.ES.toString());
        System.out.println(Language.EN.toString());
        System.out.println(Language.DE.toString());

        System.out.println("\n");

        Counter c1 = new Counter(2,10);
        Counter c2 = new Counter(22);
        Counter c3 = new Counter();
        c3.init(4,8+12);
        c3.count();c3.count();
        System.out.println("counter 1 position :"+c1.position+"  step : "+c1.step);
        System.out.println("counter 2 position :"+c2.position+"  step : "+c2.step);
        System.out.println("counter 3 changement objet -> position :"+c3.position+"  step : "+c3.step);
        System.out.println("counter 3 consulte objet   -> position :"+c3.getPosition());

        Counter counter1 = new Counter();
        Counter counter2 = counter1;
        counter1.position = 10 ;
        if(counter1.position == counter2.position){
            System.out.println("egalite instance de classe");
        }

        String plus = "+";
        String moins = "-";
        String egal = "=";
        String fois = "*";
        String div = "/";

        boolean Bplus = false;
        boolean Bmoins = false;
        boolean Bfois = false;
        boolean Bdiv = false;
        //int m = Integer.parseInt("+");
        int valeur =Integer.parseInt(args[0]);
        System.out.print(valeur+" ");
        for (int i = 1; i <args.length ; i++) {
            String contenu = args[i];

            if (contenu.equals(egal)){
                System.out.println("\nRésultat calculettte : "+valeur);
            }else {
                System.out.print(args[i]+" ");
            }

            if (Bplus==true){
                valeur+=Integer.parseInt(args[i]);
                Bplus=false;

            }
            if (Bdiv==true){
                valeur=valeur/Integer.parseInt(args[i]);
                Bdiv=false;
            }

            if (Bfois==true){
                valeur=valeur*Integer.parseInt(args[i]);
                Bfois=false;
            }
            if (Bmoins==true){
                valeur= valeur-Integer.parseInt(args[i]);
                Bmoins=false;
            }
            if(contenu.equals(plus)) Bplus=true;
            if (contenu.equals(moins))Bmoins=true;
            if (contenu.equals(div))Bdiv=true;
            if (contenu.equals(fois))Bfois=true;
        }

        counter1 = null ;
        counter2 = null ;
        c1 = null ;
        c2 = null ;
        c3 = null ;
        couleur = null ;
        array = null ;
        array2 = null ;
        array3 = null ;
        arrayTab = null ;
        matrix = null ;
    }
}
