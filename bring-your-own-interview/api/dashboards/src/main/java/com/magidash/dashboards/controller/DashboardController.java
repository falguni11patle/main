package com.magidash.dashboards.controller;


import com.magidash.dashboards.dto.DashboardResponse;
import com.magidash.dashboards.model.Dashboard;
import com.magidash.dashboards.repository.DashboardRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DashboardController {

    private final DashboardRepository dashboardRepository;

    public DashboardController(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    @GetMapping("/dashboards")
    public List<DashboardResponse> getDashboards() {
        List<Dashboard> dashboards = dashboardRepository.findAll();

        return dashboards.stream()
                .map(d -> new DashboardResponse(
                        d.getId(),
                        d.getCreatedAt() != null ? d.getCreatedAt().toString() : "",
                        d.getUpdatedAt() != null ? d.getUpdatedAt().toString() : "",
                        d.getTitle()
                ))
                .collect(Collectors.toList());

    }
}

