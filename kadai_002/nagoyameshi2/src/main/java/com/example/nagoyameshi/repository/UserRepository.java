package com.example.nagoyameshi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByEmail(String email);
	public Page<User> findByEmailContaining(String emailKeyword, Pageable pageable);

	public Page<User> findByNameLike(String nameKeyword, Pageable pageable);
	
	//idを指定してuserを取得する
		public User findUserById(int id);

}
