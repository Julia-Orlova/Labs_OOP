package lab5;

public class Main {

    //статичні методи
    private static void myMethod(){
        System.out.println("In my method");

    }

    //перевантаження
    private static void myMethod(int b){
        System.out.println("In my method(int b = " + b + ')');
    }


    public static void main(String[] args){

        Text text2 = new Text("Hello, world! Hello, Sun!");
        System.out.println(text2);


        //доступ клієнта до тексту
        Client client = new Client(text2);
        client.startLiveInTheSystem();

        //myMethod(1);
        //myMethod();
    }
}
