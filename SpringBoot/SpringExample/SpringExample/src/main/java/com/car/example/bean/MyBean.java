package car.example.bean;

import org.w3c.dom.ls.LSOutput;

public class MyBean {
    private String message;

    public void setMessage(String message){
        this.message=message;
    }
    public void showMessage(){
        System.out.println("message" + message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
