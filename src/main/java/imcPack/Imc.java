package imcPack;

public class Imc {
    Float poids;
    Float taille;

    public Imc(Float poids, Float taille) {
        this.poids = poids;
        this.taille = taille;
    }

    Float calcul() {
        return poids / (taille * taille);
    }
}
