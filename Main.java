package Main;

public class Main {

    public static void main(String[] args) {

        Package pack = new Package();
        pack.setCurrentState(new Publication());

        pack.print();
        //Отправка почтовому отделению
        pack.dispatch();
        pack.print();
        //Отправка подписчикам
        pack.dispatch();

    }
}
