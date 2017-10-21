public class TopLevel {
	private FaceRectangle faceRectangle;
	private Scores scores;
	public TopLevel(FaceRectangle faceRectangle_, Scores scores_){
		faceRectangle = faceRectangle_;
		scores = scores_;
	}
	public FaceRectangle getFaceRectangle(){
		return faceRectangle;
	}
	public void setFaceRectangle(FaceRectangle value){
		faceRectangle = value;
	}
	public Scores getScores(){
		return scores;
	}
	public void setScores(Scores value){
		scores = value;
	}
}
