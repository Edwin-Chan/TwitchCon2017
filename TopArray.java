import java.util.ArrayList;

public class TopArray {
	private ArrayList<TopLevel> list;
	public TopArray(TopLevel object) {
		list.add(object);
	}
	public ArrayList<TopLevel> getList(){
		return list;
	}
}