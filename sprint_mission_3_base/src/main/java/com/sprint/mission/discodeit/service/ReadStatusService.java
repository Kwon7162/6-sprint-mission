package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.DTO.Status.CreateReadStatusRequest;
import com.sprint.mission.discodeit.DTO.Status.UpdateReadStatusRequest;
import com.sprint.mission.discodeit.entity.ReadStatus;

import java.util.List;
import java.util.UUID;

public interface ReadStatusService {
    ReadStatus create(CreateReadStatusRequest request);
    ReadStatus find(UUID id);
    List<ReadStatus> findAllByUserId(UUID userId);
    ReadStatus update(UpdateReadStatusRequest request);
    void delete(UUID id);

}
