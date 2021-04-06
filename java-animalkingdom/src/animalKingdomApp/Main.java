package animalKingdomApp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animals> animalList = new ArrayList<Animals>();

        // Mammals
        animalList.add(new Mammals("Panda", 1869));
        animalList.add(new Mammals("Zebra", 1778));
        animalList.add(new Mammals("Koala", 1816));
        animalList.add(new Mammals("Sloth", 1804));
        animalList.add(new Mammals("Armadillo", 1758));
        animalList.add(new Mammals("Raccoon", 1758));
        animalList.add(new Mammals("Bigfoot", 2021));

        // Birds
        animalList.add(new Birds("Pigeon", 1837));
        animalList.add(new Birds("Peacock", 1821));
        animalList.add(new Birds("Toucan", 1758));
        animalList.add(new Birds("Parrot", 1824));
        animalList.add(new Birds("Swan", 1758));

        // Fish
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        // animals in descending order by year
        animalList.sort((a1, a2) -> {
            return (a1.getYear() < a2.getYear())
                ? 1
                : -1;
        });

        // alphabetically
        animalList.sort((a1,a2) -> {
            return (a1.getName().compareTo(a2.getName()) > 0)
                ? 1
                : -1;
        });

        // animals in order by movement
        animalList.sort((a1,a2) -> {
            return (a1.getMove().compareTo(a2.getMove()) > 0)
                ? 1
                : -1;
        });
        
        // animals that breathe with lungs
        printFilteredAnimals(animalList, (a) -> a.getBreathe() == "lungs");

        // animals that breathe with lungs only found in 1758
        printFilteredAnimals(animalList, 
            (a) -> (a.getBreathe() == "lungs") && (a.getYear() == 1758)
        );

        // animals that lay eggs and breathe with lungs
        printFilteredAnimals(animalList,
            (a) -> (a.getReproduce() == "eggs") && (a.getBreathe() == "lungs")
        );

        // alphabetically discovered in 1758
        printFilteredAnimals(animalList, (a) -> a.getYear() == 1758);
        // .sort((a1,a2) -> {
        //     return (a1.getName().compareTo(a2.getName()) > 0)
        //         ? 1
        //         : -1;
        // });

        

        // mammals alphabetically
        // System.out.println(animalList);
    }

    public static void printFilteredAnimals(List<Animals> animalList, AnimalTester animalTester) {
        for (Animals a : animalList) {
            if (animalTester.test(a)) {
                System.out.println(a);
            }
        }
    }
}