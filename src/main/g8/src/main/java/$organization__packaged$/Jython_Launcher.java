package $organization$;

import ij.plugin.PlugIn;
import Jython.Refresh_Jython_Scripts;
 
public class Jython_Launcher implements PlugIn {
    public void run(String arg) {
        new Refresh_Jython_Scripts().runScript(getClass().getResourceAsStream(arg));
    }
}