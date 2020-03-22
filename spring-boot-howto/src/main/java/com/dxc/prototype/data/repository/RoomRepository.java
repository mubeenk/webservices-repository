package com.dxc.prototype.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dxc.prototype.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

	
}
