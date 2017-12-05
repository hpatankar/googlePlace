package googlePlace.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Places")
public class PlaceResult {
    @Id
    private String id;
    private String next_page_token;
    private List<Result> results;
    private List<String> html_attributions;
    private String status;


    protected PlaceResult() {
        this.results = new ArrayList<Result>();
        this.html_attributions = new ArrayList<String>();
    }


	public PlaceResult(
			String next_page_token, 
			List<Result> results, 
			List<String> html_attributions,
			String status) {
		this.next_page_token = next_page_token;
		this.results = results;
		this.html_attributions = html_attributions;
		this.status = status;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNext_page_token() {
		return next_page_token;
	}


	public void setNext_page_token(String next_page_token) {
		this.next_page_token = next_page_token;
	}


	public List<Result> getResults() {
		return results;
	}


	public void setResults(List<Result> results) {
		this.results = results;
	}


	public List<String> getHtml_attributions() {
		return html_attributions;
	}


	public void setHtml_attributions(List<String> html_attributions) {
		this.html_attributions = html_attributions;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
    public String toString()
    {
        return "ClassPojo [next_page_token = "+next_page_token+", results = "+results+", html_attributions = "+html_attributions+", status = "+status+"]";
    }

	
}