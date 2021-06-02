package com.registration.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.entity.User;
import com.registration.repository.UserRepository;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		userRepository.save(user);
		return user;
	}

	public String loginUser(User user) {
		long mobile = user.getMobile_no();
		List<User> list = userRepository.findUserBymobile_no(mobile);
		if (list.size() <= 0) {
			return "No Contact number found";
		} else if (list.get(0).getPassword().equals(user.getPassword())) {
			return "Login Successfully";
		} else {
			return "Incorrect Password";
		}
	}

	public ArrayList<String> permutationStrings(String string) {
		if (string.length() == 0) {
			ArrayList<String> empty = new ArrayList<>();
			empty.add("");
			return empty;
		}

		char ch = string.charAt(0);
		String subString = string.substring(1);
		ArrayList<String> oldresult = permutationStrings(subString);

		ArrayList<String> finalResult = new ArrayList<>();

		for (String val : oldresult) {
			for (int i = 0; i <= val.length(); i++) {
				finalResult.add(val.substring(0, i) + ch + val.substring(i));
			}
		}

		return finalResult;

	}

}
