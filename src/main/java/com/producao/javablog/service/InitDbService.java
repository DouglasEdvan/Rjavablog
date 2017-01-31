package com.producao.javablog.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producao.javablog.entity.Blog;
import com.producao.javablog.entity.Item;
import com.producao.javablog.entity.Role;
import com.producao.javablog.entity.User;
import com.producao.javablog.repository.BlogRepository;
import com.producao.javablog.repository.ItemRepository;
import com.producao.javablog.repository.RoleRepository;
import com.producao.javablog.repository.UserRepository;


@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	
	@PostConstruct
	public void init(){
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleUser.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		
		Blog blogTreinos = new Blog();
		blogTreinos.setName("Test");
		blogTreinos.setUrl("");
		blogTreinos.setUser(userAdmin);
		blogRepository.save(blogTreinos);
		
		Item item1 = new Item();
		item1.setBlog(blogTreinos);
		item1.setTitle("first");
		item1.setLink("assim");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setBlog(blogTreinos);
		item2.setTitle("second");
		item2.setLink("foi");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);		
		
	}
	
	
}
