package day11;

public class StudentCourse {

    private int sid;
    private int cid;

    public StudentCourse(int sid, int cid) {
        this.sid = sid;
        this.cid = cid;
    }

    public StudentCourse() { }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
