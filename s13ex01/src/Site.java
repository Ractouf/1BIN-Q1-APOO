import java.util.ArrayList;

public class Site {
    private String url;
    private ArrayList<ContenuVideo> contenuVideos = new ArrayList<ContenuVideo>();

    public Site(String url) {
        if (url == null)
            throw new IllegalArgumentException("URL invalide");
        this.url = url;
    }

    public boolean ajouter(ContenuVideo contenuVideo) {
        if (contenuVideo == null)
            throw new IllegalArgumentException("contenu invalide");
        if (contenuVideos.contains(contenuVideo))
            return false;
        contenuVideos.add(contenuVideo);
        return true;
    }

    public boolean effacer(ContenuVideo contenuVideo) {
        if (contenuVideo == null)
            throw new IllegalArgumentException("contenu invalide");
        if (!contenuVideos.contains(contenuVideo))
            return false;
        contenuVideos.remove(contenuVideo);
        return true;
    }

    @Override
    public String toString() {
        String toString = "Site [url = www.supercontent.com]\n" + "Liste de contenus vidéos\n";
        if (contenuVideos.isEmpty())
            return toString + "\tAucun contenu vidéo";
        else {
            for (ContenuVideo contenuVideo : contenuVideos) {
                toString += "\t" + contenuVideo.toString() + "\n";
            }
            return toString;
        }
    }
}
