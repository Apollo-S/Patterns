package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Angular", "Git", "Maven"};
        JavaDeveloper javaDeveloper  = new JavaDeveloper("Apollon", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("JavaDeveloper " + javaDeveloper.getName() + " skills:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
