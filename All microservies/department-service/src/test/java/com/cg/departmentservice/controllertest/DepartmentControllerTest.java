package com.cg.departmentservice.controllertest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cg.departmentservice.controller.DepartmentController;
import com.cg.departmentservice.dto.DepartmentDto;
import com.cg.departmentservice.service.DepartmentService;

public class DepartmentControllerTest {

    @Mock
    private DepartmentService departmentService;

    @InjectMocks
    private DepartmentController departmentController;

    public DepartmentControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveDepartment() {
        // Mock input data
        DepartmentDto departmentDto = new DepartmentDto();
        // Set up your departmentDto here...

        // Mock service method behavior
        when(departmentService.saveDepartment(departmentDto)).thenReturn(departmentDto);

        // Perform the controller action
        ResponseEntity<DepartmentDto> response = departmentController.saveDepartment(departmentDto);

        // Validate the response
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(departmentDto, response.getBody());
    }

    @Test
    public void testGetDepartment() {
        // Mock department code
        String departmentCode = "exampleCode";

        // Mock service method behavior
        DepartmentDto departmentDto = new DepartmentDto();
        // Set up your departmentDto here...
        when(departmentService.getDepartmentByCode(departmentCode)).thenReturn(departmentDto);

        // Perform the controller action
        ResponseEntity<DepartmentDto> response = departmentController.getDepartment(departmentCode);

        // Validate the response
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(departmentDto, response.getBody());
    }
}
