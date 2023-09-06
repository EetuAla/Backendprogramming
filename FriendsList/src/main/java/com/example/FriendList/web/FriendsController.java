package com.example.FriendList.web;

import com.example.FriendList.domain.Friends;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendsController {
	private final List<Friends> friends = new ArrayList<>();

	@GetMapping("/index")
	public String index(Model model) {
        model.addAttribute("friends", friends);
        return "friends";
    }
	 @PostMapping("/addFriend")
	    public String addFriend(@RequestParam String friendName) {
	        Friends friend = new Friends();
	        friend.setName(friendName);
	        friends.add(friend);
	        return "redirect:/index";
	    }
}
