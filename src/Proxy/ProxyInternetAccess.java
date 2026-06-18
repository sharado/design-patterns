package Proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{
    String empName;
    RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String empName) {
        this.empName = empName;
    }

    public int getRole(String empName){
        return 9;
    }

    @Override
    public void grantInternetAccess() {
        if(getRole(empName) > 5){
            realInternetAccess = new RealInternetAccess(empName);
            System.out.println(realInternetAccess);
            realInternetAccess.grantInternetAccess();
        }
        else{
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }
}
