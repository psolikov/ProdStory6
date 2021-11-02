import com.atlascopco.hunspell.Hunspell;
import com.atlascopco.hunspell.HunspellLibrary;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Spellchecker {

    public static void main(String[] args) throws URISyntaxException {
        URL resource = Spellchecker.class.getResource("index.dic");
        File dicPath = Paths.get(resource.toURI()).toFile();
        resource = Spellchecker.class.getResource("index.aff");
        File affPath = Paths.get(resource.toURI()).toFile();
        Hunspell speller = new Hunspell(dicPath.getAbsolutePath(), affPath.getAbsolutePath());
    }
}
