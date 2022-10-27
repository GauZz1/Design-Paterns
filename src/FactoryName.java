public class FactoryName {
    public Object getName(String name){
        if(name.contains(",")){
            return new nameWithComma(name);
        }
        else {
            return new nameWithoutComma(name);
        }
    }
}
