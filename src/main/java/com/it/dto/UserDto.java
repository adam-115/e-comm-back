package com.it.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.it.model.User;

public class UserDto {
	private long id;
	private String firstName;
	private String lastName;
	private String login;
	private String password;

	public UserDto() {
		super();
	}

	public User toUserEntity() {
		return new User(firstName, lastName, login, password);
	}

	/**
	 *
	 * @param listUsersDto
	 * @return list of User as an entity
	 * 
	 */
	public List<User> toListOfUsersEntity(List<UserDto> listUsersDto) {
		// if list user dto is null ??
		if (listUsersDto == null) {
			return new ArrayList<User>();
		}
		return listUsersDto.stream().filter(userDto -> {
			return userDto != null;
		}).map((userDto) -> {

			return new User(userDto.getFirstName(), userDto.getLastName(), userDto.getLogin(), userDto.getPassword());
		}).collect(Collectors.toList());
	}

	public UserDto toUserDto(User user) {
		UserDto userDto = new UserDto();
		if (user == null) {
			return userDto;
		} else {
			userDto.setFirstName(user.getFirstName());
			userDto.setId(user.getId());
			userDto.setLastName(user.getLastName());
			userDto.setLogin(user.getLogin());
			userDto.setPassword(user.getPassword());
			return userDto;
		}

	}

	public List<UserDto> toUsersDto(List<User> usersList) {
		if (usersList == null) {
			return new ArrayList<UserDto>();
		} else {
			return usersList.stream().filter(user -> {
				return user != null;
			}).map((user) -> {
				UserDto userDto = new UserDto();
				userDto.setFirstName(user.getFirstName());
				userDto.setLastName(user.getLastName());
				userDto.setId(user.getId());
				userDto.setLogin(user.getLogin());
				userDto.setPassword(user.getPassword());
				return userDto;
			}).collect(Collectors.toList());

		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
