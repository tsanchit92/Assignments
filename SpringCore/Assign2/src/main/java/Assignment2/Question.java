package Assignment2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question
{
	
	private int questionId;
	private String question;
	public List<String>ans;
	public Map<Integer,String>m_ans;
	public Set<String>set_ans;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	public Map<Integer, String> getM_ans() {
		return m_ans;
	}
	public void setM_ans(Map<Integer, String> m_ans) {
		this.m_ans = m_ans;
	}
	public Set<String> getSet_ans() {
		return set_ans;
	}
	public void setSet_ans(Set<String> set_ans) {
		this.set_ans = set_ans;
	}
	
	public void getdetails()
	{
		System.out.println("QuestionNo "+getQuestionId());
		System.out.println("Question :"+getQuestion());
		System.out.println("Answers as List");
		Iterator<String> itr=ans.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		System.out.println("Answers as Set");
		Iterator<String> setitr=set_ans.iterator();
		while(setitr.hasNext())
		{
			String s=setitr.next();
			System.out.println(s);
		}
		System.out.println("Answers as Map");
		for(Map.Entry<Integer, String> entry:m_ans.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
