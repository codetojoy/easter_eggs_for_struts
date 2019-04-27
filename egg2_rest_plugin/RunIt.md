
### Notes

* use Tomcat 8
    * .e.g ~/tools/tomcat_8_5_32_5151
* `./go_build_and_deploy.sh`
    * see link in output
* see `EmployeeRepository` for a simple repo with toy seed data

### Example GET

```
./test_get_employees.sh
./test_get_employee_by_id.sh 111
./test_get_edit_employee_by_id.sh 111
./test_get_edit_new_employee.sh
```

### Example POST

* see `~/data` for JSON files

```
./test_get_employee_by_id.sh 111
./test_post_employee.sh liszt.json
./test_get_employee_by_id.sh 334
./test_get_employees.sh
```

### Example PUT

* see `~/data` for JSON files

```
./test_get_employee_by_id.sh 333
./test_put_employee.sh 333 mozart.json
./test_get_employee_by_id.sh 333
./test_get_employees.sh
```

### Example DELETE

```
./test_get_employees.sh
./test_delete_employee_by_id.sh 333
./test_get_employees.sh
```
