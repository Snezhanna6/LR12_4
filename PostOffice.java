package Main;

//Почтовое отделение
public class PostOffice implements State{


    @Override
    public void print() {
        System.out.println("Получение газет и журналов от печатного издания...");
    }

    @Override
    public State dispatch() {
        System.out.println("Отправка подписчикам...");
        return null;
    }
}
