public abstract class ConversorTexto {
    // Template method
    public final String converterTexto(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] transformados = transformarCaracteres(caracteres);
        return juntarCaracteres(transformados);
    }

    // implementação comum
    protected char[] extrairCaracteres(String texto) {
        return texto == null ? new char[0] : texto.toCharArray();
    }

    // extensão específica das subclasses
    protected abstract char[] transformarCaracteres(char[] chars);

    // implementação comum
    protected String juntarCaracteres(char[] chars) {
        return new String(chars);
    }
}