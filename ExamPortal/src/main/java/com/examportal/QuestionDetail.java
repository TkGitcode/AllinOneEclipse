package com.examportal;

public class QuestionDetail {

	
	String Qid;
	String Question;
	public QuestionDetail(String Qid,String Question) {
		
		this.Qid=Qid;
		this.Question=Question;
		
	}
	public String getQid() {
		return Qid;
	}
	public void setQid(String Qid) {
		this.Qid = Qid;
	}
	@Override
	public String toString() {
		return "UserDetail [Qid=" + Qid + ", Question=" + Question + "]";
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String Question) {
		this.Question = Question;
	}

}
