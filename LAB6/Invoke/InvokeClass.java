package LAB6.Invoke;

public class InvokeClass {

    @Invoke
    public void hello() {
        System.out.println("Invoke вызван.");
    }

    public void notInvoked() {
        System.out.println("Не должен быть вызван.");
    }

    @Invoke
    private void secret() {
        System.out.println("Приватный invoke вызван.");
    }
}
