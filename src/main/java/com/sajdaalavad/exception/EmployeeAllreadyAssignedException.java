package com.sajdaalavad.exception;

import java.text.MessageFormat;

public class EmployeeAllreadyAssignedException extends RuntimeException{
    public EmployeeAllreadyAssignedException(final Long employeeid,final Long companyid)
    {
        super(MessageFormat.format("employee:{0} is already assigned to company:{1}", employeeid,companyid));

    }
}
