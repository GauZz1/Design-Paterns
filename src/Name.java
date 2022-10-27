import java.util.List;

public abstract class Name{
    public String nome;
    public String sobrenome;

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }
}

class nameWithComma extends Name {
    public nameWithComma(String name) {
        nameWithComma(name);
    }

    public void nameWithComma(String allName){
        List<String> formalized;
        formalized = List.of(allName.split(","));
        for (int i=formalized.size()-1; i>0; i--) {
            this.nome = formalized.get(i).trim();
            this.sobrenome = formalized.get(i-1).trim();
        }
    }
}

class nameWithoutComma extends Name {
    public nameWithoutComma(String name) {
        nameWithoutComma(name);
    }

    public String nameWithoutComma(String allName){
        String allNameSplited[] = allName.split(" ");
        this.nome = allNameSplited[0];
        this.sobrenome = allNameSplited[1];
        return this.nome + " " + this.sobrenome;
    }
}
