package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.User;
import java.util.List;
import java.util.UUID;

public interface UserService {
    void createUser(String name);
    User getUser(UUID id);
    List<User> getUsers();
    void updateUser(UUID id, String newName);
    void deleteUser(UUID id);
}
