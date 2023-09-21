//package com.example.practice.controller;
//
//import com.example.practice.domain.Entity.response.RoomInfoResponse;
//import com.example.practice.domain.request.RoomSaveRequest;
//import com.example.practice.service.RoomService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/api/v1/room")
//@CrossOrigin(methods = {RequestMethod.POST}, allowCredentials = "true", originPatterns = "*")
//public class RoomController {
//    private final RoomService roomService;
//
//    @PostMapping("/save")
//    void save(@RequestBody RoomSaveRequest request){
//        roomService.save(request);
//    }
//
//    @PostMapping("/info/{roomId}")
//    RoomInfoResponse getById(@PathVariable("roomId") Long roomId){
//        return roomService.getById(roomId);
//    }
//
//}
