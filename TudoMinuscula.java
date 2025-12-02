public class TudoMinuscula extends ConversorTexto {
    public String converterTextoEmMinusculo(String entrada) {
        return converterTexto(entrada);
    }

    @Override
    protected char[] transformarCaracteres(char[] chars) {
        if (chars == null) return new char[0];
        char[] resultado = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toLowerCase(chars[i]);
        }
        return resultado;
    }
}