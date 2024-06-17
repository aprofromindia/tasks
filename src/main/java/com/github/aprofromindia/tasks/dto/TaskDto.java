package com.github.aprofromindia.tasks.dto;

import com.github.aprofromindia.tasks.entities.Priority;

public record TaskDto(long id, String name, boolean done, Priority priority, int version) {
}
