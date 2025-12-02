public class Demo {
    public static void main(String[] args) {
        TudoMaiuscula tm = new TudoMaiuscula();
        TudoMinuscula tmi = new TudoMinuscula();

        String original = "Olá, Java! ExEmPlo 123 ÁéÍ";

        System.out.println("Original:   " + original);
        System.out.println("Maiúsculas: " + tm.converterTextoEmMaiusculo(original));
        System.out.println("Minúsculas: " + tmi.converterTextoEmMinusculo(original));
    }
}