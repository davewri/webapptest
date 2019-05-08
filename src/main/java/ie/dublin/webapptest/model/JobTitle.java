package ie.dublin.webapptest.model;

public class JobTitle {
    private int titleId;
    private String titleType, titleDescription;

    //Constructor methods
    public JobTitle() {
    }

    public JobTitle(int titleId, String titleType, String titleDescription) {
        this.titleId = titleId;
        this.titleType = titleType;
        this.titleDescription = titleDescription;
    }

    //Getter and Setter Methods
    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }
}
