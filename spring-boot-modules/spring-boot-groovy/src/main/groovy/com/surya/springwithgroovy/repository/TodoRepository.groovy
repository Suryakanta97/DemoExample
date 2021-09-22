package com.surya.springwithgroovy.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import com.surya.springwithgroovy.entity.Todo

@Repository
interface TodoRepository extends JpaRepository<Todo, Integer> {}