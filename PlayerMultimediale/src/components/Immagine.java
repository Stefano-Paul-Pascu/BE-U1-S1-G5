package components;

public abstract class Immagine extends Multimediale {
    private int luminosita;
    private String titolo;
    
    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }
    
    public int getLuminosita() {
        return luminosita;
    }
    
    public void aumentaLuminosita() {
        if (luminosita < 10) {
            luminosita++;
        }
    }
    
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
    
    @Override
    public void show() {
        String asterischi = "*".repeat(luminosita);
        System.out.println(titolo + " " + asterischi);
    }
}