package googlePlace.common.model;
import java.util.ArrayList;
import java.util.List;

public class Opening_hours {
	
	private String open_now;
	private List<String> weekday_text;

    protected Opening_hours(){
    	this.weekday_text = new ArrayList<String>();
    }

	public Opening_hours(String open_now, List<String> weekday_text) {
		this.open_now = open_now;
		this.weekday_text = weekday_text;
	}

	public String getOpen_now() {
		return open_now;
	}

	public void setOpen_now(String open_now) {
		this.open_now = open_now;
	}

	public List<String> getWeekday_text() {
		return weekday_text;
	}

	public void setWeekday_text(List<String> weekday_text) {
		this.weekday_text = weekday_text;
	}

	@Override
    public String toString()
    {
        return "Opening hours [open_now = "+open_now+", weekday_text = "+weekday_text+"]";
    }
}