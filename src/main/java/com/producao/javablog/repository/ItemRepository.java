package com.producao.javablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producao.javablog.entity.Item;

public interface ItemRepository extends JpaRepository< Item , Integer> {

}
