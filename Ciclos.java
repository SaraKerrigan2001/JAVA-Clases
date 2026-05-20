public class Ciclos {
    public static void main(String[] args) {
        
        int[] anArray = new int[10];

        
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (i + 1) * 100;
        }

        
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }
    }
}