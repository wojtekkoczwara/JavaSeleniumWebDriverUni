package selenium.wojtekkoczwara.Models;

public enum ThumbnailNames {

    CONTACT_US ("CONTACT US"),
    LOGIN_PORTAL ("LOGIN PORTAL"),
    BUTTON_CLICKS ("BUTTON CLICKS"),
    AJAX_LOADER("AJAX LOADER");

    public final String containedText;

    ThumbnailNames(String containedText) {
        this.containedText = containedText;
    }
}
