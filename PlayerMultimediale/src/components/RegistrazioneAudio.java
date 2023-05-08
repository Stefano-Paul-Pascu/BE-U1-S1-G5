package components;

public class RegistrazioneAudio extends Multimediale {
    private int volume;
    
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }
    
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
        }
    }
    
    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println(getTitolo());
        }
    }
}