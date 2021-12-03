package Main;

//Печатное издание
public class Publication implements State{

    @Override
    public void print() {
        System.out.println("Начало работы печатного издания...");
    }

    @Override
    public State dispatch() {
        return new PostOffice();
    }
}
