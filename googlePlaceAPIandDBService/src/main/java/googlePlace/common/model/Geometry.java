package googlePlace.common.model;


public class Geometry {
	private Viewport viewport;
    private Location location;
    
    public Geometry(){
    	this.viewport = null;
    	this.location = null;		
    }
    
	public Geometry(Location location,Viewport viewport) {
		this.viewport = viewport;
		this.location = location;
	}
	
	public Viewport getViewport() {
		return viewport;
	}
	
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
    public String toString()
    {
        return "Geometry [viewport = "+viewport+", location = "+location+"]";
    }
      
}
