package googlePlace.common.model;

public class Viewport {
	private Southwest southwest;
    private Northeast northeast;
    
	public Viewport(Northeast northeast , Southwest southwest) {
		this.northeast = northeast;
		this.southwest = southwest;
	}
	
	public Viewport() {
		this.northeast = null;
		this.southwest = null;
	}

	public Southwest getSouthwest() {
		return southwest;
	}

	public void setSouthwest(Southwest southwest) {
		this.southwest = southwest;
	}

	public Northeast getNortheast() {
		return northeast;
	}

	public void setNortheast(Northeast northeast) {
		this.northeast = northeast;
	}
    
	@Override
    public String toString()
    {
        return "Viewport [southwest = "+southwest+", northeast = "+northeast+"]";
    }
    
}
