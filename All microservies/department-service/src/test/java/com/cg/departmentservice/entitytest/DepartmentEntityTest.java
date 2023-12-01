package com.cg.departmentservice.entitytest;
import org.junit.jupiter.api.Test;

import com.cg.departmentservice.entity.Department;

import static org.assertj.core.api.Assertions.assertThat;
 
public class DepartmentEntityTest {
 
    @Test
    public void testCreateDepartment() {
        Department department = new Department();
        assertThat(department).isNotNull();
    }
 
    @Test
    public void testDepartmentProperties() {
        Department department = new Department();
        department.setDepartmentName("Engineering");
        department.setDepartmentDescription("Software Development");
        department.setDepartmentCode("ENG");
 
        assertThat(department.getDepartmentName()).isEqualTo("Engineering");
        assertThat(department.getDepartmentDescription()).isEqualTo("Software Development");
        assertThat(department.getDepartmentCode()).isEqualTo("ENG");
    }
 
    @Test
    public void testDepartmentEquality() {
        Department department1 = new Department(1L, "Engineering", "Software Development", "ENG");
        Department department2 = new Department(1L, "Engineering", "Software Development", "ENG");
        Department department3 = new Department(2L, "Marketing", "Digital Marketing", "MKT");
 
        assertThat(department1).isEqualTo(department2);
        assertThat(department1).isNotEqualTo(department3);
    }
}