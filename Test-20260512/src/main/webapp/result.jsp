<%@ page language="java" contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="sungjuck.grade, sungjuck.Professor" %>
<%
    // --- 가상 데이터 설정 ---
    String inputProfId = "inha";    
    String studentId = "20241234";
    int java = 90;
    int db = 85;
    int security = 80;
    // ----------------------

    // 1. 객체 생성
    Professor profObj = new Professor();
    grade gradeObj = new grade();

    // 2. 교수 인증 (시퀀스 다이어그램 로직)
    boolean isAuth = profObj.checkProfessor(inputProfId);

    if (isAuth) {
        // 3. 인증 성공 시 성적 입력 및 계산 실행
        gradeObj.inputGrade(inputProfId, studentId, java, db, security);
        
        // 텍스트 출력 시작
        out.println("[ 성적 처리 결과 ]");
        out.println("교수 인증 상태: 성공 (ID: " + inputProfId + ")");
        out.println("----------------------------------");
        out.println("학생 학번: " + studentId);
        out.println("자바 점수: " + java);
        out.println("DB 점수: " + db);
        out.println("보안 점수: " + security);
        out.println("----------------------------------");
        out.println("총점: " + gradeObj.getTotal());
        out.println("평균: " + gradeObj.getAverage());
        out.println("최종 학점: " + gradeObj.getRating());
        out.println("----------------------------------");
    } else {
        // 4. 인증 실패 시
        out.println("[ 오류 ]");
        out.println("교수 인증 상태: 실패");
        out.println("메시지: 입력하신 ID(" + inputProfId + ")는 권한이 없습니다.");
    }
%>