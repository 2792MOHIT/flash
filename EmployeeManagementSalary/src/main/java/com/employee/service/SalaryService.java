package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.EmployeeInfo;
import com.employee.model.Salary;
import com.employee.repository.DesigSalRepository;
import com.employee.repository.EmployeeInfoRepository;
import com.employee.repository.LeaveManagementRepository;
import com.employee.repository.SalaryRepository;

@Service
public class SalaryService {

	private EmployeeInfoRepository employeeInfoRepository;
	private LeaveManagementRepository leaveManagementRepository;
	private DesigSalRepository desigSalRepository;
	private SalaryRepository salaryRepository;

	@Autowired
	public SalaryService(EmployeeInfoRepository employeeInfoRepository,
			LeaveManagementRepository leaveManagementRepository, DesigSalRepository desigSalRepository,
			SalaryRepository salaryRepository) {
		this.employeeInfoRepository = employeeInfoRepository;
		this.leaveManagementRepository = leaveManagementRepository;
		this.desigSalRepository = desigSalRepository;
		this.salaryRepository = salaryRepository;
	}

	public void calculateSalary() {
		List<EmployeeInfo> listEmployee = employeeInfoRepository.findAll();
		float basicSal, ta, hra, perDaySal, totalSal;
		int paidLeave;
		Salary sal = new Salary();

		for (EmployeeInfo e : listEmployee) {
			paidLeave = leaveManagementRepository.findOne(e.getLeaveId().getLeaveId()).getPaidLeave();
			basicSal = desigSalRepository.findOne(e.getDesignation().getDesignation()).getBasicSal();

			ta = basicSal * 0.03f;
			hra = basicSal * 0.007f;

			totalSal = basicSal + hra + ta;
			perDaySal = totalSal / 30;

			totalSal = totalSal - (perDaySal * paidLeave);

			sal.setSalary(totalSal);
			sal.setEmpId(e.getEmpID());

			salaryRepository.save(sal);
		}

	}
}
