package com.employee.service;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;

import com.employee.enums.LeaveType;
import com.employee.model.EmployeeInfo;
import com.employee.model.LeaveManagement;
import com.employee.repository.EmployeeInfoRepository;
import com.employee.repository.LeaveManagementRepository;

@Service
public class LeaveManagementService {

	private LeaveManagementRepository leaveManagementRepository;
	private EmployeeInfoRepository employeeInfoRepository;

	public void calculateLeave(Long empId, LeaveType leaveType, LocalDate first, LocalDate last) {
		EmployeeInfo employeeInfo = employeeInfoRepository.findOne(empId);
		LeaveManagement leaveManagement = leaveManagementRepository.findOne(employeeInfo.getLeaveId().getLeaveId());

		int days = Days.daysBetween(first, last).getDays();
		int leave = days + 1;

		if (leaveType == LeaveType.SickLeave) {
			if ((leaveManagement.getSickleave() + leave) <= 8)
				leaveManagement.setSickleave(leaveManagement.getSickleave() + leave);
			else if ((leaveManagement.getSickleave() + leave) > 8) {
				leave = leaveManagement.getSickleave() + leave - 8;
				leaveManagement.setSickleave(8);

				if ((leaveManagement.getPriveLeave() + leave) <= 15)
					leaveManagement.setPriveLeave(leaveManagement.getPriveLeave() + leave);
				else if ((leaveManagement.getPriveLeave() + leave) > 15) {
					leave = (leaveManagement.getPriveLeave() + leave) - 15;
					leaveManagement.setPriveLeave(15);

					leaveManagement.setPaidLeave(leave);
				}
			}
		}

		else if (leaveType == LeaveType.CasualLeave) {
			if ((leaveManagement.getCasualLeave() + leave) <= 2)
				leaveManagement.setCasualLeave(leaveManagement.getCasualLeave() + leave);
			else if ((leaveManagement.getCasualLeave() + leave) >= 2) {
				leave = leaveManagement.getCasualLeave() + leave - 2;
				leaveManagement.setCasualLeave(2);

				if ((leaveManagement.getPriveLeave() + leave) <= 15)
					leaveManagement.setPriveLeave(leaveManagement.getPriveLeave() + leave);
				else if ((leaveManagement.getPriveLeave() + leave) > 15) {
					leave = (leaveManagement.getPriveLeave() + leave) - 15;
					leaveManagement.setPriveLeave(15);

					leaveManagement.setPaidLeave(leave);
				}
			}
		}

		else if (leaveType == LeaveType.PriveLeave) {
			if ((leaveManagement.getPriveLeave() + leave) <= 15)
				leaveManagement.setPriveLeave(leaveManagement.getPriveLeave() + leave);
			else if ((leaveManagement.getPriveLeave() + leave) > 15) {
				leave = (leaveManagement.getPriveLeave() + leave) - 15;
				leaveManagement.setPriveLeave(15);

				leaveManagement.setPaidLeave(leave);
			}
		}

		else if (leaveType == LeaveType.Civil) {
			if ((leaveManagement.getCivil() + leave) <= 1)
				leaveManagement.setCivil(leaveManagement.getCivil() + leave);
		}

		else if (leaveType == LeaveType.Maternity) {
			if (leave <= 182)
				leaveManagement.setMaternity(leave);
			else if (leave > 182) {
				leaveManagement.setMaternity(182);
				leave = leave - 182;

				if ((leaveManagement.getPriveLeave() + leave) <= 15)
					leaveManagement.setPriveLeave(leaveManagement.getPriveLeave() + leave);
				else if ((leaveManagement.getPriveLeave() + leave) > 15) {
					leave = (leaveManagement.getPriveLeave() + leave) - 15;
					leaveManagement.setPriveLeave(15);

					leaveManagement.setPaidLeave(leave);
				}
			}
		}

		else if (leaveType == LeaveType.Paternity) {
			if (leave <= 5)
				leaveManagement.setMaternity(leave);
			else if (leave > 5) {
				leaveManagement.setMaternity(5);
				leave = leave - 5;

				if ((leaveManagement.getPriveLeave() + leave) <= 15)
					leaveManagement.setPriveLeave(leaveManagement.getPriveLeave() + leave);
				else if ((leaveManagement.getPriveLeave() + leave) > 15) {
					leave = (leaveManagement.getPriveLeave() + leave) - 15;
					leaveManagement.setPriveLeave(15);

					leaveManagement.setPaidLeave(leave);
				}
			}
		}

		else if (leaveType == LeaveType.Marriage) {
			if (leave <= 15)
				leaveManagement.setMaternity(leave);
			else if (leave > 15) {
				leaveManagement.setMaternity(15);
				leave = leave - 15;

				if ((leaveManagement.getPriveLeave() + leave) <= 15)
					leaveManagement.setPriveLeave(leaveManagement.getPriveLeave() + leave);
				else if ((leaveManagement.getPriveLeave() + leave) > 15) {
					leave = (leaveManagement.getPriveLeave() + leave) - 15;
					leaveManagement.setPriveLeave(15);

					leaveManagement.setPaidLeave(leave);
				}
			}
		}

		else if (leaveType == LeaveType.PaidLeave) {
			leaveManagement.setPaidLeave(leave);
		}
	}
}
