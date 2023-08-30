package iphone_apps;

import interfaces.GenericFeatures;
import interfaces.PhoneCallsInterface;

public class PhoneCalls extends GenericFeatures implements PhoneCallsInterface {

    @Override
    public void makeCall() {
        System.out.println("Realizando chamada para o telefone escolhido...");
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Abrindo Correio de Voz...");
    }
}
