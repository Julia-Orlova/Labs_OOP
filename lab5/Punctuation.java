package lab5;

public class Punctuation extends SentenceElement {
    //створення полів
    private String symbols;

    //створення конструктора для символів:)
    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    //методом toString() виводимо знаки пунктуації
    @Override
    public String toString() {
        return symbols ;
    }
}
