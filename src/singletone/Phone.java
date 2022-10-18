package singletone;

public class Phone { //Singletone
    private static Phone phone = null;

    private Phone(){}

    public static Phone getInstance(){
        if(phone==null){
            phone = new Phone();
        }
        return phone;
    }
}
