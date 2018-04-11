package com.company;

import java.util.ArrayList;

public class Calculatrice {
        int resultat;
        int valeurInitiale;
        ArrayList<String> inputCalculette;

        boolean Bplus;
        boolean Bmoins;
        boolean Bfois;
        boolean Bdiv;

        String plus = "+";
        String moins = "-";
        String egal = "=";
        String fois = "*";
        String div = "/";

        Calculatrice(boolean ordonne,String[] liste ){

                if(ordonne){

                        ArrayList<String> calculette = new ArrayList<>();
                        getInputCalculette(calculette, liste);
                        ordonne();
                }else {
                        desordonne(liste);
                }
        }



        public void ordonne(){
                int ct = 0 ;
                while (ct<this.inputCalculette.size()){
                        if (this.inputCalculette.get(ct).equals("/")){
                                this.inputCalculette.set(ct-1,String.valueOf(Integer.parseInt(this.inputCalculette.get(ct-1))/Integer.parseInt(this.inputCalculette.get(ct+1)))) ;
                                this.inputCalculette.remove(ct);
                                this.inputCalculette.remove(ct);
                                ct--;

                        }
                        if (this.inputCalculette.get(ct).equals("*")){
                                this.inputCalculette.set(ct-1,String.valueOf(Integer.parseInt(this.inputCalculette.get(ct-1))*Integer.parseInt(this.inputCalculette.get(ct+1)))) ;
                                this.inputCalculette.remove(ct);
                                this.inputCalculette.remove(ct);
                                ct--;
                        }
                        ct++;
                }

                ct=0;
                while (ct<this.inputCalculette.size()){
                        if (this.inputCalculette.get(ct).equals("+")){
                                this.inputCalculette.set(ct-1,String.valueOf(Integer.parseInt(this.inputCalculette.get(ct-1))+Integer.parseInt(this.inputCalculette.get(ct+1)))) ;
                                this.inputCalculette.remove(ct);
                                this.inputCalculette.remove(ct);
                                ct--;

                        }
                        if (this.inputCalculette.get(ct).equals("-")){
                                this.inputCalculette.set(ct-1,String.valueOf(Integer.parseInt(this.inputCalculette.get(ct-1))-Integer.parseInt(this.inputCalculette.get(ct+1)))) ;
                                this.inputCalculette.remove(ct);
                                this.inputCalculette.remove(ct);
                                ct--;

                        }
                        ct++;
                }
                this.resultat = Integer.parseInt(this.inputCalculette.get(0));
        }

        public void desordonne(String[] liste){
                this.valeurInitiale =Integer.parseInt(liste[0]);
                for (int i = 1; i <liste.length ; i++) {
                        String contenu = liste[i];
                        if (contenu.equals(egal)){
                                this.resultat = this.valeurInitiale;
                                break;
                        }

                        if (Bplus==true){
                                this.valeurInitiale+=Integer.parseInt(liste[i]);
                                Bplus=false;

                        }
                        if (Bdiv==true){
                                this.valeurInitiale/=Integer.parseInt(liste[i]);
                                Bdiv=false;
                        }

                        if (Bfois==true){
                                this.valeurInitiale*=Integer.parseInt(liste[i]);
                                Bfois=false;
                        }
                        if (Bmoins==true){
                                this.valeurInitiale-=Integer.parseInt(liste[i]);
                                Bmoins=false;
                        }
                        if(contenu.equals(plus)) Bplus=true;
                        if (contenu.equals(moins))Bmoins=true;
                        if (contenu.equals(div))Bdiv=true;
                        if (contenu.equals(fois))Bfois=true;
                }
        }

        public void  getInputCalculette(ArrayList<String> calculette,String[] liste ){
                for (int i = 0; i < liste.length; i++) {
                        calculette.add(liste[i]);
                }
                this.inputCalculette=calculette;
        }

        public int getResultat(){
                return resultat;
        }

        public void printResultat(){
                System.out.println(" = "+getResultat());
        }
}

