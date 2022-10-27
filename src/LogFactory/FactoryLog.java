package LogFactory;

public class FactoryLog {

    public Object getLog(String locationWord, String numeros){
        if(locationWord.equals("console")){
            return new consoleLog(numeros);
        }
        else if(locationWord.equals("arquivo")) {
            return new fileLog(numeros);
        }
        return null;
    }
}
