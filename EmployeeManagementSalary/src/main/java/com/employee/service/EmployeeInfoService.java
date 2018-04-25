package com.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.model.DesigSal;
import com.employee.model.EmployeeInfo;
import com.employee.repository.DesigSalRepository;
import com.employee.repository.EmployeeInfoRepository;
import com.employee.wrapper.EmployeeInfoDto;

/**
 * 
 * service for employeeInfo
 * 
 * @author mohit arya
 * @version 1.0
 *
 */
@Service
public class EmployeeInfoService {

	private EmployeeInfoRepository employeeInfoRepository;
	private DesigSalRepository desigSalRepository;

	/**
	 * @param employeeInfoRepository
	 * @param desigSalRepository
	 */
	@Autowired
	public EmployeeInfoService(EmployeeInfoRepository employeeInfoRepository, DesigSalRepository desigSalRepository) {
		this.employeeInfoRepository = employeeInfoRepository;
		this.desigSalRepository = desigSalRepository;
	}

	public void addEmployeeInfo(EmployeeInfoDto employeeInfoDto) throws Exception {
		EmployeeInfo employeeInfo = getEmployeeInfo(employeeInfoDto);
		DesigSal desigSal = desigSalRepository.findOne(employeeInfo.getDesignation().getDesignation());
		if (desigSal == null) {
			throw new Exception("Designation Not Given");
		}
		employeeInfo.setDesignation(desigSal);

		employeeInfoRepository.save(employeeInfo);
	}

	private EmployeeInfo getEmployeeInfo(EmployeeInfoDto employeeInfoDto) {
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setEmpID(employeeInfoDto.getEmpID());
		employeeInfo.setFirstName(employeeInfoDto.getFirstName());
		employeeInfo.setLastName(employeeInfoDto.getLastName());
		employeeInfo.setGender(employeeInfoDto.getGender());
		employeeInfo.setDob(employeeInfoDto.getDob());
		employeeInfo.setEmailId(employeeInfoDto.getEmailId());
		// employeeInfo.setDesignation(employeeInfoDto.getDesignation());
		employeeInfo.setAddress(employeeInfoDto.getAddress());
		employeeInfo.setPhone(employeeInfoDto.getPhone());
		employeeInfo.setDoj(employeeInfoDto.getDoj());

		try {
			employeeInfo.setReportingManager(employeeInfoRepository.findOne(employeeInfoDto.getRepId()));
		} catch (NullPointerException e) {
		}

		employeeInfo.setUserId(employeeInfoDto.getUserId());
		employeeInfo.setLeaveId(employeeInfoDto.getLeaveId());
		return employeeInfo;
	}

	private EmployeeInfoDto getEmployeeInfoDto(EmployeeInfo employeeInfo) {
		EmployeeInfoDto employeeInfoDto = new EmployeeInfoDto();
		employeeInfoDto.setEmpID(employeeInfo.getEmpID());
		employeeInfoDto.setFirstName(employeeInfo.getFirstName());
		employeeInfoDto.setLastName(employeeInfo.getLastName());
		employeeInfoDto.setGender(employeeInfo.getGender());
		employeeInfoDto.setDob(employeeInfo.getDob());
		employeeInfoDto.setEmailId(employeeInfo.getEmailId());
		// employeeInfoDto.setDesignation(employeeInfo.getDesignation());
		employeeInfoDto.setAddress(employeeInfo.getAddress());
		employeeInfoDto.setPhone(employeeInfo.getPhone());
		employeeInfoDto.setDoj(employeeInfo.getDoj());
		// if (employeeInfo.getReportingManager() != null) {
		// employeeInfoDto.setRepId(employeeInfo.getReportingManager().getEmpID());
		// }

		employeeInfoDto.setUserId(employeeInfo.getUserId());
		employeeInfoDto.setLeaveId(employeeInfo.getLeaveId());
		return employeeInfoDto;
	}

	/**
	 * @return all employee info
	 */
	public List<EmployeeInfoDto> getAllEmployeeInfo() {
		// List<EmployeeInfoDto> employeeInfoDtoList =
		// employeeInfoRepository.findAll().stream()
		// .map(employeeInfo ->
		// getEmployeeInfoDto(employeeInfo)).collect(Collectors.toList());
		// System.out.println("employeeInfoDtoList is : " + employeeInfoDtoList);
		return employeeInfoRepository.findAll().stream().map(dt -> new EmployeeInfoDto(dt))
				.collect(Collectors.toList());

	}

	/**
	 * @param id
	 * @return employee info with particular id
	 */
	public EmployeeInfo getEmployeeInfo(Long id) {
		return employeeInfoRepository.findOne(id);
	}

	/**
	 * @param id
	 * 
	 *            delete the user with the matching id
	 */
	public void deleteEmployeeInfo(Long id) {
		employeeInfoRepository.delete(id);
	}

	/**
	 * @param id
	 * @param employeeInfo
	 * @return updated employee info
	 */
	public ResponseEntity<EmployeeInfo> updateEmployeeInfo(Long id, EmployeeInfo employeeInfo) {
		EmployeeInfo employee = employeeInfoRepository.findOne(id);

		if (employee == null) {
			return ResponseEntity.notFound().build();
		}

		employee.setFirstName(employee.getFirstName());
		employee.setLastName(employee.getLastName());
		employee.setAddress(employee.getAddress());
		employee.setDesignation(employee.getDesignation());
		employee.setDob(employee.getDob());
		employee.setDoj(employee.getDoj());
		employee.setEmailId(employee.getEmailId());
		employee.setGender(employee.getGender());
		employee.setUserId(employee.getUserId());
		employee.setPhone(employee.getPhone());
		employee.setReportingManager(employee.getReportingManager());
		employee.setLeaveId(employee.getLeaveId());
		EmployeeInfo update = employeeInfoRepository.save(employee);

		return ResponseEntity.ok(update);
	}
}
