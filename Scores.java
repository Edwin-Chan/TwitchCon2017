public class Scores {
	private String anger;
	private String contempt;
	private String disgust;
	private String fear;
	private String happiness;
	private String neutral;
	private String sadness;
	private String surprise;
	public Scores(String anger_, String contempt_, String disgust_, String fear_, String happiness_, String neutral_, String sadness_, String surprise_){
		anger = anger_;
		contempt = contempt_;
		disgust = disgust_;
		fear = fear_;
		happiness = happiness_;
		neutral = neutral_;
		sadness  = sadness_;
		surprise = surprise_;
	}
	public String getAnger(){
		return anger;
	}
	public void setAnger(String value){
		anger = value;
	}
	public String getContempt(){
		return contempt;
	}
	public void setContempt(String value){
		contempt = value;
	}
	public String getDisgust(){
		return disgust;
	}
	public void setDisgust(String value){
		disgust = value;
	}
	public String getFear(){
		return fear;
	}
	public void setFear(String value){
		fear = value;
	}
	public String getHappiness(){
		return happiness;
	}
	public void setHappiness(String value){
		happiness = value;
	}
	public String getNeutral(){
		return neutral;
	}
	public void setNeutral(String value){
		neutral = value;
	}
	public String getSadness(){
		return sadness;
	}
	public void setSadness(String value){
		sadness = value;
	}
	public String getSurprise(){
		return surprise;
	}
	public void setSurprise(String value){
		surprise = value;
	}

}