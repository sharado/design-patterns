package Proxy;

public class RealInternetAccess implements OfficeInternetAccess{
    String empName;

    public RealInternetAccess(String empName) {
        this.empName = empName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + empName);
    }
}
