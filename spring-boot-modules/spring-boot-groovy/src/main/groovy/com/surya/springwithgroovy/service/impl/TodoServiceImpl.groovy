package com.surya.springwithgroovy.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.surya.springwithgroovy.entity.Todo
import com.surya.springwithgroovy.repository.TodoRepository
import com.surya.springwithgroovy.service.TodoService

@Service
class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository

    @Override
    List<Todo> findAll() {
        todoRepository.findAll()
    }

    @Override
    Todo findById(Integer todoId) {
        todoRepository.findById todoId get()
    }

    @Override
    Todo saveTodo(Todo todo){
        todoRepository.save todo
    }

    @Override
    Todo updateTodo(Todo todo){
        todoRepository.save todo
    }

    @Override
    Todo deleteTodo(Integer todoId){
        todoRepository.deleteById todoId
    }
}
