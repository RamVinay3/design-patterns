package behavarioualPatterns.memento;

import java.util.Stack;

//care taker
public class ResumeHistory {
    private Stack<Resume.Memento> st;
    public ResumeHistory(){
        st=new Stack<>();
    }
    public void save(Resume resume){
        st.push(resume.save());
    }
    public void undo(Resume resume){
        if(!st.empty()){
            resume.restore(st.pop());
        }
    }
}
