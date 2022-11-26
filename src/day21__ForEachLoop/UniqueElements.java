package day21__ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python", "Python", "Python", "Java"};

        for (String elements : words) {
            int counter = 0;

            for (String each : words) {
                if (each.equals(elements)) {
                    counter++;
                }
            }

            if (counter == 1) {
                System.out.println(elements);
            }
        }


    }

}
