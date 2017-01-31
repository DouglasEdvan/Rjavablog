package com.producao.javablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producao.javablog.entity.User;

public interface UserRepository extends JpaRepository< User , Integer> {

}
