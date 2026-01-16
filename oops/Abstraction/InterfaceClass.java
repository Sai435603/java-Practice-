
// variables should be public static final only (interface set rules);

interface MusicPlayer {
    void playMusic();
    void click();
}

interface Camera {
    void takePhoto();
    void click();
}

class Smartphone implements MusicPlayer, Camera {

    public void playMusic() {
        System.out.println("Playing music");
    }
    
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    public void click() {
        System.out.println("clicked");
    }

}

class User{
    public static void main(String[] args){
        Smartphone smartphone = new Smartphone();
        smartphone.playMusic();
        smartphone.takePhoto();
        smartphone.click();
    }
}
