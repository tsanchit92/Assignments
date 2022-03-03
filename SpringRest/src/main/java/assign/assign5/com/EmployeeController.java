package assign.assign5.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService eS;

    @GetMapping("/employees")

    private List<Employee> getFlightsList() {
        return eS.getList();
    }

    @GetMapping("/employees/{id}")
    private Employee getEmployees(@PathVariable("id") int id) {
        return eS.getById(id);
    }
    @DeleteMapping("/employees/{id}")
    private ResponseEntity<?> deleteEmployees(@PathVariable("id") int id) {
        eS.delete(id);
        return new ResponseEntity<>("Success" + id, HttpStatus.OK);
    }

    @PostMapping("/employees")
    private ResponseEntity<?> saveEmployees(@RequestBody Employee employee) {
        eS.saveOrUpdate(employee);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PutMapping("/employees")
    private ResponseEntity<?> updateEmployees(@RequestBody Employee employee) {
        eS.saveOrUpdate(employee);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

}
