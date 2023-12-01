package net.javaguides.departmentservice.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cg.departmentservice.dto.DepartmentDto;
import com.cg.departmentservice.entity.Department;
import com.cg.departmentservice.mapper.DepartmentMapper;
import com.cg.departmentservice.repository.DepartmentRepository;
import com.cg.departmentservice.service.impl.DepartmentServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
 
public class DepartmentServiceImplTest {
 
    @Mock
    private DepartmentRepository departmentRepository;
 
    @InjectMocks
    private DepartmentServiceImpl departmentService;
 
    private Department department;
 
    private DepartmentDto departmentDto;
 
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
 
        department = new Department(1L, "TestName", "TestDescription", "TestCode");
        departmentDto = new DepartmentDto(1L, "TestName", "TestDescription", "TestCode");
    }
 
    @Test
    public void testSaveDepartment() {
        when(DepartmentMapper.mapToDepartment(departmentDto)).thenReturn(department);
        when(departmentRepository.save(department)).thenReturn(department);
        when(DepartmentMapper.mapToDepartmentDto(department)).thenReturn(departmentDto);
        DepartmentDto savedDto = departmentService.saveDepartment(departmentDto);
 
        verify(departmentRepository).save(any(Department.class));
        assertEquals(departmentDto.getDepartmentName(), savedDto.getDepartmentName());
    }
 
    @Test
    public void testGetDepartmentByCode() {
        when(departmentRepository.findByDepartmentCode(department.getDepartmentCode())).thenReturn(department);
        when(DepartmentMapper.mapToDepartmentDto(department)).thenReturn(departmentDto);
        DepartmentDto retrievedDto = departmentService.getDepartmentByCode(department.getDepartmentCode());
 
        verify(departmentRepository).findByDepartmentCode(department.getDepartmentCode());
        assertEquals(departmentDto.getDepartmentName(), retrievedDto.getDepartmentName());
    }
}