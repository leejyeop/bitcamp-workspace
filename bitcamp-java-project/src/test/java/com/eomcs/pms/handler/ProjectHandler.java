package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;


public class ProjectHandler {

  public static class Project {
    int no;
    String title;
    String content;
    String owner;
    String members;
    Date startDate;
    Date endDate;
  }

  static final int LENGTH = 100;
  static Project[] projects = new Project[LENGTH];
  static int size = 0;
  public  static void add() {
    System.out.println("[프로젝트 등록]");
    Project p = new Project();
    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");
    p.owner = Prompt.inputString("만든이? ");
    p.members = Prompt.inputString("팀원? ");
    projects[size++] = p;

  }

  public static void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < size; i++) {
      Project p = projects[i];
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }

}
