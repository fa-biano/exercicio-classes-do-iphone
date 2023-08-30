package iphone_apps;

import interfaces.GenericFeatures;
import interfaces.InternetBrowserInterface;

public class InternetBrowser extends GenericFeatures implements InternetBrowserInterface {

    @Override
    public void loadWebPage() {
        System.out.println("Carregando pagina da internet...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba ao navegador...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando pagina...");
    }
}
