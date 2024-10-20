# usu
# install MySql https://dev.mysql.com/downloads/windows/installer/8.0.html
# set user admin and password admin
# open MySql workbench and run script employee-directory.sql (part of hr project structure)

# application run on localhost with default port 8080
# database run on localhost with port 3306

# endpoints:
# retrieve list of employees
# GET http://localhost:8080/api/employees

# add employee
# POST http://localhost:8080/api/employees

# delete employee
# DELETE http://localhost:8080/api/employees/{employeeId}

# get statistic
# GET http://localhost:8080/api/employees/statistic