package it.agilis.mens.plannings.server;

/**
 * Created by IntelliJ IDEA.
 * User: Giovanni La Torre
 * Date: 25/11/11
 * Time: 10.28
 * To change this template use File | Settings | File Templates.
 */
public class PropertiesManager {

    private String imageSource;
    private String externalUrlImage;
    private String certificatiFolder;

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public String getImageSource() {
        return imageSource;
    }

    public String getExternalUrlImage() {
        return externalUrlImage;
    }

    public void setExternalUrlImage(String externalUrlImage) {
        this.externalUrlImage = externalUrlImage;
    }

    public void setCertificatiFolder(String certificatiFolder) {
        this.certificatiFolder = certificatiFolder;
    }

    public String getCertificatiFolder() {
        return certificatiFolder;
    }
}
