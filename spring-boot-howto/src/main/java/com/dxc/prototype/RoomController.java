package com.dxc.prototype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.prototype.data.entity.Room;
import com.dxc.prototype.data.repository.RoomRepository;

@RestController
@RequestMapping("/rooms")
public class RoomController {

	@Autowired
	private RoomRepository repos; 
	
	@GetMapping
	public Iterable<Room> getRooms(){
		return repos.findAll();
	}
}
