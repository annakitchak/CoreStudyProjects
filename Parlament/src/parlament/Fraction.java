package parlament;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by admin on 3/14/2017.
 */
public class Fraction {

    private String name;

    private List<Deputy> deputies = new ArrayList<>();

    public Fraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                ", deputies=" + deputies +
                '}';
    }

    public void addDeputyIntoAFraction() {
        System.out.println("enter name of deputy");
        String name = Main.scanner.next();
        System.out.println("enter surname of deputy");
        String surname = Main.scanner.next();
        System.out.println("enter age of deputy");
        int age = Main.scanner.nextInt();
        System.out.println("does deputy is briber? enter true of false");
        String isBriber = Main.scanner.next();


        boolean briber;

        if (isBriber.equalsIgnoreCase("true")) {
            briber = true;

        } else {
            briber = false;

        }

        Deputy deputy = new Deputy(name, surname, age, briber);
        deputy.giveBribe();
        deputies.add(deputy);

    }

    public void deleteDeputyFromFraction() {
        System.out.println("enter name of deputy for remove");
        String name = Main.scanner.next();
        System.out.println("enter surname of deputy for remove");
        String surname = Main.scanner.next();

        Iterator<Deputy> iterator = deputies.iterator();

        boolean deleted = false;

        while (iterator.hasNext()) {
            Deputy deputy = iterator.next();

            if (deputy.getName().equalsIgnoreCase(name)
                    && deputy.getSurname().equalsIgnoreCase(surname)) {
                iterator.remove();
                deleted = true;
            }

        }
        if (!deleted) {
            System.out.println("does'n have deputy for delete");
        }


    }

    public void showAllBriberFromFraction() {

        boolean existBriber = false;

        if (deputies.isEmpty()) {
            System.out.println("doesn't have any deputies");
        } else {

            for (Deputy deputy : deputies) {
                if (deputy.isBriber()) {
                    System.out.println(deputy);
                    existBriber = true;
                }
            }

            if (!existBriber) {
                System.out.println("don't have briber in fraction");
            }
        }


    }

    public void showMaxBriberTakerFromFraction() {

        Deputy deputy;
        if (deputies.isEmpty()) {
            System.out.println("don't have any deputy in fraction");
        } else {

            deputy = deputies.get(0);

            for (Deputy currentDeputy : deputies) {

                if (currentDeputy.getSizeOfBribe() > deputy.getSizeOfBribe()) {
                    deputy = currentDeputy;
                }

            }

            System.out.println("max briber = " + deputy);

        }


    }


    public void showAllDeputyFromFraction() {
        if (deputies.isEmpty()) {
            System.out.println("don't have any deputy in fraction");
        } else {

            System.out.println("list of deputies");

            for (Deputy deputy : deputies) {
                System.out.println(deputy);
            }

        }
    }


    public void cleanFraction() {
        if (deputies.isEmpty()) {
            System.out.println("don't have any deputy in fraction for clear");
        } else {
            deputies.clear();
            System.out.println("fraction was clean");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (name != null ? !name.equals(fraction.name) : fraction.name != null) return false;
        return deputies != null ? deputies.equals(fraction.deputies) : fraction.deputies == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (deputies != null ? deputies.hashCode() : 0);
        return result;
    }
}
