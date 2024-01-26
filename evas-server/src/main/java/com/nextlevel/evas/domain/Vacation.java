package com.nextlevel.evas.domain;

import java.time.LocalDate;

public class Vacation {

  private int idx;
  private String code;
  private LocalDate start;
  private LocalDate end;
  private String content;

  private Float period;
  private String type;              // 기본 값 : 개인 연차 (P), 전체 연차 (C)
  private String approvalStatus;    // 기본 값 : 대기 (W), 승인 (A), 거절 (R), 취소 대기 (CW), 취소 (C)
  private String useStatus;         // 기본 값 : 미사용 (R), 사용 (U)

  private String employeeId;

  private String rejectionContent;

  public int getIdx() {
    return idx;
  }

  public void setIdx(int idx) {
    this.idx = idx;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }

  public LocalDate getEnd() {
    return end;
  }

  public void setEnd(LocalDate end) {
    this.end = end;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Float getPeriod() {
    return period;
  }

  public void setPeriod(Float period) {
    this.period = period;
  }

  public String getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public String getUseStatus() {
    return useStatus;
  }

  public void setUseStatus(String useStatus) {
    this.useStatus = useStatus;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getRejectionContent() {
    return rejectionContent;
  }

  public void setRejectionContent(String rejectionContent) {
    this.rejectionContent = rejectionContent;
  }

}
