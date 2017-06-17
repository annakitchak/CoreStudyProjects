package parlament;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 3/15/2017.
 */
public class Parlament {


    private static Parlament parlament;

    private List<Fraction> fractions = new ArrayList<>();


    public static Parlament getInstance(){
        if(parlament == null){
            parlament = new Parlament();
        }
        return parlament;
    }

    public void addFractionIntoParlament(){
        System.out.println("enter name of new fraction");

        String fractionName = Main.scanner.next();


        boolean fractionExist = false;

        for (Fraction fraction : fractions) {

            if(fraction.getName().equalsIgnoreCase(fractionName)){
                System.out.println("fraction already exist");
            }

        }

        if(!fractionExist){
            fractions.add(new Fraction(fractionName));
        }

    }


    public void deleteFractionFromParlament(){
        System.out.println("enter name of fraction for delete");

        String fractionName = Main.scanner.next();

        if(fractions.contains(new Fraction(fractionName))){
            System.out.println("this fraction already exist");
        }else{

            Iterator<Fraction> iterator = fractions.iterator();

            while(iterator.hasNext()){
                if(iterator.next().getName().equals(fractionName)){
                    iterator.remove();
                }
            }

        }

    }

    public void showAllFraction(){

        if(fractions.isEmpty()){
            System.out.println("don't have any fraction");
        }else{
            System.out.println("list of fractions");
            for (Fraction fraction : fractions) {
                System.out.println(fraction);
            }
        }

    }

    public void addDeputyIntoFraction(){

        System.out.println("enter name of fraction");

        String nameFraction = Main.scanner.next();

        boolean exist = false;

        for (Fraction fraction : fractions) {

            if(fraction.getName().equalsIgnoreCase(nameFraction)){

                fraction.addDeputyIntoAFraction();
                exist =  true;
            }

        }

        if(!exist){
            System.out.println("don't have fraction with this name");
        }



    }

    public void deleteDeputyFromFraction(){

        System.out.println("enter name of fraction for delete deputy");

        String nameFraction = Main.scanner.next();

        boolean exist = false;

        for (Fraction fraction : fractions) {

            if(fraction.getName().equalsIgnoreCase(nameFraction)){

                fraction.deleteDeputyFromFraction();
                exist =  true;
            }

        }

        if(!exist){
            System.out.println("don't have fraction with this name");
        }



    }

    public void cleanFraction(){

        System.out.println("enter name of fraction for clean");

        String nameFraction = Main.scanner.next();

        boolean exist = false;

        for (Fraction fraction : fractions) {

            if(fraction.getName().equalsIgnoreCase(nameFraction)){

                fraction.cleanFraction();
                exist =  true;
            }

        }

        if(!exist){
            System.out.println("don't have fraction with this name");
        }



    }

    public void showAllBribersFromFraction(){

        System.out.println("enter name of fraction");

        String nameFraction = Main.scanner.next();

        boolean exist = false;

        for (Fraction fraction : fractions) {

            if(fraction.getName().equalsIgnoreCase(nameFraction)){

                fraction.showAllBriberFromFraction();
                exist =  true;
            }

        }

        if(!exist){
            System.out.println("don't have fraction with this name");
        }



    }



    public void showMaxBriberFromFraction(){

        System.out.println("enter name of fraction");

        String nameFraction = Main.scanner.next();

        boolean exist = false;

        for (Fraction fraction : fractions) {

            if(fraction.getName().equalsIgnoreCase(nameFraction)){

                fraction.showMaxBriberTakerFromFraction();
                exist =  true;
            }

        }

        if(!exist){
            System.out.println("don't have fraction with this name");
        }



    }






    public void showAlldeputyFromFraction(){

        System.out.println("enter name of fraction ");

        String nameFraction = Main.scanner.next();

        boolean exist = false;

        for (Fraction fraction : fractions) {

            if(fraction.getName().equalsIgnoreCase(nameFraction)){

                fraction.showAllDeputyFromFraction();
                exist =  true;
            }

        }

        if(!exist){
            System.out.println("don't have fraction with this name");
        }

    }


    public void start(){

        boolean work = true;

        while (work){

            System.out.println("enter 1 for add fraction");
            System.out.println("enter 2 for delete fraction");
            System.out.println("enter 3 for clean fraction");
            System.out.println("enter 4 for show all fraction");
            System.out.println("enter 5 for show one fraction");
            System.out.println("enter 6 for add deputy into  fraction");
            System.out.println("enter 7 for delete deputy from fraction");
            System.out.println("enter 8 for show all briber from fraction");
            System.out.println("enter 9 for show max briber fom fraction");
            System.out.println("enter 10 for exit");

            String choice = Main.scanner.next();

            switch (choice){

                case "1" :{
                    addFractionIntoParlament();
                    break;
                }case "2" :{
                    deleteFractionFromParlament();
                    break;
                }case "3" :{
                    cleanFraction();
                    break;
                }case "4" :{
                    showAllFraction();
                    break;
                }case "5" :{
                    showAlldeputyFromFraction();
                    break;
                }case "6" :{
                    addDeputyIntoFraction();
                    break;
                }case "7" :{
                    deleteDeputyFromFraction();
                    break;
                }case "8" :{
                    showAllBribersFromFraction();
                    break;
                }case "9" :{
                    showMaxBriberFromFraction();
                    break;
                }case "10" :{
                    work = false;
                    break;
                }default:{
                    System.out.println("wrong input");
                }

            }




        }




    }








}
