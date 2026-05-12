package sungjuck;

public class grade {
    private String professorId;
    private String studentId;
    private int java;
    private int db;
    private int security;
    private int total;
    private int average; // UML에 int로 정의됨
    private String rating;

    // UML의 성적입력(교수id, 학생id, 자바, DB, 보안) : void 반영
    public void inputGrade(String pId, String sId, int j, int d, int s) {
        this.professorId = pId;
        this.studentId = sId;
        this.java = j;
        this.db = d;
        this.security = s;
        
        // 계산 로직
        this.total = j + d + s;
        this.average = this.total / 3;
        
        // 학점 판정 (조회 시 사용)
        if (this.average >= 90) this.rating = "A";
        else if (this.average >= 80) this.rating = "B";
        else this.rating = "C";
    }

    // 결과 출력을 위한 Getter 메소드들
    public int getTotal() { return total; }
    public int getAverage() { return average; }
    public String getRating() { return rating; }
}