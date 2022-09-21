/*package com.sajdaalavad.ui.rest.impl;



//dünyaya acilacak kapimiz (React;) bu kisimda iliskilendirecegiz.

    }

    //Save
    //http://localhost:8080/api/v1/employees
    @Override
    @PostMapping("/employees")
    public EmployeeDto createEmployee(@RequestBody  EmployeeDto employeeDto) {
        services.createEmployee(employeeDto);
        return employeeDto;
    }

    //List
    //http://localhost:8080/api/v1/employees
    @Override
    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> listem=services.getAllEmployee();
        return listem;
    }
    //Find
    //http://localhost:8080/api/v1/employees
    @Override
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable(name="id") Long id) {
        ResponseEntity<EmployeeDto> response= services.getEmployeeById(id);
        return response;
    }

    //Update
    //http://localhost:8080/api/v1/employees
    @Override
    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable(name="id") Long id,@RequestBody EmployeeDto employeeDto) {
        ResponseEntity<EmployeeDto> response=services.updateEmployee(id,employeeDto);
        return response.ok(employeeDto);
    }

    //Delete
    //http://localhost:8080/api/v1/employees
    @Override
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable(name="id") Long id) {
        services.deleteEmployee(id);
        Map<String,Boolean> response= new HashMap<>();
        response.put("silindi",Boolean.TRUE);
        return ResponseEntity.ok(response);
   } }*/

