package zoo;

public class Enclos {
    private int proprete = 10;
    private boolean endommage = false;

    public void degrader() {
        proprete -= 2;
        if (proprete <= 3) {
            endommage = true;
            System.out.println(" L'enclos est en mauvais état et doit être réparé !");
        }
    }

    public void reparer() {
        if (endommage) {
            endommage = false;
            proprete = 10;
            System.out.println(" L'enclos est maintenant en bonne état !");
        }
    }

    public boolean estEndommage() {
        return endommage;
    }

    public void nettoyer() {

    }
}
