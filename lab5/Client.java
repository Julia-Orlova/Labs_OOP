package lab5;

public class Client {
    private Text text;

    //конструктор доступ до глобальної змінної this дозволяє доступитися до тексту
    public Client(Text text) {
        this.text = text;
    }

    //вивід на екран результату
    public void startLiveInTheSystem() {
        System.out.println("Word's entrances quantity: " + text.findWordEntrancesQuantity("Hello"));
    }
}
