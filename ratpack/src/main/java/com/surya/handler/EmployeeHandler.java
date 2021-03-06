package com.surya.handler;

import com.surya.repository.EmployeeRepository;
import com.surya.model.Employee;
import ratpack.exec.Promise;
import ratpack.handling.Context;
import ratpack.handling.Handler;

public class EmployeeHandler implements Handler {
    @Override
    public void handle(Context ctx) throws Exception {
        EmployeeRepository repository = ctx.get(EmployeeRepository.class);
        Long id = Long.valueOf(ctx.getPathTokens()
            .get("id"));
        Promise<Employee> employeePromise = repository.findEmployeeById(id);
        employeePromise.map(employee -> employee.getName())
            .then(name -> ctx.getResponse()
                .send(name));
    }
}
