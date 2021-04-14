package tech.codingclub.Utility;

public class WikiResult {

    String query;
    String text_result;
    String image_Url;

    public WikiResult()
    {

    }
    public WikiResult(String query, String text_result, String image_Url) {
        this.query = query;
        this.text_result = text_result;
        this.image_Url = image_Url;
    }



}
