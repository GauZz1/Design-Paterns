package FactoryMethod.FileFactory;

public class FactoryFile {
    public Object getFile(String password){
        if(password.equals("designpatterns")){
            return new confidentialFile();
        }
        else {
            return new publicFile();
        }
    }
}