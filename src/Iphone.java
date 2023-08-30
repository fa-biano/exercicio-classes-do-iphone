import iphone_apps.InternetBrowser;
import iphone_apps.MusicPlayer;
import iphone_apps.PhoneCalls;

public class Iphone {
    public static void main(String[] args) throws Exception {
        PhoneCalls phoneCalls = new PhoneCalls();
        MusicPlayer musicPlayer = new MusicPlayer();
        InternetBrowser internetBrowser = new InternetBrowser();

        System.out.println("Abrindo App Telefone...");
        phoneCalls.answerCall();
        phoneCalls.makeCall();
        phoneCalls.startVoiceMail();
        phoneCalls.goHome();
        System.out.println("\n");
        
        System.out.println("Abrindo App de Musicas...");
        musicPlayer.selectMusic();
        musicPlayer.play();
        musicPlayer.pause();
        musicPlayer.backMenu();
        musicPlayer.goHome();
        System.out.println("\n");
        
        System.out.println("Abrindo App de Internet...");
        internetBrowser.loadWebPage();
        internetBrowser.zommIn();
        internetBrowser.zoomOut();
        internetBrowser.refreshPage();
        internetBrowser.addNewTab();
        internetBrowser.goHome();
    }
}
