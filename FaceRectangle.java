public class FaceRectangle {
	private String left;
	private String top;
	private String width;
	private String height;
	public FaceRectangle(String left_, String top_, String width_, String height_){
		left = left_;
		top = top_;
		width = width_;
		height = height_;
	}
	public String getLeft(){
		return left;
	}
	public void setLeft(String value){
		left = value;
	}
	public String getTop(){
		return top;
	}
	public void setTop(String value){
		top = value;
	}
	public String getWidth(){
		return width;
	}
	public void setWidth(String value){
		width = value;
	}
	public String getHeight(){
		return height;
	}
	public void setHeight(String value){
		height = value;
	}
}
