package com;

public class Student {
 private int sid;
 private String spwd;
 private String sname;

    public Student(int sid, String spwd, String sname) {
        this.sid = sid;
        this.spwd = spwd;
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", spwd='" + spwd + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
