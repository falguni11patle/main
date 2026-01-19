package com.magidash.dashboards.dto;


public class DashboardResponse {

    private Long id;
    private String createdAt;
    private String updatedAt;
    private String title;

    public DashboardResponse(Long id, String createdAt, String updatedAt, String title) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getTitle() {
        return title;
    }
}
