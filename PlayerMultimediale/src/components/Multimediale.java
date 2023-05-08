package components;

public abstract class Multimediale {
    private String titolo;
    private int durata;
    
    public Multimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }
    
    public String getTitolo() {
        return titolo;
    }
    
    public int getDurata() {
        return durata;
    }
    
    public abstract void play();

	public void show() {
	}
}