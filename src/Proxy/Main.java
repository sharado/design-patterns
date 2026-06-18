package Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        OfficeInternetAccess access = new ProxyInternetAccess("ABC");
        access.grantInternetAccess();
    }

}