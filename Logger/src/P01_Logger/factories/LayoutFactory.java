package P01_Logger.factories;

import P01_Logger.interfaces.Layout;
import P01_Logger.interfaces.LayoutCreator;
import P01_Logger.models.layouts.SimpleLayout;
import P01_Logger.models.layouts.XmlLayout;

public class LayoutFactory implements LayoutCreator {

    public Layout create(String layoutType) {
        switch (layoutType) {
            case "SimpleLayout":
                return new SimpleLayout();
            case "XmlLayout":
                return new XmlLayout();
            default:
                throw new IllegalArgumentException("Invalid layout type.");
        }
    }
}
