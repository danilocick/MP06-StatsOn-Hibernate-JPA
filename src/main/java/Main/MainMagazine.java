package Main;

import Entities.Equipo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MainMagazine {

    public static void main(String[] args)  {
        ArrayList<Equipo> equipos = new ArrayList();
        FileAccessor fa = null;

        Menu menu = new Menu();
        int opcio;

        opcio = menu.menuPral();

        switch (opcio) {

            case 1:

                System.out.println("1!!");
                break;

            case 2:
                System.out.println();
                System.out.println();
                break;

            default:
                System.out.println("Adeu!!");
                System.exit(1);
                break;

        }

    }
//    public static void mostraRevistes(ArrayList<Revista> revistes){
//        for (Revista revista : revistes) {
//
//            System.out.println(revista.toString());
//            for (int j = 0; j < revista.getArticles().size(); j++) {
//                System.out.println("\t"+ revista.getArticle(j).toString());
//                System.out.println("\t\t"+revista.getArticle(j).getAutor().toString());
//            }
//
//        }
//    }
//
//    public static Revista seleccionaRevista(ArrayList<Revista> revistes){
//        Scanner sc = new Scanner(System.in);
//
//        for(Revista revista : revistes ){
//            System.out.println(revista.toString());
//        }
//        int x = sc.nextInt();
//        for(Revista revista : revistes ){
//            if (revista.getId_revista()==x){
//                return revista;
//            }
//        }
//        return null;
//    }
//
//    public static Article seleccionaArticle(Revista revista){
//        Scanner sc = new Scanner(System.in);
//
//        for(Article article : revista.getArticles()){
//            System.out.println(article);
//        }
//        int x = sc.nextInt();
//        for(Article article : revista.getArticles()){
//            if (revista.getId_revista()==x){
//                return article;
//            }
//        }
//        return null;
//    }



}