import java.util.ArrayList;

class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        //Create an ArrayList using Generics here
        System.out.println(random.contains(5f));

        printArray(random);
    }

    public static void printArray(ArrayList<Float> arr) {

        for(Number f : arr){
            System.out.println(f.floatValue());
        }
    }
}
