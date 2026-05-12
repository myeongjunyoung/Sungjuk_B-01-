package sungjuck;

public class Professor {
    private String professorId;

    // UML의 교수체크(교수id) : boolean 반영
    public boolean checkProfessor(String id) {
        // 시퀀스 다이어그램 조건: ID가 "inha"일 때만 true 반환
        return "inha".equals(id);
    }
}