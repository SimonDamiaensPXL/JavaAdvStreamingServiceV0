package be.pxl.ja.streamingservice.model;

public class Content {
    private String title;
    private Rating maturityRating;
    private String imageUrl;

    public Content(String title, Rating maturityRating) {
        this.title = title;
        this.maturityRating = maturityRating;
    }

    public Rating getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(Rating maturityRating) {
        this.maturityRating = maturityRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return title;
    }
}
