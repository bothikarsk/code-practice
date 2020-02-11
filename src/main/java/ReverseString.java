public class ReverseString {
    public static void main(String[] args) {
        String original = "Santosh";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Without using any function: " + reverse);

        StringBuilder stringBuilder= new StringBuilder();
        System.out.println("Inbuild function: "+ stringBuilder.append(original).reverse());
    }
}
